import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

public class ReadWriteObject {
  /*  private static final File file = new File("bazaDanych.csv");
    private TeleBook teleBook = new TeleBook();


    Map<String,Contact> readFile(){
        Map<String, Contact> contacts = new TreeMap<>();
        boolean cont = true;
        while(cont){
            try(
                    FileInputStream fileInputStream = new FileInputStream(file);
                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ) {
                Contact contact = (Contact) objectInputStream.readObject();
                if(contact != null){
                    contacts.put(contact.getName(), contact);
                }else{
                    cont = false;
                }
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Filed to read file");
            }
        }
        return contacts;
    }


    void writeFile()  {
        try(
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            Map<String, Contack> contacts = teleBook.getContacts();
            for (Contact value : contacts.values()) {
                objectOutputStream.writeObject(value);
            }
            System.out.println("Zapisano dane do pliku");
        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku");
        }*/

    }


