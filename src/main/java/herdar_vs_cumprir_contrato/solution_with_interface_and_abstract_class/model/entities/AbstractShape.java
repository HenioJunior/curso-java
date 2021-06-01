package herdar_vs_cumprir_contrato.solution_with_interface_and_abstract_class.model.entities;

import herdar_vs_cumprir_contrato.solution_with_interface_and_abstract_class.model.enums.Color;

public abstract class AbstractShape implements Shape {

	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
