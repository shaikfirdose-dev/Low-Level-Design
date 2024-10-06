import Factories.PhillipsFactory;
import Factories.SmartHomeFactory;
import Models.SmartBulb;
import Models.SmartCamera;
import Models.SmartThermostat;

public class SmartHomeSystem {
    private final SmartBulb smartBulb;
    private final SmartThermostat smartThermostat;
    private final SmartCamera smartCamera;

    SmartHomeSystem(SmartHomeFactory factory){
        smartBulb = factory.createSmartBulb();
        smartCamera = factory.createSmartCamera();
        smartThermostat = factory.createSmartThermostat();;
    }

    public void turnOnBulb(){
        smartBulb.turnOn();
    }

    public void turnOffBulb(){
        smartBulb.turnOff();
    }

    public void setTemperature(int temp){
        smartThermostat.setTemperature(temp);
    }

    public int getTemperature(){
        return smartThermostat.getTemperature();
    }

    public void startCamera(){
        smartCamera.startRecording();
    }

    public void stopCamera(){
        smartCamera.stopRecording();
    }

    public void currentStatus(){
        System.out.println("Smart Home System Status:");
        System.out.println("Bulb: " + (smartBulb instanceof SmartBulb ? "Phillips" : "Samsung"));
        System.out.println("Thermostat: " + (smartThermostat instanceof SmartThermostat ? "Phillips - " + smartThermostat.getTemperature() + " degrees" : "Samsung - " + smartThermostat.getTemperature() + " degrees"));
        System.out.println("Camera: " + (smartCamera instanceof SmartCamera ? "Phillips" : "Samsung"));

    }

}
