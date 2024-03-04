package org.ntnu.booking;

public class MovieTicketClient extends Thread {
    private String customerName;
    private int numberOfSeats;
    private MovieTicketServer server;

    public MovieTicketClient(MovieTicketServer server, String customerName, int numberOfSeats) {
        this.server = server;
        this.customerName = customerName;
        this.numberOfSeats = numberOfSeats;
    }
    
    @Override
    public void run() {
        server.bookTicket(customerName, numberOfSeats);
    }
}
