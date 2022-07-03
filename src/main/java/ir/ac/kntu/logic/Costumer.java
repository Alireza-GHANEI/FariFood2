package ir.ac.kntu.logic;

public class Costumer extends Admin {
    //

    private int telnumber;
    private String firstName;
    private String lastName;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelnumber(int telnumber) {
        this.telnumber = telnumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "telnumber=" + telnumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
