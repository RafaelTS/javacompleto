package br.sc.rafael.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.sc.rafael.entities.Client;
import br.sc.rafael.entities.OrderItem;
import br.sc.rafael.entities.Product;
import br.sc.rafael.entities.enums.OrderStatus;

public class OrderProgram {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter cliente data:");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		System.out.println("How many items to this order? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + "item data: ");
			System.out.println("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Product price: ");
			double price = sc.nextDouble();
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			Product product = new Product(productName, price);
			OrderItem orderItems = new OrderItem(quantity, price, product);
		}
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: ");
		System.out.println("Order status:");
		System.out.println("Client: " + client.getName());
		System.out.println("Order Items: ");

		sc.close();
	}

}
