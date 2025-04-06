package SmartHomeDevices;

public class Thermostat extends  Device{
    private String  temperatureSetting;

    public Thermostat(String deviceID, String status, String temperatureSetting) {
        super(deviceID, status);
        this.temperatureSetting = temperatureSetting;
    }

    public String getTemperatureSetting() {
        return temperatureSetting;
    }

    public void setTemperatureSetting(String temperatureSetting) {
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("temperature Setting is "+ temperatureSetting);
    }
}
