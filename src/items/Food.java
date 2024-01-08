
package items;

import java.util.ArrayList;


public class Food {
    //attributes
    private String name;
    private String description;
    private ArrayList<String> ingredients = new ArrayList<>();
    private String imageDirectory;
    private double price;
    private String type;
    private int sqlIndex;
    
    public Food(String name, String desc, String imgDirect, double price, String type) {
        this.name = name;
        description = desc;
        imageDirectory = imgDirect;
        this.price = price;
        this.type = type;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String desc) {
        description = desc;
    }
    
    
    public String getImageDirectory() {
        return imageDirectory;
    }
    
    public void setImageDirectory(String image) {
        imageDirectory = image;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public int getSQLIndex() {
        return sqlIndex;
    }
    
    public void setSQLIndex(int index) {
        sqlIndex = index;
    }
    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }
    
    public boolean removeIngredient(String ingredient) {
        for(int i = 0; i < ingredients.size(); i++) {

            if(ingredients.get(i).equals(ingredient.trim())) {
                ingredients.remove(i);
                return true;
            
            }
        }
        return false;
    }
    
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    
    public void setIngredients(ArrayList<String> ingredientsList) {
        ingredients = ingredientsList;
    }
    
}
