import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.TelegramMessenger;

public class ComputadorIsabela {

    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        /*
         * Nao sabe qual APP
         * Mas Qualquer um deverá enviar e receber mensagem
         */

        String appEscolhido = "fbm";

        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tlg")) {
            smi = new TelegramMessenger();
        }

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
