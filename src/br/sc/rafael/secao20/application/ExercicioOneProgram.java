package br.sc.rafael.secao20.application;

import br.sc.rafael.secao20.entities.Product;
import br.sc.rafael.secao20.util.ProductPredicate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioOneProgram {
    public static void main(String[] args) {
        ///home/rateixeira/Documents/development/javacompleto/src/br.sc.rafael/secao20/aplication/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
            }
            double average = list.stream()
                    .map(product -> product.getPrice())
                    .reduce(0.0, (x, y) -> x + y) / list.size();

            System.out.println("Average price: " + String.format("%.2f", average));

            Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                    .filter(product -> product.getPrice() < average)
                    .map(product -> product.getName())
                    .sorted(comparator.reversed())
                    .collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
