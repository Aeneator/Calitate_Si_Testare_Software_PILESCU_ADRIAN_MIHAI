package ro.cts.pilescu.adrian.F12.models;

public abstract class ChainHandler {

    private ChainHandler nextHandler = null;

    public ChainHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(ChainHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(double distanta);

}
