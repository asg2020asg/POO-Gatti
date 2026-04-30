package Gato;

public class Gato {
    public String nome;
    public int qtdComidaDisponivel;
    public boolean sono;
    public Gato(String nome, int qtdComidaDisponivel, boolean sono) {
        this.nome = nome;
        this.qtdComidaDisponivel = qtdComidaDisponivel;
        this.sono = sono;
    }
    public void dormir(){
        this.sono=true;
        System.out.println(nome+ " dormiu!");
    }
    public void comer(){
        if(qtdComidaDisponivel>0){
            qtdComidaDisponivel--;
            System.out.println(nome+ " comeu. Restante: "+qtdComidaDisponivel);
        }
        else{
            System.out.println(nome+ " está sem comida");
        }
    }

}
