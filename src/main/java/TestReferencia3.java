/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ResetStoreX
 */
public class TestReferencia3 {
    public static void main(String[] args) {
        Cuenta cuentaDeDiego = new Cuenta(1);
        
        cuentaDeDiego.getTitular().setNombre("Diego");

        System.out.println(cuentaDeDiego.getTitular().getNombre());
        
        
    }
}
