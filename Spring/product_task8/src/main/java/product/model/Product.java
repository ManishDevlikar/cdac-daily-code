package product.model;

public class Product {
	private int id;
	private String Description;
	private String Category;
	private double price;

	@Override
	public String toString() {
		return "Product [id=" + id + ", Description=" + Description + ", Category=" + Category + ", price=" + price
				+ "]";
	}

	public Product(int id, String description, String category, double price) {
		super();
		this.id = id;
		Description = description;
		Category = category;
		this.price = price;
	}

	public Product() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
// ID, Description, Category, Price