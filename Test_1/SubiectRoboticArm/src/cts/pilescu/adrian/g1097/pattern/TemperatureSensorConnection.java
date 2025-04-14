package cts.pilescu.adrian.g1097.pattern;

public class TemperatureSensorConnection implements RoboticArmConnection{

    private Boolean isConnected = false;
    private double temperature = 0.0;

    private static RoboticArmConnection instance = null;

    private TemperatureSensorConnection(){
        this.temperature = 0.0;
    }

    public static RoboticArmConnection getInstance(){
        if (instance == null){
            instance = new TemperatureSensorConnection();
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
