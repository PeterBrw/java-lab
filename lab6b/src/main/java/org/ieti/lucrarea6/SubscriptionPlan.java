package org.ieti.lucrarea6;

public class SubscriptionPlan {

	private Integer price;
	private String description;

	public SubscriptionPlan() {
	}

	SubscriptionPlan(Integer price, String description) {
		this.price = price;
		this.description = description;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "SubscriptionPlan{" +
				"price=" + price +
				", description='" + description + '\'' +
				'}';
	}
}






