package br.fai.clinica;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			Main app = new Main();
			app.start();
		}
		Scanner scan = new Scanner (System.in);
		private void start() {
			System.out.println("---M-E-N-U---");
			System.out.println("1 - Cadastrar cavalo");
			System.out.println("2 - Cadastrar girafa");
			System.out.println("3 - Listar cavalos");
			System.out.println("4 - Listar girafas");
			System.out.println("5 - Listar todos os animais");
			System.out.println("6 - Remover um animal por id");
			System.out.println("7 - Exibir a quantidade de animais "
					+ 		   	   "cadastrados por tipo  ");
			System.out.println("8 - sair");
			
			System.out.println("\nDigite uma opcao: ");
			int opcao = scan.nextInt();
			
			switch(opcao) {
			
			case 1: System.out.println("Voce escolheu a opcao 1:");
					break;
			case 2: 
					break;
			case 3: 
					break;
			case 4: 
					break;
			case 5: 
					break;
			case 6: 
					break;
			case 7: 
					break;
			default: System.out.println("Saindo....");
					break;
			
				
			}
		}

	}