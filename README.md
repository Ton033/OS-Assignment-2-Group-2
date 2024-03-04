This Java application demonstrates the concept of thread synchronization through a simple movie ticket booking system. It showcases the difference in behavior when multiple threads access a shared resource with and without synchronization.

How to Run the Program:
Run the main class

Observations:
Synchronized Execution
Each thread reports and books from the accurate number of remaining seats. No overbooking occurs. The application maintains a consistent state throughout its execution.

Hi, Tony : 10 : Seats available for Dune 2
Hi, Tony : 3 Seats booked successfully for Dune 2
Hi, Henrik : 7 : Seats available for Dune 2
Hi, Henrik : 4 Seats booked successfully for Dune 2
Hi, Emma : 3 : Seats available for Dune 2
Hi, Emma : 3 Seats booked successfully for Dune 2
Hi, Jonas : 0 : Seats available for Dune 2
Hi, Jonas : Seats not available for Dune 2

Unsynchronized Execution
Multiple threads report the full number of seats as available, regardless of previous bookings. Overbooking can occur, with more tickets booked than the actual number of seats.
The final state of seat availability is inconsistent and incorrect.

Hi, Jonas : 10 : Seats available for Dune 2
Hi, Tony : 10 : Seats available for Dune 2
Hi, Jonas : 2 Seats booked successfully for Dune 2
Hi, Henrik : 10 : Seats available for Dune 2
Hi, Henrik : 4 Seats booked successfully for Dune 2
Hi, Emma : 10 : Seats available for Dune 2
Hi, Tony : 3 Seats booked successfully for Dune 2
Hi, Emma : Seats not available for Dune 2


Why Synchronization Fixes the Issue:
Without synchronization, there is no guarantee about the order in which threads will access the shared resource. This leads to race conditions where the outcome of the operations depends on the timing of the thread execution.

In the unsynchronized version of the movie ticket booking application, multiple threads access the shared resource availableSeats concurrently. As result: Threads read the availableSeats variable simultaneously each seeing the full number of seats available. Threads proceed to book seats based on outdated information leading to overbooking.

When a thread is inside the synchronized bookTicket method, no other thread can enter this method. This ensures that before a new thread can read or modify the availableSeats, the previous thread has finished its booking operation and the availableSeats variable is updated.