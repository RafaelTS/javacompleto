package br.sc.rafael.secao18.model.devices;

public class ConcretePrinter extends Device implements Printer {

    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Print Processing: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc);

    }


}
