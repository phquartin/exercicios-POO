package dificil.exercicio01.servico;

import dificil.exercicio01.dominio.Tarefa;
import dificil.exercicio01.dominio.Usuario;
import dificil.exercicio01.repositorio.RepositorioUsuario;

import java.util.Scanner;

public final class UsuarioUI implements RepositorioUsuario {

    Scanner sc = new Scanner(System.in);

    @Override
    public void cadastrarTarefa(Usuario usuario) {
        System.out.println("Cadastrando uma tarefa...");
        System.out.print("Qual o titulo do tarefa?: ");
        String titulo = sc.nextLine();
        System.out.println("Daqui a quanto tempo voce quer ser lembrado?: ");
        int dias = sc.nextInt();
        sc.nextLine();
        Tarefa tarefa = new Tarefa(titulo, dias);
        usuario.adicionarTarefas(tarefa);
    }

    @Override
    public void listarTarefas(Usuario usuario) {
        System.out.println("Tarefas: ");
        for(Tarefa tarefa : usuario.getTarefas()) {
            System.out.println("Tarefa: "+ tarefa.getTitulo());
            System.out.println("Dias restantes: "+ tarefa.getDias());
            System.out.println("Conclusao: " + tarefa.isConcluida());
            System.out.println("------------------------------------");
        }
        System.out.println("Digite ENTER para continuar");
        sc.nextLine();
    }

    @Override
    public void removerTarefa(Usuario usuario) {
        int count = 0;
        for(Tarefa tarefa : usuario.getTarefas()) {
            System.out.println(++count + " - " + tarefa);
        }
        System.out.print("Qual o id do tarefa que deseja remover?: ");
        int id = sc.nextInt();
        usuario.getTarefas().remove(id - 1);
    }

    @Override
    public void concluirTarefa(Usuario usuario) {
        int count = 0;
        for(Tarefa tarefa : usuario.getTarefas()) {
            System.out.println(++count + " - " + tarefa);
        }
        System.out.print("Qual o id do tarefa que deseja concluir?: ");
        int id = sc.nextInt();
        usuario.getTarefas().get(id - 1).setConcluida(true);
    }
}
