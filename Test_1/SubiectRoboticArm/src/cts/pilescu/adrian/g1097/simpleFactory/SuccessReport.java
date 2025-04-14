package cts.pilescu.adrian.g1097.simpleFactory;

public class SuccessReport implements TestReport{
    private String message;

    public SuccessReport(String message) {
        this.message = message;
    }
    @Override
    public void printReport() {
        System.out.println("SUCCESS: " + message);
    }

}
