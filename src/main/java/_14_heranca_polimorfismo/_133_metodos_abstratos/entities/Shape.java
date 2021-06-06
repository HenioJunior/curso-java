package _14_heranca_polimorfismo._133_metodos_abstratos.entities;

import _14_heranca_polimorfismo._133_metodos_abstratos.entities.enums.Color;

public abstract class Shape {
	private Color color;
	
	public Shape() {}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract Double area();
}
