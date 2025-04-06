package SmartHomeDevices;

public class Device {
    private String deviceID;
    private String status;

    public Device(String deviceID, String status) {
        this.deviceID = deviceID;
        this.status = status;
    }

    public void displayStatus(){
        System.out.println("device id is "+ deviceID);
        System.out.println("status is "+ status);

    }
}
