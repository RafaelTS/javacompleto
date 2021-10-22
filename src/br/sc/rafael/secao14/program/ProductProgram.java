package br.sc.rafael.secao14.program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.sc.rafael.secao14.entities.ImportedProduct;
import br.sc.rafael.secao14.entities.Product;
import br.sc.rafael.secao14.entities.UsedProduct;

public class ProductProgram {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Customs fee:");
				double customsFee = sc.nextDouble();
				ImportedProduct importeProduct = new ImportedProduct(name, price, customsFee);
				list.add(importeProduct);

			} else if (type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				UsedProduct usedProduct = new UsedProduct(name, price, manufactureDate);
				list.add(usedProduct);

			} else {
				Product product = new Product(name, price);
				list.add(product);

			}

		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}

		sc.close();

	}

}
