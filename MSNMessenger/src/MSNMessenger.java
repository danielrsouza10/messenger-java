public class MSNMessenger {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem...");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem...");
    }

    //metodos privados, visiveis somente na classe
    private void validarConectadoInternet(){
        System.out.println("Validando conexao...");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando historico...");
    }
}
