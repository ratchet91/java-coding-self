package FileUpload;

import java.util.HashMap;
import java.util.Map;

public class ProductController {
	public static AbstractProductService ps = new ProductServiceImpl();

	public static Product getproductById(long productId, Map<Long, Product> productMap) {
		Product result = ps.getProductById(productId, productMap);
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Long, Product> productMap = new HashMap<>();

	}

}
