package atividade6filapilha;

import java.util.LinkedList;
import java.util.Scanner;

public class at1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		LinkedList<String> clientes = new LinkedList<String>();
		
		int opcao;
		
		while(true) {
			System.out.println("Menu");
			System.out.println("1- Adicionar um novo cliente na fila. ");
			System.out.println("2- Listar todos os Clientes na fila");
			System.out.println("3- Chamar (retirar) uma pessoa na fila");
			System.out.println("0- O programa deve ser finalizado.");
			opcao = scanner.nextInt();
			scanner.skip("\\R?");
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do cliente: ");
				String cliente = scanner.nextLine();
				clientes.add(cliente);
				break;
				
			case 2:
				System.out.println("Listar todos os clientes: ");
				System.out.println(clientes);
				break;
				
			case 3:
				System.out.println("Cliente retirado: " + clientes.remove());
				break;
				
			case 0:
				scanner.close();
				System.exit(0);
				break;
				
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
	}
}
