package apps;
public class FacebookMessenger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook...");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook...");
        salvarHistoricoMensagem();
    }

    public void salvarHistoricoMensagem(){
        System.out.println("Salvando historico no servidor...");
    }
}
