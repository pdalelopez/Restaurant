import java.util.Arrays;
import java.util.Scanner;


public class Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FASE1

	int five, ten, twenty, fifty, hundred, twoHundred, fiveHundred;
		
		five=5;
		ten=10;
		twenty=20;
		fifty=50;
		hundred=100;
		twoHundred=200;
		fiveHundred=500;
		
		double totalPrice;
		//setting menu's meals
		System.out.println("entry five menu's meals:");
		Scanner input = new Scanner (System.in);
		String menu[]=new String[5];
		
		for (int i=0; i<menu.length; i++) {
			menu[i]= input.next();	
		}
		
		System.out.println(Arrays.toString(menu));
		
		
		System.out.println("entry five prices for each menu's meal:");
		double prices[]= new double[5];
		
		for (int i=0; i<prices.length; i++) {
			prices[i]= input.nextDouble();	
		}
		
		System.out.println(Arrays.toString(prices));
		
	}

}