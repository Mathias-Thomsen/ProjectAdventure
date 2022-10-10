public abstract class Weapon extends Item {
    private int damage;
    private int ammo;

    public Weapon(String itemName, String itemDescription, int damage, int ammo) {
        super(itemName, itemDescription);
        this.damage = damage;
        this.ammo = ammo;
    }

    public int getDamage(){
        return damage;
    }

    public int remainingAmmo(){
        return ammo;
    }
}
