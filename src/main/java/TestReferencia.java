/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ResetStoreX
 */
public class TestReferencia {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 200;           
        
        Cuenta segundaCuenta = primeraCuenta;        
        segundaCuenta.saldo = 100;
                
        System.out.println(primeraCuenta.saldo);
        System.out.println(segundaCuenta.saldo);

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
    }
}
