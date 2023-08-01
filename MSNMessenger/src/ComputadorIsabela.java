public class ComputadorIsabela {

    public static void main(String[] args) {
        //abrindo MSN Messenger

        MSNMessenger msn = new MSNMessenger();

        msn.enviarMensagem();

        msn.receberMensagem();

        FacebookMessenger fcb = new FacebookMessenger();

        fcb.enviarMensagem();

        TelegramMessenger tlg = new TelegramMessenger();

        tlg.enviarMensagem();
    }
}
