package ro.cts.pilescu.adrian.F7.models;

public class MovieTicket implements Ticket{

    private String movieName;
    private String cinemaName;
    private String seatNumber;

    public MovieTicket(String movieName, String cinemaName, String seatNumber) {
        this.movieName = movieName;
        this.cinemaName = cinemaName;
        this.seatNumber = seatNumber;
    }

    @Override
    public void printTicket() {
        final StringBuilder sb = new StringBuilder("MovieTicket{");
        sb.append("movieName='").append(movieName).append('\'');
        sb.append(", cinemaName='").append(cinemaName).append('\'');
        sb.append(", seatNumber='").append(seatNumber).append('\'');
        sb.append('}');

        System.out.println(sb.toString());
    }


}
