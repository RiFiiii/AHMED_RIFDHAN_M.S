package assignment;

public class CozaLozaWoza {

	
		public static void main(String[] args) {

			
			final int lowerbound=1;
			final int upperbound=110;
			int count=0;
			
			for(int i=lowerbound;i<=upperbound;++i) {
				count+=1;
				if(i%3==0) {
					if((i%3==0)&&(i%5==0)) {
						System.out.print("CozaLoza");
					}else if((i%3==0)&&(i%7==0)) {
						System.out.print("CozaWoza");
					}else {
						System.out.print("Coza");
					}
				}else if(i%5==0) {
					if((i%5==0)&&(i%7==0)) {
						System.out.print("LozaWoza");
					}else if((i%5==0)&&(i%3==0)) {
						System.out.print("LozaCoza");
					}else {
						System.out.print("Loza");
					}
				}else if(i%7==0){
					if((i%7==0)&&(i%5==0)) {
						System.out.print("WozaLoza");
					}else if((i%7==0)&&(i%3==0)) {
						System.out.print("WozaCoza");
					}
				}else {
					System.out.print(i);
				}
				if(count%11==0) {
					System.out.println();
				}else {
					System.out.print(" ");
				}
					
				}
			
			
			
		 
			
		}
		}
		
		
