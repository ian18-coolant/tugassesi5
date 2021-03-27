/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AntrianBank;

/**
 *
 * @author Ian Mulyana
 */
public class AntrianBank {

 public static void main(String[] args) {
 Antrian antri = new Antrian(26);

 antri.insert("A");
 antri.insert("B");
 antri.insert("C");
 antri.insert("D");
 antri.insert("E");
 antri.insert("F");
 antri.insert("G");
 antri.insert("H");
 antri.insert("I");
 antri.insert("J");
 antri.insert("K");
 antri.insert("L");
 antri.insert("M");
 antri.insert("N");
 antri.insert("O");
 antri.insert("P");
 antri.insert("Q");
 antri.insert("R");
 antri.insert("S");
 antri.insert("T");
 antri.insert("U");
 antri.insert("V");
 antri.insert("W");
 antri.insert("X");
 antri.insert("Y");
 antri.insert("Z");


 antri.infoAntrian();
 System.out.println(antri.infoPalingDepan());
 System.out.println(antri.infoPalingBelakang());
 antri.infoAntrian();
 }
}
