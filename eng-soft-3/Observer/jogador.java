public class Jogador implements Observer {
    private String nome;
    private int pontuacao;

    public Jogador(String nome) {
        this.nome = nome;
        pontuacao = 0;
    }

    public void atualizar(Pontuacao pontuacao) {
        int novaPontuacao = pontuacao.getPontuacao();
        System.out.println("Pontuação atualizada para " + novaPontuacao + " para " + nome);
        pontuacaoAtualizada(novaPontuacao);
    }

    private void pontuacaoAtualizada(int novaPontuacao) {
        pontuacao = novaPontuacao;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
