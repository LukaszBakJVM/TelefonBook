import java.util.*;

public class TeleBook implements Iterable<Contack> {
    public TeleBook() {
    }

    public TeleBook(Map<String, Contack> contackMap) {
        this.contackMap = contackMap;
    }

    public      Map<String, Contack> contackMap = new HashMap<>();





    public Contack addNewcotact() {

        System.out.println("Podaj Imie");
        String firstname = Main.sc.next().toUpperCase();
        System.out.println("Podaj Nazwisko");
        String lastName = Main.sc.next().toUpperCase();
        System.out.println("Podaj  numer telefonu");
        int telefonNumber = Main.sc.nextInt();

        String key = firstname + lastName;
        if (!contackMap.containsKey(key)) {
            System.out.println("Taki wpis już istnieje");
        } else {
            return contackMap.put(key,new Contack(firstname,lastName,telefonNumber));





        }
        return contackMap.put(key, new Contack(firstname, lastName, telefonNumber));
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

            Contack contack = contackMap.get(key);
            System.out.println(contack);


        }
    }
    public void findByTelefon(){
        System.out.println("Podaj nr telefonu");
        int telephoneNumber=Main.sc.nextInt();
      //  Contack contack =contackMap.values().contains(telephoneNumber);
    }

    @Override
    public Iterator<Contack> iterator() {
        return contackMap.values().iterator();
    }
    public List<Contack> findByName(String name) {

        List<Contack> result = new ArrayList<>();
        for (var entry : contackMap.entrySet()) {
            if(entry.getKey().contains(name))
                result.add(entry.getValue());
        }
        return result;
    }

    public void all(){
        for (Contack all:contackMap.values()
             ) {
            System.out.println(all);

        }
    }
}