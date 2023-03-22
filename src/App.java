public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("Jhon", "john@email.com", "engenharia", "UFRJ");
        Materia materia = new Materia("calculo 1", "UFRJ");
        Assunto assunto = new Assunto("limites", materia);



        System.out.println("O aluno " + aluno.getNome() + " está inscrito na matéria " + materia.getNome() + " da " + materia.getFaculdade());
        System.out.println(aluno.getNome() + " está estudando o assunto " + assunto.getNome() + " de " + materia.getNome());
    }
}
