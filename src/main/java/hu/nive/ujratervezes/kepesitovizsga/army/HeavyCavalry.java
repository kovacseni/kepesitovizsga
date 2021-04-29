package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

    private static int NTH_DAMAGE;

    public HeavyCavalry() {
        this.hitPoints = 150;
        this.damagePoints = 20;
        this.hasArmor = true;
    }

    @Override
    public int doDamage() {
        if (NTH_DAMAGE == 0) {
            NTH_DAMAGE++;
            return damagePoints * 3;
        } else
            return damagePoints;
    }

    @Override
    public void sufferDamage(int damage) {
        hitPoints -= damage/2;
    }
}


