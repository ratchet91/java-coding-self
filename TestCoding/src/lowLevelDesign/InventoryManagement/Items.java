package lowLevelDesign.InventoryManagement;

public class Items {
	// int itemId;
	int price;
	ItemType type;

	Items() {
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

}
