public class Headmaster extends Employee{
    boolean hasNiceOffice;

    public Headmaster(String name, int salary, String emailAsUsername, String passWord, String jobDescription, boolean hasNiceOffice) {
        super(name, salary, emailAsUsername, passWord, jobDescription);
        this.hasNiceOffice = hasNiceOffice;
    }
}
