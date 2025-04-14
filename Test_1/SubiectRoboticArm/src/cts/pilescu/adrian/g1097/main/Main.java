package cts.pilescu.adrian.g1097.main;

import cts.pilescu.adrian.g1097.pattern.AreaSensorConnection;
import cts.pilescu.adrian.g1097.pattern.InternetConnection;
import cts.pilescu.adrian.g1097.pattern.RoboticArmConnection;
import cts.pilescu.adrian.g1097.pattern.TemperatureSensorConnection;
import cts.pilescu.adrian.g1097.simpleFactory.*;

public class Main {
    public static void main(String[] args) {

        RoboticArmConnection areaSensorConnection = AreaSensorConnection.getInstance();
        areaSensorConnection.connect();

        System.out.println("Area Sensor Connection: " + ((AreaSensorConnection)areaSensorConnection).getIsConnected());

        RoboticArmConnection areaSensorConnection2 = AreaSensorConnection.getInstance();
        System.out.println("Area Sensor Connection: " + ((AreaSensorConnection)areaSensorConnection2).getIsConnected());

        areaSensorConnection2.disconnect();
        System.out.println("Area Sensor Connection: " + ((AreaSensorConnection)areaSensorConnection).getIsConnected());
        System.out.println("Area Sensor Connection: " + ((AreaSensorConnection)areaSensorConnection2).getIsConnected());


        // ex 2
        RoboticArmConnection areaSensorConn = AreaSensorConnection.getInstance();
        areaSensorConn.connect();

        RoboticArmConnection temperatureSensorConn = TemperatureSensorConnection.getInstance();
        temperatureSensorConn.connect();

        RoboticArmConnection internetConn = InternetConnection.getInstance();
        internetConn.connect();

        RobotPart robotArm = new RobotArm(10);
        TestReport report = robotArm.testConnections();
        report.printReport();

        internetConn.disconnect();

        TestReport report2 = robotArm.testConnections();
        report2.printReport();

        TestReportFactory factory = new TestReportFactory();

        try {
            TestReport raportaj = factory.createTestReport(TestReportTypes.ALTELE, "Test report");
            raportaj.printReport();
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}