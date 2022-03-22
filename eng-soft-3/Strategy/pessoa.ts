import { ProgramaFavorito } from './programaFavorito'

export class Pessoa {
  public nome: String;
  public programaFavorito: ProgramaFavorito;

  //constructor(nome: string, exercicioFavorito: ProgramaFavorito) {
  constructor(nome: string, programaFavorito: ProgramaFavorito) {
    this.nome = nome;
    // this.programaFavorito = programaFavorito;
    this.programaFavorito = programaFavorito;
  }

  assistir(): void {
    console.log(`${this.nome} decidiu: `);
    this.programaFavorito.assistir();
  }

}