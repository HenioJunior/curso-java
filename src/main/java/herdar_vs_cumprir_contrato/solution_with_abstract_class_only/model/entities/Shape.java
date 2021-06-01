package herdar_vs_cumprir_contrato.solution_with_abstract_class_only.model.entities;

import herdar_vs_cumprir_contrato.solution_with_abstract_class_only.model.enums.Color;

public abstract class Shape {

	private Color color;

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract double area();
}
