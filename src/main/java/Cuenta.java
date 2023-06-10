/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ResetStoreX
 */
public class Cuenta {
    double saldo; 
    int agencia;
    int numero; 
    String titular;
    
    public void depositar(double valor){   
        saldo  += valor;
    }
    
    public void changeNumber(int numero){   
        this.numero += numero;
    }
    
    public boolean retirar (double value){
        if(this.saldo >= value) {
            this.saldo -= value;
            return true;
        }
        else {
            return false;
        }            
    }
    
    public boolean transferir(double valor, Cuenta cuenta){
        if(this.saldo >= valor) {
            this.saldo -= valor;
            cuenta.depositar(valor);
            return true;
        }else{
            return false;
        }
    }
}
