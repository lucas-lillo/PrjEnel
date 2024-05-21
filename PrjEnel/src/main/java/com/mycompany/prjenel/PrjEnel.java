/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjenel;

import java.util.Scanner;
import regrasnegocio.Cobranca;
import regrasnegocio.Tarifa;
import impostos.ICMS;
import impostos.Impostos;
import usuarios.Usuario;

/**
 *
 * @author x542895
 */
public class PrjEnel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira qual tipo o tipo de consumo da conta de luz:\n");
        System.out.print("1 - Consumidor Residencial.\n");
        System.out.print("2 - Consumidor de Baixa Renda.\n");
        System.out.print("3 - Consumidor Rural.\n");
        System.out.print("4 - Consumidor do Serviço Público de Iluminação.\n");
        System.out.print("5 - Consumidor Não Classificado.\n");
        int tipoConsumidor = scan.nextInt();
        System.out.print("Insira o valor do consumo mensal de eletricidade (em Kwh):\n");
        int consumo = scan.nextInt();
        
        Usuario usuario;
        
        switch(tipoConsumidor){
            case 1 : 
                consumo = 1;
                break;            
            case 2 : tipoConsumidor = 2;
                break;
            case 3 : tipoConsumidor = 3;
                break;
            case 4 : tipoConsumidor = 4;
                break;
            case 5 : tipoConsumidor = 5;
                break;
            default : System.out.println("Tipo de Usuário Imcompátivel!");
            
        }
    }
}
