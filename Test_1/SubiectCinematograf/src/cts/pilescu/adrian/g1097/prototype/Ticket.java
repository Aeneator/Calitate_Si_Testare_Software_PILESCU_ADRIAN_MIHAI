package cts.pilescu.adrian.g1097.prototype;

public interface Ticket {
    /*
    This method returns order's details in A6 landscape printable format -
    comma-separated values:
    Movie title: Fast and furious 9, Date: 04.05.2022, Time: 16:45 UTC+3,
    Seat: 3F, ...
    */
    public String print();
}