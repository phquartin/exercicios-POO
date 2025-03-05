package dificil.exercicio01.dominio;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private int idade;
    private List<Tarefa> tarefas;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.tarefas = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public void adicionarTarefas(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

}
