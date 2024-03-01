package org.ntnu;

import org.ntnu.booking.MovieTicketClient;
import org.ntnu.booking.MovieTicketServer;

public class Main {
	public static void main(String[] args) {
		MovieTicketServer movieTicketServer = new MovieTicketServer("Dune 2", 10);


		//4 new threads
		Thread t1 = new MovieTicketClient(movieTicketServer, "Tony", 3);
		Thread t2 = new MovieTicketClient(movieTicketServer, "Jonas", 2);
		Thread t3 = new MovieTicketClient(movieTicketServer, "Emma", 3);
		Thread t4 = new MovieTicketClient(movieTicketServer, "Henrik", 4);



		//Starting 4 threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();


	}
}