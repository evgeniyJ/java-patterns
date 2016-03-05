
public class Samsung implements TV {

    public void energyOn() {
        System.out.println(this.getClass().getName() + " - Energy ON");
    }

    public void setFirstChannel() {
        System.out.println(this.getClass().getName() + " - First channel selected");
    }

    public void viewChannel() {
        System.out.println(this.getClass().getName() + " - Channel showed");
    }

    public void energyOff() {
        System.out.println(this.getClass().getName() + " - Energy OFF");
    }
}
