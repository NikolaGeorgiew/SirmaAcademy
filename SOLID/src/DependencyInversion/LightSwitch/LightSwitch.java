package DependencyInversion;

public class LightSwitch {
    private Switchable switchable;

    public LightSwitch(Switchable switchable) {
        this.switchable = switchable;
    }
    public void operate() {
        switchable.turnOn();
    }
}
