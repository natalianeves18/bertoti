
enum ProgramaFavorito {
  Serie, Filme, Video
}

class Pessoa {
  public nome: String;
  
  public programaFavorito: ProgramaFavorito;

  constructor(nome: string, programaFavorito: ProgramaFavorito) {
    this.nome = nome;
    this.programaFavorito = programaFavorito;
  }

  assistir(): void {
    console.log(`${this.nome} decidiu: `);
    if (this.programaFavorito == ProgramaFavorito.Serie) {
      console.log('Assistir uma nova série.')
    } else if (this.programaFavorito == ProgramaFavorito.Filme) {
      console.log('Assistir um novo filme.')
    } else if (this.programaFavorito == ProgramaFavorito.Video) {
      console.log('Assistir um vídeo no youtube.')
    }
  }

}

// Testar a função
//const Vini = new Pessoa('Vini', programaFavorito.Serie)
const Vini = new Pessoa('Vini', ProgramaFavorito.Serie)
Vini.assistir()