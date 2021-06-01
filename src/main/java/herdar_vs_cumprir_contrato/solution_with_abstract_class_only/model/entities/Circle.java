package herdar_vs_cumprir_contrato.solution_with_abstract_class_only.model.entities;

import herdar_vs_cumprir_contrato.solution_with_abstract_class_only.model.enums.Color;

public class Circle extends Shape {

	private Double radius;

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
