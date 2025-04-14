package cts.pilescu.adrian.g1097.simpleFactory;

public class WarningReport implements TestReport{
    private String warningMessage;

    public WarningReport(String warningMessage) {
        this.warningMessage = warningMessage;
    }

    @Override
    public void printReport() {
        System.out.println("WARNING: " + warningMessage);
    }
}
