package Factories;

import Models.*;

public class SamsungFactory implements SmartHomeFactory {
    @Override
    public SmartBulb createSmartBulb() {
        return new SamsungBulb();
    }

    @Override
    public SmartThermostat createSmartThermostat() {
        return new SamsungThermostat();
    }

    @Override
    public SmartCamera createSmartCamera() {
        return new SamsungCamera();
    }
}
