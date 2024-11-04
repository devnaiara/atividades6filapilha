package atividade6filapilha;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class at2 {

	public static void main(String[] args) {

		Stack<String> bandas = new Stack<String>();

			Scanner scanner = new Scanner(System.in);
			
			int opcao;
			
			while(true) {
				System.out.println("Menu");
				System.out.println("1- Adicionar uma banda: ");
				System.out.println("2- Listar todas as bandas: ");
				System.out.println("3- Chamar (retirar) uma banda da pilha: ");
				System.out.println("0- O programa deve ser finalizado.");
				opcao = scanner.nextInt();
				scanner.skip("\\R?");
				
				switch (opcao) {
				case 1:
					System.out.println("Digite o nome da banda: ");
					String banda = scanner.nextLine();
					bandas.push(banda);
					break;
					
				case 2:
					System.out.println("Listar todas as bandas: ");
					System.out.println(bandas);
					break;
					
				case 3:
					System.out.println("Banda Retirada: " + bandas.pop());
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

