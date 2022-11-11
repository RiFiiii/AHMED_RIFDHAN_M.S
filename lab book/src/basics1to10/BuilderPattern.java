package basics1to10;
public class BuilderPattern {

	public static void main(String[] args) {
		
		Sweet mysweet=new Sweet.MakeSweet().setLaddu("Orange Laddu").setPalkova("Sri Villi").setGulabjaam("Amma GulabJaam").setCost(300).build();
		System.out.println(mysweet);
		
		System.out.println(mysweet);
	}
}

class Sweet{
	
	private String laddu;
	private String palkova;
	private String gulabjaam;
	private int cost;
	
	public Sweet(MakeSweet ms) {
		this.laddu=ms.laddu;
		this.palkova=ms.palkova;
		this.gulabjaam=ms.gulabjaam;
		this.cost=ms.cost;
	}
	@Override
	public String toString() {
		return "Orange laddu:"+this.laddu+": srikrishna :"+this.palkova+": Amma Gulbjaam :"+this.gulabjaam+": Total Amount :"+this.cost;
		
	}
	static class MakeSweet{
		private String laddu;
		private String palkova;
		private String gulabjaam;
		private int cost;
	
       public MakeSweet setLaddu(String laddu) {
    	   this.laddu=laddu;
    	   return this;
       }
       public MakeSweet setPalkova(String palkova) {
    	   this.palkova=palkova;
    	   return this;
       }
       public MakeSweet setGulabjaam(String gulabjaam) {
    	   this.gulabjaam=gulabjaam;
    	   return this;
       } 
       public MakeSweet setCost(int cost) {
    	   this.cost=cost;
    	   return this;
       }
       public Sweet build() {
    	 return  new Sweet(this);
       }
	}
}