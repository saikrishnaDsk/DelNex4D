package pro1;

public class Ticket {
	int avb = 10;

	public int bookTicket(int notickets) {
		
		avb=avb-notickets;
		if(notickets>avb){
		System.out.println("HouseFull");
		return 0;
	}
		else
			System.out.println("Tickets Booked");
			return 1;
			
	}
	public Ticket() {

	}
	public static void main(String[] args) {
			Ticket t = new Ticket();
			t.bookTicket(5);
	}
}