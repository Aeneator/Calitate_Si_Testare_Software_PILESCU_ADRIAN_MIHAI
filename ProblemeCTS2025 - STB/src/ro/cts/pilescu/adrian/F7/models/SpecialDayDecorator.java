package ro.cts.pilescu.adrian.F7.models;

public class SpecialDayDecorator extends TicketDecorator{
    protected String message;

    public SpecialDayDecorator(Ticket ticket, String message) {
        super(ticket);
        this.message = message;
    }

    @Override
    public void printTicket() {
        super.printTicket();
        System.out.println("Special message: " + message);
    }
}
