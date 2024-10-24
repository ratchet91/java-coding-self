package FileUpload;

import java.util.Map;

public abstract class AbstractProductService {

	abstract public long addProduct(Product productDetails, Map<Long, Product> productMap);

	abstract public Product getProductById(long productId, Map<Long, Product> productMap);

	abstract public long deleteProductById(long productId, Map<Long, Product> productMap);

	abstract public Product getProductByName(String ProductName, Map<Long, Product> productMap);

}
