package LiskovSubstitution;

public class ElectricEngine extends Engine{
    @Override
    public void start() {
        // Electric engines might have a different startup sequence
        // but they do not throw exceptions.
        // Implement electric engine start logic
    }
}
