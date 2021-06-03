package br.sc.rafael.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.sc.rafael.entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	private Client client;

	private List<OrderItem> orderItems = new ArrayList<>();

	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void addOrderItem(OrderItem orderItem) {
		orderItems.add(orderItem);
	}

	public void removeOrderItem(OrderItem orderItem) {
		orderItems.remove(orderItem);
	}

	public double total() {
		return total();
	}

}