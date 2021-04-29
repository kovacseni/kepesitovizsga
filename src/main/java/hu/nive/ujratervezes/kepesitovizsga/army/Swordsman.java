package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private Shield hasShield = Shield.YES;

    public Swordsman(boolean hasArmor) {
        super(hasArmor);
        this.hitPoints = 100;
        this.damagePoints = 10;
    }

    @Override
    public int doDamage() {
        return damagePoints;
    }

    @Override
    public void sufferDamage(int damage) {
        if (hasShield == Shield.YES) {
            hasShield = Shield.NO;
        } else if (hasArmor) {
            hitPoints -= damage / 2;
        }else {
            hitPoints -= damage;
        }
    }
}
