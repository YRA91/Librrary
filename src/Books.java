public class Books { // numele clasei

    private int age;
    private System typ;
    private String title;
    private String author;
    private boolean isInStock;

    public Books (int age, System typ, String title,String author, boolean isInStock) {
        this.age = age;
        this.typ = typ;
        this.title = title;
        this.author = author;
        this.isInStock = isInStock;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public System getTyp() {
        return typ;
    }

    public void setTyp(System typ) {
        this.typ = typ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }
}
