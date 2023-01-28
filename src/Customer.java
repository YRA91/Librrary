import java.util.ArrayList;

public class Customer { // numele clasei

    private int age;
    private ArrayList<Books> booksList;
    private String name;
    private String eMail;
    private double telephone;
    private String address;
    private String penalties;

    public Customer (int age, ArrayList<Books> booksList, String name, String eMail, double telephone,String address, String penalties){

        this.age = age;
        this.booksList = booksList;
        this.name = name;
        this.eMail = eMail;
        this.telephone = telephone;
        this.address = address;
        this.penalties = penalties;


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Books> getBooksList() {
        return booksList;
    }

    public void setBooksList(ArrayList<Books> booksList) {
        this.booksList = booksList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public double getTelephone() {
        return telephone;
    }

    public void setTelephone(double telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPenalties() {
        return penalties;
    }

    public void setPenalties(String penalties) {
        this.penalties = penalties;
    }
}
