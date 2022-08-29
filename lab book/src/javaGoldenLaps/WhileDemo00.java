package javaGoldenLaps;

class WhileDemo00 {

	public static void main(String[] args) {
		 int i=0;
		 while(true) {
			 System.out.println("loop.."+ ++i);
			 if(i>=20) {
				 break;
			 }
		 }
		 while(i<=20) {
			 System.out.println(i++);
		 }
		 do {
			 System.out.println(i--);
		 }
	while(i>=0);

	}

}
