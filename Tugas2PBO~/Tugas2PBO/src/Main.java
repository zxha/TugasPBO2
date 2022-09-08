
import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangundatar.PersegiPanjang;
import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Kubus;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Main {
    
    public static void main(String[] args) {
        
       Lingkaran lingkaran = new Lingkaran(10);
       Persegi persegi = new Persegi(5);
       PersegiPanjang persegipanjang = new PersegiPanjang(6,7);
       Balok balok = new Balok (2,3,4);
       Bola bola = new Bola (2,3);
       Kubus kubus = new Kubus  (5);
       
       
       lingkaran.hitungLuas();
       lingkaran.hitungKeliling();
       lingkaran.printInfo();
       
       persegi.hitungLuas();
       persegi.hitungKeliling();
       persegi.printInfo();
       
       persegipanjang.hitungLuas();
       persegipanjang.hitungKeliling();
       persegipanjang.printInfo();
       
       balok.hitungKeliling();
       balok.hitungLuas();
       balok.hitungVolume();
       balok.printInfo();
       
       bola.hitungLuas();
       bola.hitungVolume();
       bola.printInfo();
       
       kubus.hitungKeliling();
       kubus.hitungLuas();
       kubus.hitungVolume();
       kubus.printInfo();
       
    }
    
}
