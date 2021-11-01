package br.sc.rafael.secao19.program;

import java.util.ArrayList;
import java.util.List;

import br.sc.rafael.secao19.entities.Circle;
import br.sc.rafael.secao19.entities.Rectangle;
import br.sc.rafael.secao19.entities.Shape;

public class CorinDelimProgram {
	
	public static void main(String[] args) {
		
		List<Shape> myShape = new ArrayList<Shape>();
		myShape.add(new Rectangle(3.0, 2.0));
		myShape.add(new Circle(2.0));
		
		System.out.println("Total area: " + totalArea(myShape));
		
		List<Circle> myCircle = new ArrayList<Circle>();
		myCircle.add(new Circle(2.0));
		myCircle.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myCircle));

	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
