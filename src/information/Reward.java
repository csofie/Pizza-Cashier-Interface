
package information;

public class Reward {
    
    private String code;
    private String criteria;
    private String reward;
    private double multiplier;
    
    //reward is descripter of multiplier
    
    public Reward(String rewardCode, String rewardCriteria, String rewardGain, double gainMultiplier) {
        code = rewardCode;
        criteria = rewardCriteria;
        reward = rewardGain;
        multiplier = gainMultiplier;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getCriteria() {
        return criteria;
    }
    
    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }
    
    public String getRewardInfo() {
        return reward;
    }
    
    public void setRewardInfo(String reward) {
        this.reward = reward;
    }
    
    public double getMultiplier() {
        return multiplier;
    }
    
    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }
}
