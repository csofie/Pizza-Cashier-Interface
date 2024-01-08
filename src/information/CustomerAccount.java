
package information;

public class CustomerAccount extends Account {
    
    private String email;
    private String regularOrder;
    
    public CustomerAccount(String email, String name) {
        super(name);
        this.email = email;
    }
    
    public CustomerAccount(String email, String name, String notes, String regular) {
        super(name);
        super.setNotes(notes);
        this.email = email;
        regularOrder = regular;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getRegular() {
        return regularOrder;
    }
    
    public void setRegular(String regularOrder) {
        this.regularOrder = regularOrder;
    }
}
