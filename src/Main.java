import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
  public static TeleBook teleBook =new TeleBook();
    public static void main(String[] args) throws IOException {
        teleBook=   ReadAenWrite.read();


System.out.println("Ilosc zapisanych kontktow  "+teleBook.contackMap.size());







        Option option;

do {
    printOptions();
    option=Option.convertToOption(sc.nextInt());
    switch (option){
        case ADD ->teleBook.addNewcotact();

        case SCHERCH_BY_NAME -> bynumber();

        case REMOVE -> teleBook.removeContact();
        case ALL -> teleBook.all();

        case EXIT ->exit();






    }

}while (option!=Option.EXIT);



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
        private static void bynumber(){
            System.out.println("podaj nazwe");
            String name=sc.next().toUpperCase();
            List<Contack>contacks=teleBook.findByName(name);
            contacks.forEach(System.out::println);
        }

    }


    enum Option{
        ADD(0,"Dodaj kontakt"),SCHERCH_BY_NAME(1,"Wyszukaj kontakt po imieniu i nazwisku"),
        SCHERCH_BY_NUMBER(2,"Wyszukaj kontakt po nr. telefonu"),REMOVE(3,"Usun kontakt"),
       ALL(4,"Wyswietl wszystkie kontakty") ,EXIT(5,"Wyjscie");
        private final int options;
        private final String descryption;

        Option(int options, String descryption) {
            this.options = options;
            this.descryption = descryption;
        }

        @Override
        public String toString() {
            return
                    options +"-> "
                     + descryption ;
        }
        static Option convertToOption(int option) {
            if(option >= values().length || option < 0)
                throw new NoSuchElementException();
            return values()[option];
        }

}