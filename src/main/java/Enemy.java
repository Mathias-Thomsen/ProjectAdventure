public class Enemy {
    private String enemyName;
    private String enemyDescription;
    private int enemyHealth;

    public Enemy(int enemyHealth){
        this.enemyHealth = enemyHealth;
    }
    public Enemy(String enemyName, String enemyDescription, int enemyHealth){
        this.enemyHealth = enemyHealth;
        this.enemyName = enemyName;
        this.enemyDescription = enemyDescription;
    }


    public double enemyDamage(){
        return enemyHealth = getEnemyHealth() - 20;
    }


    //Getter
    public int getEnemyHealth() {
        return enemyHealth;
    }
    public String getEnemyDescription(){
        return enemyDescription;
    }


    //toString
    public String toString() {
        return  enemyName;
    }


}

