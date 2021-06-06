package _18_interfaces._200_problema_do_diamante.implementacao_inicial.devices;

public class Scanner extends Device {

    public Scanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }

    public String scan() {
        return "Scanned content";
    }
}
