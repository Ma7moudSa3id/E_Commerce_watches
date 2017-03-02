package dto;

public class OrderedProductDTO {

	private int CartID;
	private int productID;
	private int quantity;

	public int getCartID() {
		return CartID;
	}

	public void setCartID(int CartID) {
		this.CartID = CartID;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
