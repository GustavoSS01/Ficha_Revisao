package exercicios;

import java.util.Scanner;

public class Jogo_adivinhacao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Numero aleatorio, tentativas, numeros do jogador 2.
		int randNum = 0, tent=0, p2num;

        //recebendo o numero do jogador 1.
		do {
			System.out.print("Jogador 1, escolha um numero de 0 a 100: ");
			randNum = sc.nextInt();
		}while(randNum == 0 || randNum > 100);

        //Recebendo  o numero do jogador 2.
		do{
            System.out.print("Olá Jogador 2, vamos tentar advinhar o numero do Jogador 1: ");
            p2num = sc.nextInt();

            //checando se o numero digitado pelo J2 foi MAIOR ou MENOR que o número do J1
            if(p2num > randNum){
                System.out.println("Seu numero foi MAIOR que o dele");
                tent++;
            } else if (p2num < randNum) {
                System.out.println("Seu numero MENOR que o dele");
                tent++;
            }

        }while (p2num != randNum);
		sc.close();
		
		//impressao dos resultados
        System.out.println("");
        System.out.println("======FIM DE JOGO======");
        System.out.println("O numero escolhido foi: " + randNum);
        System.out.println("Numero de Tentativas: " + tent);
    }
} 