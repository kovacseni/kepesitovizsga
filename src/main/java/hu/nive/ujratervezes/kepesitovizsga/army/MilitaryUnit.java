package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    protected int hitPoints;
    protected int damagePoints;
    protected boolean hasArmor;

    public MilitaryUnit() {
        this.hasArmor = false;
    }

    public MilitaryUnit(boolean hasArmor) {
        this.hasArmor = hasArmor;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public abstract int doDamage();

    public abstract void sufferDamage(int damage);
}
