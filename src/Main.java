
import java.util.InputMismatchException;

import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
  public static TeleBook teleBook =new TeleBook();
    public static void main(String[] args) {
        teleBook = ReadAenWrite.read();


        System.out.println("Ilosc zapisanych kontktow  " + teleBook.contackMap.size());


        Option option;

        do {
            printOptions();


            option = enterOption();

            switch (option) {
                case ADD -> teleBook.addNewcotact();

                case SCHERCH_BY_NAME -> teleBook.findContactByName();

                case REMOVE -> teleBook.removeContact();
                case ALL -> teleBook.all();

                case EXIT -> exit();

            }


        }  while (option != Option.EXIT) ;

        }



    private static Option enterOption() {
        Option option = null;
        boolean error = true;
        while (error)
            try {
                option = Option.convertToOption(sc.nextInt());

                error = false;

            } catch (WrongOption | InputMismatchException e) {
                System.out.println(e.getMessage());

            }
        return option;
    }


    private static void printOptions(){
            for (Option o:Option.values()
                 ) {
                System.out.println(o);

            }
        }
        private static void exit(){
       ReadAenWrite.write(teleBook);
       sc.close();
        }

        }




    enum Option {
        ADD(0, "Dodaj kontakt"), SCHERCH_BY_NAME(1, "Wyszukaj kontakt po imieniu i nazwisku"),
        SCHERCH_BY_NUMBER(2, "Wyszukaj kontakt po nr. telefonu"), REMOVE(3, "Usun kontakt"),
        ALL(4, "Wyswietl wszystkie kontakty"), EXIT(5, "Wyjscie");
        private final int options;
        private final String descryption;

        Option(int options, String descryption) {
            this.options = options;
            this.descryption = descryption;
        }

        @Override
        public String toString() {
            return
                    options + "-> "
                            + descryption;
        }

         static Option convertToOption(int option) {

            try {

                    return values()[option];


            }catch (ArrayIndexOutOfBoundsException e){
                throw new WrongOption("Bledna opcja");

            }
        }
    }
