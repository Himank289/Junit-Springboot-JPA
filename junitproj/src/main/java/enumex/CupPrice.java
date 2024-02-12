package enumex;

import java.util.EnumSet;

public enum CupPrice {
	MINI(5),
	SMALL(15),
	LARGE(20),
	EXTRALARGE(45);

	CupPrice(final int price) {
		
		// TODO Auto-generated constructor stub
		this.price=price;
	}
	
	private int price;
	
	public int getPrice() {
		return price;
	}


}
