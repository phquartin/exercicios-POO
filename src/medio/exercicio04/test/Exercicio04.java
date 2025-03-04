package medio.exercicio04.test;

import medio.exercicio04.dominio.Aluno;
import medio.exercicio04.dominio.Curso;

public class Exercicio04 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Pedro", 20, "123456789");
        Aluno aluno2 = new Aluno("Joao", 21, "124532459");

        Aluno[] alunos = {aluno, aluno2};

        Curso curso = new Curso("Java", alunos);

        System.out.println(curso);

    }
}
