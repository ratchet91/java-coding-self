package lowLevelDesign.InventoryManagement.State.StateImpl;

import java.util.List;

import lowLevelDesign.InventoryManagement.Coins;
import lowLevelDesign.InventoryManagement.Items;
import lowLevelDesign.InventoryManagement.VendingMachine;
import lowLevelDesign.InventoryManagement.State.State;

public class Idle implements State {

	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickOnStartSelectionProductButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Insert Coin First");

	}

	@Override
	public void insertCoin(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Insert Coin First");

	}

	@Override
	public void chooseProduct(VendingMachine machine, int code) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Insert Coin First");

	}

	@Override
	public void getChange(VendingMachine machine, int totalMoney) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Insert Coin First");

	}

	@Override
	public void dispenseProduct(VendingMachine machine, int code) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Insert Coin First");

	}

	@Override
	public List<Coins> refundFullMoney(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateInventory(VendingMachine machine, int code, Items item) throws Exception {
		// TODO Auto-generated method stub

	}

}
