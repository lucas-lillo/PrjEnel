/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package regrasnegocio;

/**
 *
 * @author x542895
 */
public interface Cobranca {
    
    //Valor mínimo cobrado mensalmente
    // consumo em KWh
    
    int MINIMO = 50;
    
    // Quanto o cliente paga SEM impostos
    float getValorBase();
    
}
