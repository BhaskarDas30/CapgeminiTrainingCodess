package Relations;

public class Review {
	private String message;
	private Product product;
	public Review(String message, Product product) {
		this.setMessage(message);
		this.setProduct(product);
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	void display() {
		System.out.println(product.getProduct_name());
		System.out.println(getMessage());
	}
}
