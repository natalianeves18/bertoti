//Exercício Strategy: Como saber o que vini está assistindo no momento? 
//Vini possui três opções para assistir, sendo eles: Série, Filme e Vídeo.

export interface ProgramaFavorito {
  assistir(): void;
}

export class Serie implements ProgramaFavorito {
  public assistir(): void {
    console.log('Assistir Série.')
  }
}

export class Filme implements ProgramaFavorito {
  public assistir(): void {
    console.log('Assistir Filme.')
  }
}

export class Video implements ProgramaFavorito {
  public assistir(): void {
    console.log('Assistir Vídeo.')
  }
}

export class Outro implements ProgramaFavorito {
  public assistir(): void {
    console.log('Assistir outro programa.')
  }
}