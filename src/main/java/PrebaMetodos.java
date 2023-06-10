/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ResetStoreX
 */
public class PrebaMetodos {
    public static void main(String[] args) {
        Cuenta cuentaDeJohn = new Cuenta();
        Cuenta cuentaDeJuli = new Cuenta();
        
        cuentaDeJuli.depositar(1000);
        cuentaDeJohn.depositar(500);
        
        System.out.println(cuentaDeJuli.saldo);
        System.out.println(cuentaDeJohn.saldo);

        if(cuentaDeJuli.transferir(400, cuentaDeJohn)){
            System.out.println("Transferencia Exitosa");
        }else {
            System.out.println("No es posible");
        }
        
        System.out.println(cuentaDeJohn.saldo);
        
        System.out.println(cuentaDeJuli.saldo);
        
    }
}
