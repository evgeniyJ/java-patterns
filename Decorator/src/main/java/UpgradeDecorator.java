
public abstract class UpgradeDecorator implements Race {

    protected Race race;

    public UpgradeDecorator(Race race){
        this.race = race;
    }
}
