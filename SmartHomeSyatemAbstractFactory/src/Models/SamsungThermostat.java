package Models;

public class SamsungThermostat implements SmartThermostat{
    private int temperature;
    @Override
    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Setting the Samsung Smart Thermostat to "+temp +" degrees...");
    }

    @Override
    public int getTemperature() {
        return temperature;
    }
}
