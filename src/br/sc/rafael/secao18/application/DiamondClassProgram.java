package br.sc.rafael.secao18.application;

import br.sc.rafael.secao18.model.devices.ComboDevice;
import br.sc.rafael.secao18.model.devices.ConcretePrinter;
import br.sc.rafael.secao18.model.devices.ConcreteScanner;


public class DiamondClassProgram {
    public static void main(String[] args) {

        ConcretePrinter concretePrinter = new ConcretePrinter("1080");
        concretePrinter.processDoc("My letter");
        concretePrinter.print("My letter");

        System.out.println();
        ConcreteScanner concreteScanner = new ConcreteScanner("2003");
        concreteScanner.processDoc("My email");

        System.out.println();
        ComboDevice comboDevice = new ComboDevice("2081");
        comboDevice.processDoc("My dissertation");
        comboDevice.print("My dissertation");
        System.out.println("Scan result: " + comboDevice.scan());


    }
}
