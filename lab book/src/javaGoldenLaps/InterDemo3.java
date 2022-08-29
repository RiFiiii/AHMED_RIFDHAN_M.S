package javaGoldenLaps;

public class InterDemo3 {

		 interface CEO{
			 private void workforus() {
			 }
			 private void reportTous() {
				}
			private void GiveProfitToUS() {
			}
			default void work() {
				workforus();
				reportTous();
				 GiveProfitToUS();
			}
			static void doReport() {
				System.out.println("reporting to us boss...");
			}
			public void food();
		 }
		 class rifdhan implements CEO{
			 @Override
			 public void food() {
				 System.out.println("sambar,sambar,idli");
			 }
		 }

	}

