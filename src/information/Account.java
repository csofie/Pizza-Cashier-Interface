
package information;

public class Account {
    private String username;
    private String password;
    private String notes;
    
    public Account(String user, String pass) {
        username = user;
        password = pass;
    }
    
    public Account(String user, String pass, String notes) {
        username = user;
        password = pass;
        this.notes = notes;
    }
    
    public Account(String user) {
        username = user;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String user) {
        username = user;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String pass) {
        password = pass;
    }
    
    public void setNotes(String note) {
        notes = note;
    }
    
    public String getNotes() {
        return notes;
    }
}
