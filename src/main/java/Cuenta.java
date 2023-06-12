/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ResetStoreX
 */

public class Cuenta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    
    private static int total = 0;


    public Cuenta(int agencia){        
        if(agencia <= 0 ){
            System.out.println("No se permite 0: "+agencia);     
            this.agencia = 1;
        }     
        else{
            this.agencia = agencia;
        }        
        total++;        
        System.out.println("numero actula de cuentas: "+total);
    }
    
    
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfiere(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia > 0){
            this.agencia = agencia; 
        }else{
            System.out.println("No estan permitidos los valores negativos");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

}
