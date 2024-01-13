
package SQLinfo;


public class InformationTemplate {
    private static String username = "insert SQL local username here";
    private static String password = "insert SQL local password here";
    
    //username subject to change
    private static String url = "jdbc:mysql://localhost/foods";
    
    public static String getUsernameSQL() {
        return username;
    }
    
    public static String getPasswordSQL() {
        return password;
    }
    
    public static String getUrlSQL() {
        return url;
    }
}
