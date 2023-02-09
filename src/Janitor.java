public class Janitor extends Employee{
    boolean hasKeys;
    boolean hasTools;
    public Janitor(String name, int salary, String emailAsUsername, String passWord, String jobDescription, boolean hasKeys, boolean hasTools) {
        super(name, salary, emailAsUsername, passWord, jobDescription);
        this.hasKeys = hasKeys;
        this.hasTools = hasTools;
    }
}
