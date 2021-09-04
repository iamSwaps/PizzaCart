package pizzing;
import java.util.ArrayList;
import java.util.Scanner;

public class Home {
	private static ArrayList<SelectPizza>instock = new ArrayList<SelectPizza>();  	// available stocks
	private static ArrayList<SelectPizza>cart = new ArrayList<SelectPizza>();   //products will be added here
	
	public static void main(String[] args) {
		
		instock.add(new SelectPizza("Boat Headphones", 250.0, 1)); //creating products
		instock.add(new SelectPizza("Ladies Top",300.0,00));
		instock.add(new SelectPizza("USB Charger",250.0,1));
		instock.add(new SelectPizza("USB CABLE",250.0,1));
		instock.add(new SelectPizza("Back Cover",300.0,00));
		
		pizzaMenu(); //display all products
		pizchoice(); //ask user for to add products in cart
		costing(); //total cost of products in cart
	}
	
	public static void pizzaMenu() {
		int i=1;
		System.out.println("WELCOME to MyMart!\n Buy1Get1 is applicable as per offer availability\n");
		for(SelectPizza pizzaa : instock) {
			System.out.println(i+". "+pizzaa.getName()+" Rs"+pizzaa.getCost()+"         ["+pizzaa.getOffer()+" Offer available]");
			i++;
		}
	}
	
	public static void showCart() {
		int i=1;
		System.out.println("Your Cart Has ---");
		for(SelectPizza pizzaa : cart) {
			System.out.println(i+". "+pizzaa.getName()+" "+pizzaa.getCost());
			i++;
		}
	}
	
	public static void pizchoice() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please select your Product by entering their respective numbers."		
				+ "\nEnter 0 at any time to end the selection.\n");	
		int pizinput;
		do {
			pizinput = scan.nextInt();
			switch(pizinput) {
			case 0:
				showCart();
				break;
			case 1:
				cart.add(new SelectPizza("Boat Headphones", 250.0, 1));
				System.out.println("You've selected 'Boat Headphones'.\n");
				break;
				
			case 2:
				cart.add(new SelectPizza("Ladies Top",300.0,00));
				System.out.println("You've selected 'Ladies Top'.\n");
				break;
			case 3:
				cart.add(new SelectPizza("USB Charger",250.0,1));
				System.out.println("You've selected 'USB Charger'.\n");
				break;
			case 4:
				cart.add(new SelectPizza("USB CABLE",250.0,1));
				System.out.println("You've selected 'USB CABLE'.\n");
				break;
			case 5:
				cart.add(new SelectPizza("Back Cover",300.0,00));
				System.out.println("You've selected 'Back Cover'.\n");
				break;
			
			default: 
				System.out.println("Invalid selection, Please select a valid number!");
			}
		}while(pizinput != 0);
	}
	
	public static void costing() {
		double total = 0.00;
		int check = 0; 
		int offercount =0; //to count no. of offer applied
		for(SelectPizza prod : cart) {
			if(prod.getOffer()==0) {
				total= total + prod.getCost();
			}else {
				check=check+ prod.getOffer();
				
				if(check==2) { //if 2 products has offer then skip one product price and consider first product price
					check =0;
					offercount++;
					System.out.println(offercount+ " Offer is applied!");
				}else {
					total = total + prod.getCost();
				}
			}
			
		}
		System.out.println("Total costing is "+total);
	}
}