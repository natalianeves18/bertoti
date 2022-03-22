//Exercício Strategy: Como saber o que vini está assistindo no momento? 
//Vini possui três opções para assistir, sendo eles: Série, Filme e Vídeo.
import { Pessoa } from './pessoa';
import { Serie } from './programaFavorito';

// Testar a função
const Vini = new Pessoa('Vini', new Serie())
Vini.assistir()