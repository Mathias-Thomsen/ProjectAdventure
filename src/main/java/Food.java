public class Food {
    private String foodName;
    private String foodDescription;
    private boolean healthyOrNot;


    public Food(String foodName){
        this.foodName = foodName;
    }

    public Food(String foodName, boolean healthyOrNot){
        this.foodName = foodName;
        this.healthyOrNot = healthyOrNot;
    }

    public Food(){
    }

    public boolean isHealthyOrNot(){
        return healthyOrNot;
    }


    public String getFoodName(){
        return foodName.toLowerCase();
    }

    public String toString(){
        return foodName;
    }

}
