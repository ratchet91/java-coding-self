package lowLevelDesign.InventoryManagement;

public class Inventory {
	ItemSelf[] inventory = null;

	Inventory(int itemCount) {
		inventory = new ItemSelf[itemCount];
		initialiseEmptyInventory();
	}

	public void initialiseEmptyInventory() {
		int startCode = 101;
		for (int i = 0; i < inventory.length; i++) {
			ItemSelf space = new ItemSelf();
			space.setCode(startCode);
			space.setSoldOut(false);
			inventory[i] = space;
			startCode++;

		}
	}

	public ItemSelf[] getInventory() throws Exception {
		return inventory;
	}

	public void setInventory(ItemSelf[] inventory) {
		this.inventory = inventory;
	}

	public void addItem(Items item, int code) throws Exception {
		for (ItemSelf s : inventory) {
			if (s.getCode() == code) {
				if (s.isSoldOut()) {
					s.item = item;
					s.setSoldOut(false);
				} else {
					throw new Exception("already item is present, cannot add here");
				}
			}
		}
	}

	public Items getItem(int code) throws Exception {
		for (ItemSelf s : inventory) {
			if (s.getCode() == code) {
				if (s.isSoldOut()) {
					throw new Exception("item already sold out");
				}
				return s.item;
			}
		}
		throw new Exception("Illegal Code");
	}

	public void updateSoldOutItem(int code) {
		for (ItemSelf s : inventory) {
			if (s.getCode() == code) {
				s.setSoldOut(true);
			}
		}
	}

}
