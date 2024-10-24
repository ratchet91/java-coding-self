package FileUpload;

public final class Product {
	final long productId;
	final String productName;
	final ProductImage prodImage;

	Product(long productId,String productName, ProductImage prodImage //abc){
		this.productId = productId;
		this.productName = productName;
		this.prodImage = new ProductImage(this.prodImage.id, this.prodImage.name)//xyz;
	}

	public long getProductId() {
		return this.productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public ProductImage getProdImage() {
		//return this.prodImage;//xyz
		return new ProductImage(this.prodImage.id, this.prodImage.name)//zxw;
	}

}
