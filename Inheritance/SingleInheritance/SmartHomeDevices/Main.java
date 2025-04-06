package SmartHomeDevices;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("1025","on");
        Thermostat thermostat = new Thermostat("101","on","27-degree");

        device.displayStatus();
        System.out.println();
        thermostat.displayStatus();
        System.out.println();

        //upadte temp settings
        thermostat.setTemperatureSetting("25degree");
        thermostat.displayStatus();
    }
}
