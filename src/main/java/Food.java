public class Food {
    private String foodName;
    private String foodDescription;


    public Food(String foodName){
        this.foodName = foodName;
    }

    public String getFoodName(){
        return foodName.toLowerCase();
    }

    public String toString(){
        return foodName;
    }

}
