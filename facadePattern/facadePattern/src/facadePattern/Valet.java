package facadePattern;

public class Valet implements HotelService {

	@Override
	public void pickUpVehicle(int plateNumber) {
		System.out.println("Affirmative. We will pick-up your car, with plate number: "
				+ plateNumber + " in no time! ");

	}

	@Override
	public void cleanRoom(int roomNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestCart(int numberOfCarts) {
		// TODO Auto-generated method stub
		
	}

}
