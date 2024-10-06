package Models;

public class PhillipsThermostat implements SmartThermostat{
    private int temperature;
    @Override
    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Setting the Phillips Smart Thermostat to "+temp +" degrees...");
    }

    @Override
    public int getTemperature() {
        return temperature;
    }
}
