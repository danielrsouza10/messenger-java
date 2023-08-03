package apps;
public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //mais um metodo que todos os filhos deverao implementar
    public abstract void salvarHistoricoMensagem();

    //somente as classes filhas conhecem este metodo
    protected void validarConectadoInternet(){
        System.out.println("Verificando conexao com a internet...");
    }
}
