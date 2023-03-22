public class Materia {
  private String nome;
  private String faculdade;

  public Materia (String nome, String faculdade) {
    this.nome = nome;
    this.faculdade = faculdade;
  }

  public String getNome() {
		return this.nome;
	}

  public String getFaculdade() {
		return this.faculdade;
	}
}
