/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package impostos;

/**
 *
 * @author x542895
 */
public enum ICMS {
    
    RESIDENCIAL(0.00f),
    RESIDENCIAL_91(0.12f),
    RESIDENCIAL_200(0.25f),
    PUBLICO(0.18f),
    OUTROS(0.18f);
    
    ICMS(float imp){
        this.icms = imp;
    }
    
    private float icms;
    
    public float getIcms(){
        return icms;
    }
    
    public void setIcms(float icms) {
        this.icms = icms;
    }
    
}
