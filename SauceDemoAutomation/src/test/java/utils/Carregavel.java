package utils;

import java.util.Calendar;

import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class Carregavel {

	protected final RemoteWebDriver driver;
    protected SeleniumActions actions;
	
    public Carregavel(RemoteWebDriver driver) {
		this.driver = driver;
		this.actions = new SeleniumActions(driver);
	}
    
    protected abstract boolean estaPronto();
    
    public boolean carregado() {
        try {
            return estaPronto();
        } catch(Exception e) {
            return false;
        }
    }

    /**
     * Aguarda o carregamento do componente até um determinado tempo limite.
     * Falha o teste se não for encontrado.
     * 
     * @param timeout tempo limite em segundos
     */
    public void aguardar(int timeout) {
        long momentoInicial = Calendar.getInstance().getTimeInMillis();
        System.out.print("Aguardando " + getClass().getSimpleName() + "...");
        espera.aguardarCondicao(timeout)
            .withMessage("Tempo esgotado aguardando " + getClass().getSimpleName())
            .ignoring(Exception.class)
            .until(driver -> {
                System.out.print(".");
                return estaPronto();
            });
        double tempoDecorridoMillis = Calendar.getInstance().getTimeInMillis() - momentoInicial;
        double tempoDecorridoSegundos = tempoDecorridoMillis / 1000;
        System.out.println("[" + Bmouaajm_Formatador.formatarNumerico(tempoDecorridoSegundos) + "s]");
    }
    
    /**
     * Aguarda o carregamento do componente até um determinado tempo limite.
     * Não falha o teste se não for encontrado.
     * 
     * @param timeout
     */
    public void aguardarSemFalhar(int timeout) {
        try {
            aguardar(timeout);
        } catch(Exception e) {
            System.out.println(getClass().getSimpleName() + " não encontrado, continuando...");
        }        
    }
}
