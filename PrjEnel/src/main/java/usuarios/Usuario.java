/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import regrasnegocio.Cobranca;
import regrasnegocio.Tarifa;
import impostos.ICMS;
import impostos.Impostos;


/**
 *
 * @author x542895
 */
public abstract class Usuario implements Impostos, Cobranca {
    
    private int consumo;
    private Tarifa tarifa;
    private ICMS icms;
    
    public Usuario(){
        this.consumo = MINIMO;
    }
    
    public Usuario(int consumo){
        this.consumo = (consumo < MINIMO)?
                MINIMO : consumo;
    }

    /**
     * @return the consumo
     */
    public int getConsumo() {
        return consumo;
    }

    /**
     * @param consumo the consumo to set
     */
    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    /**
     * @return the tarifa
     */
    public Tarifa getTarifa() {
        return tarifa;
    }

    /**
     * @param tarifa the tarifa to set
     */
    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    /**
     * @return the icms
     */
    public ICMS getIcms() {
        return icms;
    }

    /**
     * @param icms the icms to set
     */
    public void setIcms(ICMS icms) {
        this.icms = icms;
    }
    
    
    @Override
    public float getValorBase(){
        return getConsumo()*(tarifa.getTE() + tarifa.getTUSD());
    }
    
    @Override
    public float getTotalImpostos(){
        return valorIcms() + valorPis()
                + valorCofins() + valorCosip();
    }
    
    
    public float getContaTotal(){
        return getValorBase() + getTotalImpostos();
    }
    
    public float valorIcms(){
        return getValorBase()*icms.getIcms();
    }
    
    public float valorPis(){
        return getValorBase()*PIS;
    }
    
    public float valorCofins(){
        return getValorBase()*COFINS;
    }
    
    public float valorCosip(){
        return COSIP;
    }
    
    @Override
    public String toString(){
        return "**CONTA DE LUZ*** Enel***"
                +"\nConsumo(kWh):" +getConsumo()
                +String.format("\n Tarifa de Energia      R$.5f%n", tarifa.getTE())
                +String.format("\n Tarifa de Distribuição R$.5f%n", tarifa.getTUSD())
                +String.format("\n Valor Base             R$.2f%n", this.getValorBase())
                +String.format("\n ICMS                   R$.2f%n", this.valorIcms())
                +String.format("\n PIS                    R$.2f%n", this.valorPis())
                +String.format("\n COFINS                 R$.2f%n", this.valorCofins())
                +String.format("\n COSIP                  R$.2f%n", this.valorCosip())
                +String.format("\n Impostos               R$.2f%n", this.getTotalImpostos())
                +String.format("\n Total a Pagar:         R$.2f%n", this.getContaTotal());
    }
    
}

