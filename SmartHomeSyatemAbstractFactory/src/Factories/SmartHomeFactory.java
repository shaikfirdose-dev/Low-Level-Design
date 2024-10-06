package Factories;

import Models.SmartBulb;
import Models.SmartCamera;
import Models.SmartThermostat;

public interface SmartHomeFactory {
    SmartBulb createSmartBulb();
    SmartThermostat createSmartThermostat();
    SmartCamera createSmartCamera();
}
