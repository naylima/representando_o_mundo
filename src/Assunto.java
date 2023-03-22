public class Assunto {
  private String nome;
  private Materia materia;

  public Assunto (String nome, Materia materia) {
    this.nome = nome;
    this.materia = materia;
  }

  public String getNome() {
		return this.nome;
	}

  public Materia getMateria() {
		return this.materia;
	}
}
