package exercicios;

import java.util.Scanner;

public class Viagem_cidades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int origem, destino;
		int tabela[][] = {
				{0, 2, 11, 6, 15, 11, 1},
                {2, 0, 7, 12, 4, 2, 15},
                {11, 7, 0, 11, 8, 3, 13},
                {6, 12, 11, 0, 10, 2, 1},
                {15, 4, 8, 10, 0, 5, 13},
                {11, 2, 3, 2, 5, 0, 14},
                {1, 15, 13, 1, 13, 14, 0}
		};
		
		//Criando menu de selecao de cidade.
		do {
			System.out.println("");
			System.out.println("====Codigo da Cidade====");
            System.out.println("Cidade A.............1");
            System.out.println("Cidade B.............2");
            System.out.println("Cidade C.............3");
            System.out.println("Cidade D.............4");
            System.out.println("Cidade E.............5");
            System.out.println("Cidade F.............6");
            System.out.println("Cidade G.............7");
            System.out.println("");
            
            //recebendo cidade de origem.
            System.out.println("Insira o codigo da cidade de origem: ");
            origem = sc.nextInt();
            
            //recebendo cidade de destino.
            System.out.println("Insira o codigo da cidade de destino: ");
            destino = sc.nextInt();
            
            //verificando insercao de valores. -> Caso sejam digitados valores menores que 0 e maiores que 8 o processo ira cessar.
            if(origem != destino && origem > 0 && origem < 8 && destino > 0 && destino < 8) {
            	System.out.println("");
            	System.out.println("O tempo de viagem sera de: " + tabela[origem-1][destino-1] + " horas.");	
            }
        //verificando insercao de valores. -> Caso sejam digitados valores menores que 0 e maiores que 8 o processo ira cessar.
		}while(origem != destino && origem > 0 && origem < 8 && destino > 0 && destino <8);
		sc.close();
	}
}
