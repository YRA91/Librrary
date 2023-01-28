import java.util.ArrayList;

public class LibrrarySystem { // numele clasei

    private ArrayList<Librarian> librariansList;
    private ArrayList<Books> booksList;
    private ArrayList<Customer> customerList;
    private int nrBooks;
    private int nrEmployee;
    private int nrBorrowedBooks;

    // mai jos am creat constructorul ca un parametru cu numele clasei.
    public LibrrarySystem (ArrayList<Librarian> librariansList, ArrayList<Books> booksList, ArrayList<Customer> customerList,
                           int nrBooks, int nrEmployee, int nrBorrowedBooks){  // Ia intreaga lista ca parametru

     this.librariansList = librariansList;
     this.booksList = booksList;
     this.customerList = customerList;
     this.nrBooks = nrBooks;
     this.nrEmployee = nrEmployee;
     this.nrBorrowedBooks = nrBorrowedBooks;

    }
    // adauga listei
     public LibrrarySystem(Librarian librarian, Books book, Customer customer){
         this.librariansList.add(librarian);
}

 public ArrayList<Librarian> getLibrariansList() {
  return librariansList;
 }

 public void setLibrariansList(ArrayList<Librarian> librariansList) {
  this.librariansList = librariansList;
 }

 public ArrayList<Books> getBooksList() {
  return booksList;
 }

 public void setBooksList(ArrayList<Books> booksList) {
  this.booksList = booksList;
 }

 public ArrayList<Customer> getCustomerList() {
  return customerList;
 }

 public void setCustomerList(ArrayList<Customer> customerList) {
  this.customerList = customerList;
 }

 public int getNrBooks() {
  return nrBooks;
 }

 public void setNrBooks(int nrBooks) {
  this.nrBooks = nrBooks;
 }

 public int getNrEmployee() {
  return nrEmployee;
 }

 public void setNrEmployee(int nrEmployee) {
  this.nrEmployee = nrEmployee;
 }

 public int getNrBorrowedBooks() {
  return nrBorrowedBooks;
 }

 public void setNrBorrowedBooks(int nrBorrowedBooks) {
  this.nrBorrowedBooks = nrBorrowedBooks;
 }
}
