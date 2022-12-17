import java.util.Iterator;
import java.util.Objects;

public class Contack {
    private String firstName;
    private String lastName;
    private int telephnNumber;

    public Contack() {
    }

    public Contack(String firstName, String lastName, int telephnNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephnNumber = telephnNumber;
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

    public int getTelephnNumber() {
        return telephnNumber;
    }

    public void setTelephnNumber(int telephnNumber) {
        this.telephnNumber = telephnNumber;
    }

    @Override
    public String toString() {
        return
                "Imie: " + firstName +
                        "   Nazwisko: " + lastName +
                        "   Numer telefonu:  " + telephnNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contack contack = (Contack) o;
        return telephnNumber == contack.telephnNumber && Objects.equals(firstName, contack.firstName) && Objects.equals(lastName, contack.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, telephnNumber);
    }

    public String toCSV() {
        return firstName + " " + lastName + " " + telephnNumber;
    }
    String key(){
        return firstName+lastName;
    }



    }
