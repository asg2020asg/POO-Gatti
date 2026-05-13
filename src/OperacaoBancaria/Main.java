package OperacaoBancaria;

public class Main {
    public static void main(String[] args) {
        Conta s1= new Conta(300, 10000);
        try{
            s1.depositar(-50);
        }catch(IllegalArgumentException e){
            System.out.println("Erro ao depositar:" + e.getMessage());
        }
        try {
            s1.depositar(0.0);
        }catch(IllegalArgumentException e){
            System.out.println("Erro ao depositar:" + e.getMessage());
        }
        try {
            s1.depositar(200);
            System.out.println("Deposito realizado com sucesso");
        }catch(IllegalArgumentException e){
            System.out.println("Erro ao depositar:" + e.getMessage());
        }
        System.out.println("Saldo atual: " + s1.getSaldo());
    }
}
