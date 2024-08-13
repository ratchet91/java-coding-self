package mainTest123;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Product {
	int id;
	String name;
	int qty;
	Product next;

	Product(int id, String name, int qty) {
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.next = null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}

public class Test30 {

	public static List<Product> getTopProductbasedOnRank(List<Map<Product, Integer>> productRankMapList){
		List<Product> productToReturn = new ArrayList<>();
		
		
		
		
		
		
		return productToReturn;
 	}

	public static List<Product> getRecommendation(Map<Product, List<Map<Product, Integer>>> recommendationMap,
			Product product) {

		if (recommendationMap.isEmpty()) {
			return null;
		} else {
			List<Product> getProducts = getTopProductbasedOnRank(recommendationMap.get(product));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Product> inventory = new ArrayList<>();
		Map<Product, List<Map<Product, Integer>>> recommendationMap = new HashMap<>();
		// adding product
		inventory.add(new Product(1, "Bread", 20));
		inventory.add(new Product(2, "Butter", 20));
		inventory.add(new Product(3, "Jam", 20));
		inventory.add(new Product(4, "Ketchup", 20));
		inventory.add(new Product(5, "TV", 20));

		System.out.println("!!! Begin adding Product: !!!");

		System.out.println("Please enter Product name: ");
		Boolean buy = true;

		while (buy) {
			String product = sc.next();
			List<Product> recommendedProducts = getRecommendation(recommendationMap, product);
			System.out.println("");

		}
		
		

	}

}
