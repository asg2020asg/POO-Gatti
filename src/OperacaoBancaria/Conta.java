package OperacaoBancaria;

public class Conta {
    private double saldo;
    private double limite;
    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void depositar(double valor){
        if(valor<0){
            throw new IllegalArgumentException("Valor de depósito inválido " + valor + ". O valor deve ser positivo.");
        }if(valor==0){
            throw new IllegalArgumentException("Valor de depósito inválido " + valor + ". O valor deve ser positivo.");
        }
        this.saldo += valor;
    }

}
