/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ResetStoreX
 */
public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 1000;

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.saldo = 1200;
        
        System.out.println(primeraCuenta.saldo);
        System.out.println(segundaCuenta.saldo);
    }
}
