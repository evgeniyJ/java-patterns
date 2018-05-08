package org.evgen.ua;

public class HPUpgrade extends UpgradeDecorator {

    public HPUpgrade(Race race) {
        super(race);
    }

    public int hp() {
        int hp = race.hp();
        Type type = getType();
        switch (type){
            case ELF:
                hp += 15;
                break;
            case HUMAN:
                hp += 20;
                break;
            case ORC:
                hp += 25;
                break;
        }
        return hp;
    }

    public int attack() {
        return race.attack();
    }

    public Type getType() {
        return race.getType();
    }

}
