
public class AttackUpgrade extends UpgradeDecorator{

    public AttackUpgrade(Race race) {
        super(race);
    }

    public int attack() {
        int attack = race.attack();
        Type type = getType();
        switch (type){
            case ELF:
                attack += 25;
                break;
            case HUMAN:
                attack += 20;
                break;
            case ORC:
                attack += 15;
                break;
        }
        return attack;
    }

    public Type getType() {
        return race.getType();
    }

    public int hp() {
        return race.hp();
    }

}
