package Atv12_Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario f1= new Clt("Carlos",1500);
        Funcionario f2= new Freelancer("Carla",1500);
        f1.calcularSalario();
        f2.calcularSalario();
    }
}
