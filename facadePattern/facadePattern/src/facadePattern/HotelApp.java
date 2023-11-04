package facadePattern;
import java.util.Scanner;

public class HotelApp {

	public static void main(String[] args) {
		HotelService valet = new Valet();
		HotelService hk = new HouseKeeping();
		HotelService cart = new Cart();
		
		Scanner scan = new Scanner(System.in);
		int choice;
		
		System.out.println("	-{Welcome to Hotel Services}-\n");
		
		FrontDesk fd;
		do {
			System.out.print("How may I help you?\n"
					+ "[1] Valet    [2] HouseKeeping   [3] Cart\n"
					+ "Please pick an option: ");
			choice = scan.nextInt();
			switch (choice)
			{
			case 1: fd = new FrontDesk(valet);
					System.out.print("\nPlease provide your car's plate number: ");
					fd.performTask(valet, scan.nextInt()); break;
			case 2: fd = new FrontDesk(hk);
					System.out.print("\nMay you please indicate your room number?: ");
					fd.performTask(hk, scan.nextInt()); break;
			case 3: fd = new FrontDesk(cart);
					System.out.print("\nHow many do you need?: ");
					fd.performTask(cart, scan.nextInt()); break;
			}
			
			System.out.print("\nIs there anything else? [1] Yes  [2] None: ");
			choice = scan.nextInt();
		}while (choice==1);
		
		System.out.println("\nThank you! We're looking forward to serve your needs again.");
		
		System.out.println("	-------[ Facade Pattern ]-------\n" +
							"	by Marasigan, Vem Aiensi : 3BSCS-1");
	}
}
