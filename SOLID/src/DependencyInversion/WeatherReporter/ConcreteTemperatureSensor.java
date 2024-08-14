package DependencyInversion.WeatherReporter;

public class ConcreteTemperatureSensor implements TemperatureSensor{
    @Override
    public double getTemperature() {

        return 25.0;
    }
}
