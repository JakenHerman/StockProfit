import java.util.*;

public class StockProfit{
	public static void main(String[] args){
	
		//Profit = ((NS*SP)-SC)-((NS*PP)+PC)
		
		double NS, SP, SC, PP, PC;
		Scanner userIn = new Scanner(System.in);
		
		System.out.println("How many shares did you purchase? ");
		NS = userIn.nextDouble();
		
		System.out.println("What is the sale price per share? ");
		SP = userIn.nextDouble();
		
		System.out.println("What is the stock commission? ");
		SC = userIn.nextDouble();
		
		System.out.println("What is the purchase price per share? ");
		PP = userIn.nextDouble();
		
		System.out.println("What is the purchase commission paid? ");
		PC = userIn.nextDouble();
		
		double profit = ((NS*SP)-SC)-((NS*PP)+PC);
		
		System.out.println("The total profit is $"+profit);
	
	}
}