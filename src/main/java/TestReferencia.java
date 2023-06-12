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
        Cuenta primeraCuenta = new Cuenta(1);
        primeraCuenta.deposita(200);

        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.deposita(100);

        System.out.println(primeraCuenta.getSaldo());
        System.out.println(segundaCuenta.getSaldo());

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
    }
}
