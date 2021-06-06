package _18_interfaces._200_problema_do_diamante.com_implementacao_interface.application;


import _18_interfaces._200_problema_do_diamante.com_implementacao_interface.devices.ComboDevice;
import _18_interfaces._200_problema_do_diamante.com_implementacao_interface.devices.ConcretePrinter;
import _18_interfaces._200_problema_do_diamante.com_implementacao_interface.devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {

		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");

		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());
	}
}
