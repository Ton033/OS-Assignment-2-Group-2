package org.ntnu.booking;


public class MovieTicketServer {

	String movieName;
	int availableSeats;


	public MovieTicketServer(String movieName, int availableSeats) {
		this.movieName = movieName;
		this.availableSeats = availableSeats;
	}

	public void bookTicket(String customerName,int numberOfSeats) {

		System.out.println("Hi," + customerName + " : " + availableSeats + " : Seats available for " + movieName);

		if (availableSeats < 0) {
			System.out.println("Hi," + customerName + " : Seats not available for " + movieName);
		} else {
			System.out.println("Hi," + customerName + " : " + numberOfSeats + " Seats booked successfully for" + movieName);
			availableSeats -= numberOfSeats;
		}
	}


}

