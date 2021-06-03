package br.sc.rafael.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.sc.rafael.entities.Client;
import br.sc.rafael.entities.OrderItem;
import br.sc.rafael.entities.Product;

public class OrderProgram {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data:");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("Birth date (DD/MM/YYYY): ");
		Date birthDay = sdf.parse(sc.next());

		Client client = new Client(name, email, birthDay);

		System.out.println("Enter order data: ");
		System.out.println("Status: ");
		String status = sc.nextLine();
		System.out.println("How many items to this order? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + "item data: ");
			System.out.println("Product name: ");
			String nameProduct = sc.nextLine();
			System.out.println("Product price: ");
			Double price = sc.nextDouble();
			System.out.println("Quantity: ");
			Integer quantity = sc.nextInt();
			OrderItem orderItems = new OrderItem(quantity, price, new Product(nameProduct));
		}
		
		System.out.println("ORDER SUMMARY:");
		sc.close();
	}

}
