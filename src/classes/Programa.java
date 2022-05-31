package classes;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer opc = opcao();
		switch(opc) {
			case 1:
				System.out.println("Opc 1");
			break;
			case 2:
				System.out.println("Opc 2");
			break;
			case 3:
				System.out.println("Opc 3");
			break;
			case 4:
				System.out.println("Opc 4");
			break;	
			case 5:
				System.out.println("Opc 5");
			break;	
			case 6:
				System.out.println("Opc 6");
			break;	
		}
	}
	
	private static Integer opcao() {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append("===================================\n");
		sb.append("============  AGENDA   =============\n");
		sb.append("===================================\n");
		sb.append("Digite 1 para Listar todos os contatos  \n");
		sb.append("Digite 2 para Visualizar um contato detalhado  \n");
		sb.append("Digite 3 para Inserir novo contato  \n");
		sb.append("Digite 4 para Editar contato existente  \n");
		sb.append("Digite 5 para Excluir contato existente  \n");
		sb.append("Digite 6 para sair  \n");
		System.out.println(sb.toString());
		Integer iniciar = scan.nextInt();;
		return iniciar;
	}

}
