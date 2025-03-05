package dificil.exercicio01.dominio;

public class Tarefa {
    private String titulo;
    private int dias;
    private boolean concluida;

    public Tarefa(String titulo, int dias) {
        this.titulo = titulo;
        this.dias = dias;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDias() {
        return dias;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "titulo='" + titulo + '\'' +
                ", dias=" + dias +
                ", concluida=" + concluida +
                '}';
    }
}
