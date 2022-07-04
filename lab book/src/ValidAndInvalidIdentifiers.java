
public class ValidAndInvalidIdentifiers {

	public static void main(String[] args) {
		 //it could be variable name/method name/class name/package name
		
		//valid names
		int weight;//valid starts with variable valid
		int _weight;//valid starts with underscore is valid
		int $weight;//valid starts with dollar symbol  is valid
		int wei3ght;//valid numbers in between is valid
		int Weight2;//valid begins with uppercase ends with number is valid
		
		//invalid
		
		/*
		 * int class;//invalid - u cannot have keywords as identifiers.
		 * int 2weight;//invalid - u cannot start a variable name with a number
		 * int &weight;//no special character other than _ and & can be used
		 * int we ight;//you cannot have space it throw an error
		 * 
		 * note: Remember always,the method names should start with lower case
		 * variables names should also start with lower case
		 * package names should also start with upper case
		 * and the next word should always start with uppercase in all
		 * */
	}

}
