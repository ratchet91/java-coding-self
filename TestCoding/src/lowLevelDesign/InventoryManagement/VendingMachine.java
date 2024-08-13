package lowLevelDesign.InventoryManagement;

import java.util.ArrayList;
import java.util.List;

import lowLevelDesign.InventoryManagement.State.State;
import lowLevelDesign.InventoryManagement.State.StateImpl.Idle;

public class VendingMachine {
	private State state;
	private Inventory inventory;
	private List<Coins> coinList;

	VendingMachine() {
		state = new Idle();
		inventory = new Inventory(10);
		coinList = new ArrayList<>();

	}

	public State getVendingMachineState() {
		return state;
	}

	public void setVendingMachineState(State state) {
		this.state = state;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public List<Coins> getCoinList() {
		return coinList;
	}

	public void setCoinList(List<Coins> coinList) {
		this.coinList = coinList;
	}

}
