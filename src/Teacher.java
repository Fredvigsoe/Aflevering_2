public class Teacher extends Employee{
    String name;
    int salary;
    String emailAsUsername;
    String passWord;
    String jobDescription;
    String classes;

    public Teacher(String name, int salary, String emailAsUsername, String passWord, String jobDescription, String classes) {
        super(name, salary, emailAsUsername, passWord, jobDescription);
        this.classes = classes;
    }



}
