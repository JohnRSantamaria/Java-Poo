/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author John Santamaria
 */
public class PrebaMetodos {
    public static void main(String[] args) {
        Cuenta cuentaDeJohn = new Cuenta(1);
        Cuenta cuentaDeJuli = new Cuenta(1);
        
        cuentaDeJuli.deposita(1000);
        cuentaDeJohn.deposita(500);
        
        System.out.println(cuentaDeJuli.getSaldo());
        System.out.println(cuentaDeJohn.getSaldo());

        if(cuentaDeJuli.transfiere(400, cuentaDeJohn)){
            System.out.println("Transferencia Exitosa");
        }else {
            System.out.println("No es posible");
        }
        
        System.out.println(cuentaDeJohn.getSaldo());
        
        System.out.println(cuentaDeJuli.getSaldo());
        
    }
}
