package designpattern;

public class BuilderPattern3 {

	public static void main(String[] args) {
		Building mybuilding=new Building.RifdhanBuilders().setSteel("Kiscol steel").setBrick("Sengal Soolai").setTiles("marble").setCement("Sankar Cement").build();
		System.out.println(mybuilding);
	}
}

class Building{
	private String steel;
	private String brick;
	private String tiles;
	private String cement;
	
	public Building(RifdhanBuilders rb) {
		 this.steel=rb.steel;
		 this.brick=rb.brick;
		 this.tiles=rb.tiles;
		 this.cement=rb.cement;
	}
	@Override
	public String toString() {
	 
		return  
			"Steel Type: "	+this.steel+": Brick Quality :"+this.brick+": Tiles Quality :"+this.tiles+": Cement Quality :"+this.cement;
	}
	static class RifdhanBuilders{
		private String steel;
		private String brick;
		private String tiles;
		private String cement;
		
		public RifdhanBuilders setSteel(String steel) {
			this.steel=steel;
			return this;
			}
		public RifdhanBuilders setBrick(String brick) {
			this.brick=brick;
			return this;
			}
		public RifdhanBuilders setTiles(String tiles) {
			this.tiles=tiles;
			return this;
			}
		public RifdhanBuilders setCement(String cement) {
			this.cement=cement;
			return this;
			}
		public Building build() {
			return new Building(this);
		}
	}
}
