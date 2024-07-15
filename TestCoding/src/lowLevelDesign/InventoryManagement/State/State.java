package lowLevelDesign.InventoryManagement.State;

import java.util.List;

import lowLevelDesign.InventoryManagement.Coins;
import lowLevelDesign.InventoryManagement.Items;
import lowLevelDesign.InventoryManagement.VendingMachine;

public interface State {
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;

	public void clickOnStartSelectionProductButton(VendingMachine machine) throws Exception;

	public void insertCoin(VendingMachine machine) throws Exception;

	public void chooseProduct(VendingMachine machine, int code) throws Exception;

	public void getChange(VendingMachine machine, int totalMoney) throws Exception;

	public void dispenseProduct(VendingMachine machine, int code) throws Exception;

	public List<Coins> refundFullMoney(VendingMachine machine) throws Exception;

	public void updateInventory(VendingMachine machine, int code, Items item) throws Exception;

}
