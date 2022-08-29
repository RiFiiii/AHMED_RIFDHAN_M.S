
public class DemoFor {

	public static void main(String[] args) {
		int i=0;//initialization
		
		for(; ;) {
			i=i+1;//incrementation
			System.out.println(i);
			
			if(i==20) {//condition for breaking
				break;
			}
		}
		for(int i1=0;i1<=20;i1++) {
			System.out.println(i1);
		}
		for(int i2=20;i2>=0;--i2) {
			System.out.println(i);
		}
		for(int i3=0;i3<5;i3++) {
			for(int j=1;j<5;j++) {
				System.out.println("*"+"\t");
			}
			System.out.println();
		}
	}

}
