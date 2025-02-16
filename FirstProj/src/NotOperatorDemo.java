
public class NotOperatorDemo {
	
	public static void main(String[] args) {
		
		if ( 3 == 3 ) { //if (true)
			System.out.println("True");
			//Consitional expression here 3==3
		}
		
		if ( !(3 == 3) ) {  //if(false)
			System.out.println("True");
			//Consitional expression here 3==3
		} else //if block
		{
			System.out.println("False");
		}  //else block
		
		//if condition is false, flow moves to else block
		//if condition is true, flow moves to if block
		//Either if block or else block will be executed never both
		
	} //main method block

}//Class block