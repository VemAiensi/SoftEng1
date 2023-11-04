package facadePattern;

public class HouseKeeping implements HotelService {

	@Override
	public void pickUpVehicle(int plateNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cleanRoom(int roomNumber) {
		System.out.println("Thank you, will deploy our crews at room " + roomNumber
	+ "\nIt is our pleasure to have you stay with us in with a comfortable room");

	}

	@Override
	public void requestCart(int numberOfCarts) {
		// TODO Auto-generated method stub

	}

}
