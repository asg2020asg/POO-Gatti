package Mensagem;

public class Main {
    public static void main(String[] args) {
        Notificacao email = new Email();
        email.enviarMensagem();
        Notificacao sms = new SMS();
        sms.enviarMensagem();
    }
}
