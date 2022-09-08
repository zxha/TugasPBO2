package bangunruang;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Bola extends BangunRuang{
    
    private float r;
    private float phi =22/7;
    private float t;
    
    public Bola (float r, float t){
        this.r = r;
        this.t = t;
    }
    
    @Override
    public void hitungLuas (){
        this.luas = phi*r*r;
    }
    
    @Override
    public void hitungVolume (){
        this.volume = phi*r*r*t;
    }
    

}
