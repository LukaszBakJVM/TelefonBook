import java.util.*;

public class TeleBook implements Iterable<Contacts> {



    public      Map<String, Contacts> contackMap = new HashMap<>();

    public TeleBook() {
    }

    public TeleBook(Map<String, Contacts> contackMap) {
        this.contackMap = contackMap;
    }

    public Contacts addNewcotact() {

        System.out.println("Podaj Imie");
        String firstname = Main.sc.next().toUpperCase();
        System.out.println("Podaj Nazwisko");
        String lastName = Main.sc.next().toUpperCase();
        System.out.println("Podaj  numer telefonu");
        int telephonNumber = Main.sc.nextInt();

        String key = firstname + lastName;
        if (!contackMap.containsKey(key)) {
            System.out.println("Taki wpis już istnieje");
        } else {
         //   return contackMap.put(key,new Contacts(firstname,lastName,telefonNumber));





        }
        return contackMap.put(key, new Contacts(firstname, lastName, telephonNumber));
    }





    public void removeContact() {
        System.out.println("Podaj imie");
        String firstName = Main.sc.next().toUpperCase();
        System.out.println("Podaj Nazwisko");
        String lastName = Main.sc.next().toUpperCase();
        String key = firstName + lastName;
        if (!contackMap.containsKey(key)) {
            System.out.println("Brak uzytkownika");
        } else {
            contackMap.remove(key);
            System.out.println("Usunieto wpis");

        }
    }

    public void findContactByName() {
        System.out.println("Podaj imie");
        String firstName = Main.sc.next().toUpperCase();
        System.out.println("Podaj Nazwisko");
        String lastName = Main.sc.next().toUpperCase();
        String key = firstName + lastName;
        if (!contackMap.containsKey(key)) {
            System.out.println("brak uzytkownika");
        } else {

            Contacts contacts = contackMap.get(key);
            System.out.println(contacts);


        }
    }
    public void findByTelefon(){
        System.out.println("Podaj nr telefonu");
        int telephoneNumber=Main.sc.nextInt();
      //  Contack contack =contackMap.values().contains(telephoneNumber);
    }

    @Override
    public Iterator<Contacts> iterator() {
        return contackMap.values().iterator();
    }



    public void all(){
        for (Contacts all:contackMap.values()
             ) {
            System.out.println(all);

        }
    }
}