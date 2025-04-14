package cts.pilescu.adrian.g1097.pattern;

public class AreaSensorConnection implements RoboticArmConnection{

    private Boolean isConnected = false;

    private static RoboticArmConnection instance = null;

    private AreaSensorConnection(){

    }

    public static RoboticArmConnection getInstance(){
        if (instance == null){
            instance = new AreaSensorConnection();
        }
        return instance;
    }

    public Boolean getIsConnected() {
        return isConnected;
    }

    @Override
    public void connect() {
        this.isConnected = true;
    }

    @Override
    public void disconnect() {
        this.isConnected = false;
    }
}
