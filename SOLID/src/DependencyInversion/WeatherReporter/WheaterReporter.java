package DependencyInversion.WeatherReporter;

public class WheaterReporter {
    private TemperatureSensor sensor;

    public WheaterReporter(TemperatureSensor sensor) {
        this.sensor = sensor;
    }
    public String report() {
        return "Current temperature: " + sensor.getTemperature();
    }
}
