import java.util.ArrayList;
import java.util.List;

public class Pontuacao {
    private int pontuacaoAtual;
    private List<Observer> observadores = new ArrayList<>();

    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void setPontuacao(int novaPontuacao) {
        pontuacaoAtual = novaPontuacao;
        notificarObservadores();
    }

    public int getPontuacao() {
        return pontuacaoAtual;
    }

    private void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizar(this);
        }
    }
}
