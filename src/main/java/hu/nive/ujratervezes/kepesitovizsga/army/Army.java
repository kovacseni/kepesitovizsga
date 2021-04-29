package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Army {

    private List<MilitaryUnit> military = new ArrayList<>();

    public int getArmySize() {
        return military.size();
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        military.add(militaryUnit);
    }

    public int getArmyDamage() {
        int sumDamage = 0;
        for (MilitaryUnit m : military) {
            sumDamage += m.doDamage();
        }
        return sumDamage;
    }

    public void damageAll(int damage) {
        for (MilitaryUnit m : military) {
            m.sufferDamage(damage);
        }

        Iterator<MilitaryUnit> iter = military.iterator();
        while (iter.hasNext()) {
            MilitaryUnit unit = iter.next();
            if (unit.hitPoints < 25) {
                iter.remove();
            }
        }
    }
}
