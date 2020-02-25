import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int five, ten, twenty, fifty, hundred, twoHundred, fiveHundred;
		
		five=5;
		ten=10;
		twenty=20;
		fifty=50;
		hundred=100;
		twoHundred=200;
		fiveHundred=500;
		
		double totalPrice=0;
		double prices[]= new double[5];
		String menu[]=new String[5];
		
		
		//setting menu's meals
		System.out.println("entry five menu's meals:");
		Scanner input = new Scanner (System.in);
		
		
		for (int i=0; i<menu.length; i++) {
			menu[i]= input.next();	
		}
		
		System.out.println(Arrays.toString(menu));
		
		
		System.out.println("entry five prices for each menu's meal:");
		
		
		for (int i=0; i<prices.length; i++) {
			prices[i]= input.nextDouble();	
		}
		
		System.out.println(Arrays.toString(prices));
		
		
		ArrayList<String> orderList = new ArrayList<String>();
		
	
		System.out.println("que plato desea?" + Arrays.toString(menu));
		int answer = 1;
		
		while (answer==1) {
			
			orderList.add(input.next());
			System.out.println("Desea otro plato SI=1, NO=0:");
			answer = input.nextInt();
			
			if (answer == 1) {
			System.out.println("Cual otro?");	
			}	
		}
		
		System.out.println("Su orden es " + orderList);
		
		//Fase3
		
		for (int i=0; i<orderList.size(); i++) {
			
				
			if (Arrays.asList(menu).contains(orderList.get(i))) {
				
			totalPrice = totalPrice + prices[Arrays.asList(menu).indexOf(orderList.get(i))];
					
			}else {
				
				System.out.println("This meal \""+ orderList.get(i)+ "\" doesn't exist in menu");
				
			}
		}
		
		System.out.println("you must pay= "+totalPrice);
	}

}
