
package information;

import items.Food;
import java.util.ArrayList;


public class accountsAndOrders {
    
    private static Account manager;
    private static ArrayList<Account> Staff = new ArrayList<>();
    private static ArrayList<CustomerAccount> Customer = new ArrayList<>();
    private static ArrayList<Reward> rewards = new ArrayList<>();
    
    private static ArrayList<Food> spPizzas = new ArrayList<>();
    private static ArrayList<Food> hotDrinks = new ArrayList<>();
    private static ArrayList<Food> coldDrinks = new ArrayList<>();
    private static ArrayList<Food> shakes = new ArrayList<>();
    private static ArrayList<Food> cookies = new ArrayList<>();
    private static ArrayList<Food> iceCream = new ArrayList<>();
    private static ArrayList<Food> spSalads = new ArrayList<>();
    private static ArrayList<Food> sauces = new ArrayList<>();
    private static ArrayList<Food> allFoods = new ArrayList<>();
    
    private static ArrayList<String> currentOrder = new ArrayList<>();
    private static ArrayList<Double> currentPrices = new ArrayList<>();
    private static ArrayList<Double> currentRewards = new ArrayList<>();
    
    public static Account getManagerAcc() {
        return manager;
    }
    
    public static void setManagerAcc(Account manag) {
        manager = manag;
    }
    
    public static ArrayList<Account> getStaffAccs() {
        return Staff;
    }
    
    public static ArrayList<CustomerAccount> getCustomerAccs() {
        return Customer;
    }
        
    public static ArrayList<String> getCurrentOrder() {
        return currentOrder;
    }
    
    public static void addOrderItem(String item) {
        currentOrder.add(item);
    }
    
    public static ArrayList<Double> getCurrentPrices() {
        return currentPrices;
    }
    
    public static void addPrice(Double price) {
        currentPrices.add(price);
    }
    
    public static ArrayList<Double> getCurrentRewards() {
        return currentRewards;
    }
    
    public static void addOrderReward(Double multiplier) {
        currentRewards.add(multiplier);
    }
    
    public static ArrayList<Reward> getRewards() {
        return rewards;
    }
    
    public static ArrayList<Food> getAllFoods() {
        return allFoods;
    }
    
    public static ArrayList<Food> getSpPizzas() {
        return spPizzas;
    }
    
    public static ArrayList<Food> getHotDrinks() {
        return hotDrinks;
    }
    
    public static ArrayList<Food> getColdDrinks() {
        return coldDrinks;
    }
    
    public static ArrayList<Food> getShakes() {
        return shakes;
    }
    
    public static ArrayList<Food> getIceCream() {
        return iceCream;
    }
    
    public static ArrayList<Food> getCookies() {
        return cookies;
    }
    
    public static ArrayList<Food> getSpSalads() {
        return spSalads;
    }
    
    public static ArrayList<Food> getSauces() {
        return sauces;
    }
    
    public static boolean isManagerAccount(String user, String pass) {
        if(manager.getUsername().equals(user) && manager.getPassword().equals(pass)) {
            return true;
        }
        return false;
    }
    
    public static int findStaffAccount(String user, String pass) {
        for(int i = 0; i < Staff.size(); i++) {
            if(Staff.get(i).getUsername().equals(user) && Staff.get(i).getPassword().equals(pass)) {
                return i;
            }
        }
        return -1;
    }
    
    public static Account findStaffAccount(String user) {
        for(int i = 0; i < Staff.size(); i++) {
            if(Staff.get(i).getUsername().equals(user)) {
                return Staff.get(i);
            }
        }
        return null;
    }
    
    public static CustomerAccount findCustomerAccount(String email) {
        for(int i = 0; i < Customer.size(); i++) {
            if(Customer.get(i).getEmail().equals(email)) {
                return Customer.get(i);
            }
        }
        return null;
    }
    
    public static Reward findRewards(String code) {
        for(int i = 0; i < rewards.size(); i++) {
            if(rewards.get(i).getCode().equals(code)) {
                return rewards.get(i);
            }
        }
        return null;
    }
    
    public static Reward findRewardsByInfo(String reward) {
        for(int i = 0; i < rewards.size(); i++) {
            if(rewards.get(i).getRewardInfo().equals(reward)) {
                return rewards.get(i);
            }
        }
        return null;
    }
    
    public static void addStaff(Account acc) {
        Staff.add(acc);
    }
    
    public static void addCustomer(CustomerAccount acc) {
        Customer.add(acc);
    }
    
    public static void addReward(Reward coupon) {
        rewards.add(coupon);
    }
    
    public static int findFoodIndexInArraylist(ArrayList<Food> arr, Food item) {
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i).equals(item)) {
                return i;
            }
        }
        return -1;
    }
}
