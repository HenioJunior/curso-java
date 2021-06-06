package _18_interfaces._199_herdar_vs_cumprir_contrato.solution_with_interface_and_abstract_class.model.entities;

import _18_interfaces._199_herdar_vs_cumprir_contrato.solution_with_interface_and_abstract_class.model.enums.Color;

public class Circle extends AbstractShape {

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
