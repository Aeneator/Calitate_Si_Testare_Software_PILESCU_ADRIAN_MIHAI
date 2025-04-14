package cts.pilescu.adrian.g1097.simpleFactory;

public class ErrorReport implements TestReport{
    private String errorMessage;

    public ErrorReport(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public void printReport() {
        System.out.println("ERROR: " + errorMessage);
    }
}
