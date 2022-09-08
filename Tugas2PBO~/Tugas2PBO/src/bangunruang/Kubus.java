package bangunruang;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Kubus extends BangunRuang{
    
    private float s;
    
    public Kubus (float s){
        this.s = s;
    }
    
    @Override
    public void hitungLuas (){
        this.luas = 6*s*s;
    }
    
    @Override
    public void hitungKeliling (){
        this.keliling = 12*s;
    }
    
    @Override
    public void hitungVolume (){
        this.volume = s*s*s;
    }
}
