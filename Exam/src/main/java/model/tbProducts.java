package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbProducts")
public class tbProducts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "amount", nullable = true)
	private int amount;

	@Column(name = "price ", nullable = true)
	private int price ;

	@Column(name = "details ", nullable = true)
	private String details ;

	public tbProducts() {}

	public tbProducts(String name, int amount, int price, String details) {
		this.name = name;
		this.amount = amount;
		this.price = price;
		this.details = details;
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
}
