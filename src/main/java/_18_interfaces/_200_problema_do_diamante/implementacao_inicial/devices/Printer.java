package _18_interfaces._200_problema_do_diamante.implementacao_inicial.devices;

public class Printer extends Device {

    public Printer(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing: " + doc);
    }

    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}