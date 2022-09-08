package bangundatar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Persegi extends BangunDatar{
    
    private float s;
    
    public Persegi (float s){
        this.s =s;
    }
    
    @Override
    public void hitungLuas (){
        this.luas = s*s;
    }
    
    @Override
    public void hitungKeliling (){
        this.keliling = 4*s;
    }
}
