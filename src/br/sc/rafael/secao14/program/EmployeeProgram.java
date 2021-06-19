package br.sc.rafael.secao14.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.sc.rafael.secao14.entities.Employee;
import br.sc.rafael.secao14.entities.OutsourcedEmployee;

public class EmployeeProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("Enter the number of employees:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)?");
			char outsourced = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours:");
			int hours = sc.nextInt();
			System.out.print("Value per hours");
			double valuePerHour = sc.nextDouble();

			if (outsourced == 'y') {

				System.out.print("Additional charge:");
				double additionalCharge = sc.nextDouble();
				OutsourcedEmployee ose = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(ose);

			} else {
				Employee employee = new Employee(name, hours, valuePerHour);
				list.add(employee);
			}

		}

		System.out.println();
		System.out.println("Payments");

		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		sc.close();

	}

}
