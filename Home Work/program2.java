class program2{ 
  
public static void main(String[] args) 
    { 
	char c='3';
        // CHECKING FOR ALPHABET 
        if ((c>= 65 && c<= 90) 
            || (c>= 97 && c<= 122)) 
            System.out.println(" Alphabet "); 
  
        // CHECKING FOR DIGITS 
        else if (c>= 48 && c<= 57) 
            System.out.println(" Digit "); 
  
        // OTHERWISE SPECIAL CHARACTER 
        else
            System.out.println(" Special Character "); 
    }
}