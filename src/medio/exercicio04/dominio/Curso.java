package medio.exercicio04.dominio;

import java.util.Arrays;

public class Curso {
    private String nome;
    private Aluno[] alunos;

    public Curso(String nome, Aluno[] alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", alunos=" + Arrays.toString(alunos) +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
