package lowLevelDesign.InventoryManagement;

public enum Coins {
	NICKEL(10), COPPER(20), GOLD(1000);

	public int value;

	Coins(int value) {
		this.value = value;
	}

}
