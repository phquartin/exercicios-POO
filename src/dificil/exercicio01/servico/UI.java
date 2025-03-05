package dificil.exercicio01.servico;

import dificil.exercicio01.dominio.Usuario;
import dificil.exercicio01.repositorio.RepositorioUsuario;

import java.util.Scanner;

public final class UI {
    public static void Start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\tBem vindo ao Sistema de Cadastro de Tarefa!");
        System.out.print("Digite seu nome:");
        String username = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        Usuario usuario = new Usuario(username, idade);
        RepositorioUsuario UI = new UsuarioUI();
        while (true){
            System.out.println("\t\tOque voce deseja fazer?");
            System.out.println("1 - Cadastrar uma Tarefa");
            System.out.println("2 - Remover uma Tarefa");
            System.out.println("3 - Listar as Tarefas");
            System.out.println("4 - Concluir as Tarefas");
            System.out.println("0 - Sair");
            switch (sc.nextInt()) {
                case 1:
                    UI.cadastrarTarefa(usuario);
                    break;
                case 2:
                    UI.removerTarefa(usuario);
                    break;
                case 3:
                    UI.listarTarefas(usuario);
                    break;
                case 4:
                    UI.concluirTarefa(usuario);
                    break;
                case 0:
                    return;
            }
        }
    }

}
