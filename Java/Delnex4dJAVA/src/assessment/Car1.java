package assessment;

public class Car1{
	String name;
	double price;
	String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Car1(String name, double price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car1 [name=" + name + ", price=" + price + ", color=" + color + "]";
	}

}