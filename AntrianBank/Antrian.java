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
class Antrian {
 private String [] data;
 private int palingdepan, palingbelakang;
 private int maksElemen;
 public Antrian(int ukuran){
 palingdepan =0;
 palingbelakang=0;
 maksElemen = ukuran;
 data = new String[ukuran];
 }

 public void insert(String x){
 if(palingbelakang==maksElemen){
 System.out.println("Antrian Penuh");
 System.out.println(x + " Tidak masuk kedalam antrian");
 }
 else{
 data[palingbelakang] = x;
 palingbelakang++;
 }
 }

 public String infoPalingBelakang(){
 return data[palingbelakang-1];
 }

 public String infoPalingDepan(){
 return data[palingdepan];
 }

 public String remove(){
 String d = data[palingdepan];
 data[palingdepan]=null;
 palingdepan++;
 return d;
 }

 public void infoAntrian(){
 for(int i=0;i<data.length;i++){
 System.out.println(i + 1 + "." + data[i]);
 }
 }

}

