public class ItAdmin extends Employee{
    boolean hasAdminRights;
    public ItAdmin(String name, int salary, String emailAsUsername, String passWord, String jobDescription, boolean hasAdminRights) {
        super(name, salary, emailAsUsername, passWord, jobDescription);
        this.hasAdminRights = hasAdminRights;
    }
}
