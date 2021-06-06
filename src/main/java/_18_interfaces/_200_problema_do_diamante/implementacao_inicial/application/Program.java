package _18_interfaces._200_problema_do_diamante.implementacao_inicial.application;


import _18_interfaces._200_problema_do_diamante.implementacao_inicial.devices.Printer;
import _18_interfaces._200_problema_do_diamante.implementacao_inicial.devices.Scanner;

public class Program {

	public static void main(String[] args) {

		Printer p = new Printer("1080");
		p.processDoc("My Letter");
		p.print("My Letter");

		Scanner s = new Scanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
	}
}
