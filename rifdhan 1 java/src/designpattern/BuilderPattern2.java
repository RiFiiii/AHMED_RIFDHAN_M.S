package designpattern;

public class BuilderPattern2 {
public static void main(String[] args) {
	Room myroom=new Room.Gobibo().setRooms("Rooms : Oyo / Pandian :").setTickets("Flighticket : Economic Class/Bussiness Class :").setHotels("Anand Bhavan : Veg/Non Veg").app();
	System.out.println(myroom);
}
}

//builder pattern
class Room{
	private String rooms;
	private String tickets;
	private String hotels;
	public Room(Gobibo go) {
		this.rooms=go.rooms;
		this.tickets=go.tickets;
		this.hotels=go.hotels;
	 
	}

@Override
public String toString() {
	return 
			"Rooms Type"+this.rooms+": Ticket Class.: "+this.tickets+": Hotels Type..:"+this.hotels;
}
static class Gobibo{
	private String rooms;
	private String tickets;
	private String hotels;
	
	public Gobibo setRooms(String rooms) {
		this.rooms=rooms;
		return this;
	}
	public Gobibo setTickets(String tickets) {
		this.tickets=tickets;
		return this;
	}
	public Gobibo setHotels(String hotels) {
		this.hotels=hotels;
		return this;
	}
	public Room app() {
		return new Room(this);
	}
}
}