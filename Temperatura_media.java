package exercicios;

import java.util.Scanner;

public class Temperatura_media {
	public static void main(String[] args) {
	
		double[] temp = new double[7];
		double media,soma=0;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//Captura dos valores das temperaturas.
		for(int i=0; i<temp.length; i++) {
			System.out.println("Digite uma a temperatura do dia " + (i+1) + ": ");
			temp[i] = sc.nextDouble();
		}
		
		sc.close();
		
		//imprimindo os valores das temperaturas
		for(int i=0; i<7; i++) {
			System.out.println("As temperaturas sao: " + temp[i] + " graus C");
		}
		
		//fazeendo a operação de soma das temperaturas
		for(int i=0; i<temp.length; i++) {
			soma += temp[i];
		}
		
		//fazendo a media das temperaturas obtidas
		media = soma/7;
		
		//verificando cada temperatura em rela��o a media
		for(int i=0; i<temp.length;i++) {
			if(temp[i] > media) {
				contador++;
			}
		}
		
		//impressão dos resultados
		System.out.printf("Media de temperatura: %.2f graus C \n", media);
		System.out.println("Numero de temparaturas acima da media: " + contador);
	}
}
