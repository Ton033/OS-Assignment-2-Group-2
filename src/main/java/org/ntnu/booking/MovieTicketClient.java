package org.ntnu.booking;

public class MovieTicketClient extends Thread {

	String customerName;
	int numberOfSeats;
	MovieTicketServer movieTicketServer;


	public MovieTicketClient(MovieTicketServer movieTicketServer,String customerName, int numberOfSeats) {
		this.movieTicketServer = movieTicketServer;
		this.customerName = customerName;
		this.numberOfSeats = numberOfSeats;
	}

	public void run() {
		movieTicketServer.bookTicket(customerName, numberOfSeats);
	}

}
