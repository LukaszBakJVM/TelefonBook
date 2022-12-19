import java.util.Objects;

public class Contacts {
    private String firstName;
    private String lastName;
    private int telephonNumber;

    public Contacts() {
    }

    public Contacts(String firstName, String lastName, int telephonNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephonNumber = telephonNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTelephonNumber() {
        return telephonNumber;
    }

    public void setTelephonNumber(int telephonNumber) {
        this.telephonNumber = telephonNumber;
    }

    @Override
    public String toString() {
        return
                "Imie: " + firstName +
                        "   Nazwisko: " + lastName +
                        "   Numer telefonu:  " + telephonNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacts contacts = (Contacts) o;
        return telephonNumber == contacts.telephonNumber && Objects.equals(firstName, contacts.firstName) && Objects.equals(lastName, contacts.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, telephonNumber);
    }

    public String toCSV() {
        return firstName + " " + lastName + " " + telephonNumber;
    }
    String key(){
        return firstName+lastName;
    }



    }
