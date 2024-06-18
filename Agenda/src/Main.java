import agenda.Agenda;
import agenda.Contato;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Remover contato");
            System.out.println("3. Atualizar contato");
            System.out.println("4. Listar contatos");
            System.out.println("5. Pesquisar contato");
            System.out.println("6. Salvar contatos");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    adicionarContato(agenda, scanner);
                    break;
                case 2:
                    removerContato(agenda, scanner);
                    break;
                case 3:
                    atualizarContato(agenda, scanner);
                    break;
                case 4:
                    agenda.listarContatos();
                    break;
                case 5:
                    pesquisarContato(agenda, scanner);
                    break;
                case 6:
                    agenda.salvarContato();
                    break;
                case 7:
                    agenda.salvarContato();
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 7);

        scanner.close();
    }

    private static void adicionarContato(Agenda agenda, Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        if (nome.isEmpty()) {
            System.out.println("Nome não pode ser vazio.");
            return;
        }
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        Contato contato = new Contato(nome, telefone, email);
        agenda.AdicionarContato(contato);
    }

    private static void removerContato(Agenda agenda, Scanner scanner) {
        System.out.print("Nome do contato a remover: ");
        String nomeRemover = scanner.nextLine();
        agenda.removerContato(nomeRemover);
    }

    private static void atualizarContato(Agenda agenda, Scanner scanner) {
        System.out.print("Nome do contato a atualizar: ");
        String nomeAtualizar = scanner.nextLine();
        System.out.print("Novo Telefone: ");
        String novoTelefone = scanner.nextLine();
        System.out.print("Novo Email: ");
        String novoEmail = scanner.nextLine();
        agenda.atualizarContato(nomeAtualizar, novoTelefone, novoEmail);
    }

    private static void pesquisarContato(Agenda agenda, Scanner scanner) {
        System.out.print("Nome do contato a pesquisar: ");
        String nomePesquisar = scanner.nextLine();
        agenda.pesquisarContato(nomePesquisar);
    }
}
