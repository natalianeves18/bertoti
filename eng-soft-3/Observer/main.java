public class main {
    public static void main(String[] args) {
        Pontuacao pontuacao = new Pontuacao();
        Jogador jogador1 = new Jogador("Jogador 1");
        Jogador jogador2 = new Jogador("Jogador 2");
        Jogador jogador3 = new Jogador("Jogador 3");
        Jogador jogador4 = new Jogador("Jogador 4");

        pontuacao.adicionarObservador(jogador1);
        pontuacao.adicionarObservador(jogador2);
        pontuacao.adicionarObservador(jogador3);
        pontuacao.adicionarObservador(jogador4);

        pontuacao.setPontuacao(10);
        pontuacao.setPontuacao(20);
        pontuacao.setPontuacao(30);
    }
}
