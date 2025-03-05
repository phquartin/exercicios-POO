package dificil.exercicio01.repositorio;

import dificil.exercicio01.dominio.Usuario;

public interface RepositorioUsuario {
    void cadastrarTarefa(Usuario usuario);
    void listarTarefas(Usuario usuario);
    void removerTarefa(Usuario usuario);
    void concluirTarefa(Usuario usuario);
}
