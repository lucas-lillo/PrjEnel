/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package impostos;

/**
 *
 * @author x542895
 */
public interface Impostos {
    
    float PIS = 0.0095f; //0,95%
    float COFINS = 0.0439f; //4,39%
    float COSIP = 9.70f; // R$ 9,70
    
    float getTotalImpostos();
    
}
