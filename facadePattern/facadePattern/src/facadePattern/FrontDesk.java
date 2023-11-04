package facadePattern;

public class FrontDesk {
	private Valet valet;
	private HouseKeeping hk;
	private Cart cart;
	
	public FrontDesk(HotelService service)
	{
		switch (service.getClass().getSimpleName()) {
		case "Valet": this.valet = (Valet) service; break;
		case "HouseKeeping": this.hk = (HouseKeeping) service; break;
		case "Cart": this.cart = (Cart) service; break;
		}
	}
	
	public void performTask(HotelService service, int data)
	{
		switch (service.getClass().getSimpleName()) {
		case "Valet": this.valet.pickUpVehicle(data); break;
		case "HouseKeeping": this.hk.cleanRoom(data); break;
		case "Cart": this.cart.requestCart(data); break;
		}
	}

}
