package basics1to10;

public class BuilderPattern2 {

	public static void main(String[] args) {
		
		Room myroom=new Room.Oyo().sethotelName("Pandian hotel").setCost(1970).setLocation("Chennai").setRoomtype("Deluxe double couple room with ac").build();
		
		System.out.println(myroom);
	}
}

class Room{
	private String hotelname;
	private int cost;
	private String location;
	private String roomtype;
	
	@Override
	public String toString() {
		
		return "Hotel name: "+hotelname+" room cost: "+cost+" Location :"+location+"Room type"+roomtype;
	}
	public Room(Oyo oyo) {
		this.hotelname=oyo.hotelname;
		this.cost=oyo.cost;
		this.location=oyo.location;
		this.roomtype=oyo.roomtype;
		
	}
	
	static class Oyo{
		private String hotelname;
		private int cost;
		private String location;
		private String roomtype;
		
		public Oyo sethotelName(String hotelname) {
			this.hotelname=hotelname;
			return this;
		}
		
		public Oyo setCost(int cost) {
			this.cost=cost;
			return this;
		}
		public Oyo setLocation(String location) {
			this.location=location;
			return this;
		}
		public Oyo setRoomtype(String roomtype) {
			this.roomtype=roomtype;
			return this;
		}
		public Room build() {
			return new Room(this);
		}
	}
}
