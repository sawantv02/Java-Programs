package Programs;

public class BuyingShowTickets {

	public static void main(String args[]) {

		int tickets[] = { 1, 2, 5};
		int position = 2;

		System.out.println("Waiting time in tickets queue------------");
		System.out.println(waitingTime(tickets, position));

	}

	public static int waitingTime(int tickets[], int pos) {
		int time = 0;
		int i = 0;

		while (i < tickets.length && tickets[pos]>0) {
			if (tickets[i] > 0) {
				tickets[i]--;
				time = time + 1;
			} 
				
			i++;

			if (i >= tickets.length)
				i = 0;
		}
		

		return time;
	}
}
