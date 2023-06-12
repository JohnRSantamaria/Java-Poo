/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ResetStoreX
 */
public class PruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1);        
        cuenta.setAgencia(-22);
        cuenta.deposita(400);
        cuenta.saca(300);
        System.out.println(cuenta.getSaldo());
        System.out.println(cuenta.getAgencia());
    }
}
