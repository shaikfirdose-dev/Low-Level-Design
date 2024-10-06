package Factories;

import Models.*;

public class PhillipsFactory implements SmartHomeFactory {
    @Override
    public SmartBulb createSmartBulb() {
        return new PhillipsBulb();
    }

    @Override
    public SmartThermostat createSmartThermostat() {
        return new PhillipsThermostat();
    }

    @Override
    public SmartCamera createSmartCamera() {
        return new PhillipsCamera();
    }
}
