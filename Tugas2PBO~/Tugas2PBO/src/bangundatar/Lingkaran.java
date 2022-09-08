package bangundatar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Lingkaran extends BangunDatar{
    
    private float phi=22/7;
    private float r;
    
    
    public Lingkaran(float r){
        this.r = r;
    
    }
    
    @Override
    public void hitungLuas(){
        this.luas = phi*r*r;
    }
    
    @Override
    public void hitungKeliling(){
        this.keliling = 2*phi*r;
    }
}
