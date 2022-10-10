public class MeleeWeapon extends Weapon {
private int ammo;

    public MeleeWeapon(String itemName, String itemDescription, int damage, int ammo) {
        super(itemName, itemDescription, damage, ammo);
    }


    public int remainingAmmo(){
        return ammo;
    }
}

