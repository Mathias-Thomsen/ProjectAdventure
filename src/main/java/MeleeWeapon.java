public class MeleeWeapon extends Weapon {


    public MeleeWeapon(String itemName, String itemDescription, int damage) {
        super(itemName, itemDescription, damage);
    }


    public int remainingAmmo(){
        return 0;
    }
}

