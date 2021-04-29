package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {

    public Archer() {
        this.hitPoints = 50;
        this.damagePoints = 20;
    }

    @Override
    public int doDamage() {
        return this.damagePoints;
    }

    @Override
    public void sufferDamage(int damage) {
        this.hitPoints -= damage;
    }
}
