package ro.cts.pilescu.adrian.F7.models;

public abstract class TicketDecorator implements Ticket{
    protected Ticket ticket;

    public TicketDecorator(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void printTicket() {
        ticket.printTicket();
    }
}
