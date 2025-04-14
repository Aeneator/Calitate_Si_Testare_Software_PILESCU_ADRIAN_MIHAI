package cts.pilescu.adrian.g1097.simpleFactory;

public class TestReportFactory {

    public TestReport createTestReport(TestReportTypes type, String message) throws Error{
        TestReport testReport = null;
        switch (type){
            case TestReportTypes.ERROR:
                testReport = new ErrorReport(message);
                break;
            case TestReportTypes.WARNING:
                testReport = new WarningReport(message);
                break;
            case TestReportTypes.SUCCESS:
                testReport = new SuccessReport(message);
                break;
            default:
                throw new Error("Invalid report type: " + type);
        }

        return testReport;

    }

}
