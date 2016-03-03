import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.00");
		double wage;
		String person;
		double hoursworked;
	
		Scanner input = new Scanner(System.in);
		System.out.println("please type the name of the worker.");
        person = input.next();
        System.out.println("please type the number of hours the worker has worked.");
        hoursworked = input.nextDouble();
        System.out.println("please type the Wage of the worker.");
        wage = input.nextDouble();
        
        if(hoursworked>40){
        	System.out.println(person+" "+"$"+df.format((wage*40)+(hoursworked-40)*(wage*1.5)));
        }else{
		System.out.println(person+" "+"$"+df.format(wage*hoursworked));
        }
        }

}