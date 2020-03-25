package br.fai.clinica;

import br.fai.clinica.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	static Map<Integer, String> mapaAnimais = new HashMap<Integer, String>();
	private static List<Cavalo> listaCavalos = new ArrayList<Cavalo>();
	private static List<Girafa> listagirafa = new ArrayList<Girafa>();

	Scanner ler = new Scanner(System.in);

	private void start() {
		System.out.println("---M-E-N-U---");
		System.out.println("1 - Cadastrar cavalo");
		System.out.println("2 - Cadastrar girafa");
		System.out.println("3 - Listar cavalos");
		System.out.println("4 - Listar girafas");
		System.out.println("5 - Listar todos os animais");
		System.out.println("6 - Remover um animal por id");
		System.out.println("7 - Exibir a quantidade de animais " + "cadastrados por tipo  ");
		System.out.println("8 - sair");

		int opcao = 0;
		int contgirafa = 0;
		int contcavalo = 0;
		
		do {
			System.out.print("\nDigite uma opcao: ");
			opcao = ler.nextInt();
			

			switch (opcao) {

			case 1:
				adicionarCavalos();
				break;
			case 2:
				adicionargirafas();
				break;
			case 3:
			{
				for (Cavalo cavalo : listaCavalos) {
					System.out.println("Ïd: " + cavalo.getId() + "| Nome: " + cavalo.getNome());
				}
			}
			break;
			
			case 4:
			{
				for (Girafa girafa : listagirafa) {
					System.out.println("Ïd: " + girafa.getId() + "| Nome: " + girafa.getNome());
				}
			}
				break;
			case 5:
				Listaritens();
				break;
			case 6: 
			{
				int idRemove;
				Boolean achou = false;
				System.out.print("\nDigite o Id do animal : ");
				idRemove = ler.nextInt();
				ler.nextLine();
				
				for (int i = 0; i < listaCavalos.size(); i++) {
					
					Cavalo cavalo = listaCavalos.get(i);
					if (cavalo.getId() == idRemove)
					{
						listaCavalos.remove(i);
						achou = true;
						System.out.println("Cavalo removido com sucesso!!");
					}
				}
				
				if (!achou)
				{
					for (int i = 0; i < listagirafa.size(); i++) {
						
						Girafa girafa = listagirafa.get(i);
						if (girafa.getId() == idRemove)
						{
							listagirafa.remove(i);
							System.out.println("Girafa removido com sucesso!!");
						}
					}
				}
				
				mapaAnimais.remove(idRemove);
			}
				
				break;
			case 7:
			{
				for (Girafa girafa : listagirafa) {
					contgirafa += 1;
				}
				System.out.println(" A quantidade de Girafa é : " +contgirafa);
				for (Cavalo cavalo : listaCavalos) {
					contcavalo += 1;
				}
				System.out.println(" A quantidade de Cavalo é : " +contcavalo);
				
			}
				break;
			default:
				System.out.println("Saindo....");
				break;

			}
		} while (opcao < 8);

	}

	public void adicionarCavalos() {
		System.out.print("\nDigite o id do cavalo :");
		int id = ler.nextInt();
		ler.nextLine();
		System.out.print("\nDigite o nome do cavalo :");
		String nome = ler.nextLine();
		Cavalo cavalo = new Cavalo(nome);
		cavalo.setId(id);
		listaCavalos.add(cavalo);
		System.out.println("O cavalo foi inserido com sucesso!!");
	}
	public void adicionargirafas() {
		System.out.print("\nDigite o id da girafa :");
		int id = ler.nextInt();
		ler.nextLine();
		System.out.print("\nDigite o nome da girafa :");
		String nome = ler.nextLine();
		Girafa girafa = new Girafa (nome);
		girafa.setId(id);
		listagirafa.add(girafa);
		System.out.println("A girafa foi inserido com sucesso!!");
	}
	public void Listaritens()	{
		for (Girafa girafa : listagirafa) {
			System.out.println("Ïd da girafa : " + girafa.getId() + "| Nome da girafa: " + girafa.getNome());
		}
		for (Cavalo cavalo : listaCavalos) {
			System.out.println("Ïd do cavalo: " + cavalo.getId() + "| Nome do cavalo: " + cavalo.getNome());
		}
	}
	
}