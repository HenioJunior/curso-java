package _18_interfaces._199_herdar_vs_cumprir_contrato.solution_with_interface_and_abstract_class.model.entities;

import _18_interfaces._199_herdar_vs_cumprir_contrato.solution_with_interface_and_abstract_class.model.enums.Color;

public class Rectangle extends AbstractShape {

	private Double width;
	private Double height;

	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
}
