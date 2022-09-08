package bangundatar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */


public class PersegiPanjang extends BangunDatar {
    
    private float p;
    private float l;
    
    public PersegiPanjang(float p, float l){
        this.p = p;
        this.l = l;
    }
    
    @Override
    public void hitungLuas(){
        this.luas = p*l;
    }
    
    @Override
    public void hitungKeliling(){
        this.keliling = 2*p+l;
    }
    
}
