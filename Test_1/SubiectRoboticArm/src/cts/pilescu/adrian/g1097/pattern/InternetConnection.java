package cts.pilescu.adrian.g1097.pattern;

public class InternetConnection implements RoboticArmConnection{

    private Boolean isConnected = false;

    private static RoboticArmConnection instance = null;

    private InternetConnection(){

    }

    public static RoboticArmConnection getInstance(){
        if (instance == null){
            instance = new InternetConnection();
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
