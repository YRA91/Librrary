public class Librarian { // numele clasei

    private String name;
    private int age;
    private String sex;
    private double salary;
    private String shift;
    private int daysOff;

    public Librarian (String name, int age, String sex, double salary, String shift, int daysoff) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.shift = shift;
        this.daysOff = daysOff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public int getDaysOff() {
        return daysOff;
    }

    public void setDaysOff(int daysOff) {
        this.daysOff = daysOff;
    }
}
