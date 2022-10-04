public class Food {
    private String foodName;
    private String foodDescription;
    private boolean healthyOrNot;


    public Food(String foodName, boolean healthyOrNot, String foodDescription){
        this.foodName = foodName;
        this.healthyOrNot = healthyOrNot;
        this.foodDescription = foodDescription;
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
        return foodDescription+": "+foodName;
    }

}
