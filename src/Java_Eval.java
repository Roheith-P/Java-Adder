import java.util.*;
public class Java_Eval {
	
	static void repeat() {}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner myObj = new Scanner(System.in);
    System.out.println("I am an expression solver.Input Your Expression Without Variables.Divide Your Expression into Two parts");
    System.out.println("Enter Your first part of your expression");
    int Input1 = myObj.nextInt();
    System.out.println("Enter Your Second Part of the expression");
    int Input2 = myObj.nextInt();
    System.out.println("The Solved Expression is : " + (Input1+Input2));
    System.out.println("Do you want to try another one");
    String Yes_no = myObj.nextLine();
    if (Yes_no == "yes" ) {
    	repeat();
    }else {
    	
    }
	}

}
