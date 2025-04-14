package cts.pilescu.adrian.g1097.simpleFactory;

import cts.pilescu.adrian.g1097.pattern.AreaSensorConnection;
import cts.pilescu.adrian.g1097.pattern.InternetConnection;
import cts.pilescu.adrian.g1097.pattern.RoboticArmConnection;
import cts.pilescu.adrian.g1097.pattern.TemperatureSensorConnection;

public class RobotArm implements RobotPart{

    private int id;

    private RoboticArmConnection internetConnection;
    private RoboticArmConnection temperatureSensorConnection;
    private RoboticArmConnection areaSensorConnection;

    public RobotArm(int id) {
        this.id = id;

        this.internetConnection = InternetConnection.getInstance();
        this.temperatureSensorConnection = TemperatureSensorConnection.getInstance();
        this.areaSensorConnection = AreaSensorConnection.getInstance();
    }

    @Override
    public TestReport testConnections() {
        int nrOfConnections = 0;
        if (((InternetConnection)internetConnection).getIsConnected()){
            nrOfConnections++;
        }
        if (((TemperatureSensorConnection)temperatureSensorConnection).getIsConnected()){
            nrOfConnections++;
        }
        if (((AreaSensorConnection)areaSensorConnection).getIsConnected()){
            nrOfConnections++;
        }


        TestReport report = null;
        TestReportFactory factory = new TestReportFactory();
        if (nrOfConnections == 3){
            report = factory.createTestReport(TestReportTypes.SUCCESS,"All connections are available");
        } else if (nrOfConnections == 2){
            report = factory.createTestReport(TestReportTypes.WARNING,"Only " + nrOfConnections + " connections are available");
        } else {
            report = factory.createTestReport(TestReportTypes.ERROR,"No connections are available");
        }

        return report;

    }
}
