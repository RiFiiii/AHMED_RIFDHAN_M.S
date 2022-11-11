package test_1;

public class DataTypess3 {

	
	public static void main(String[] args) {
		
		
		HouseMember.income=10000;  // since income is a class variable,it has nothing to do with object reaction
		
		HouseMember father=new HouseMember();
		father.expense=5000;
		
		HouseMember mother=new HouseMember();
		mother.expense=3000;
		
		HouseMember child=new HouseMember();
		child.expense=200;
		
		System.out.println(child.expense);
		father.income=4000;
		System.out.println(HouseMember.income);
	}
}
class HouseMember{
    static int income; ///class variable
    int expense; //instance variable
}
