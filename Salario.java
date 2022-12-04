package exercicios;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
        int l = 5, c = 1;

        Scanner sc = new Scanner(System.in);
        
        double[][] salarFun = new double[l][c];
        int[][] vendasFun = new int[l][c];
        double[][] salarMesFin = new double[l][c];
        double media=0, somaSalario=0;
        double[] searchValue = new double[l];
        double maiorSalario = 0.00;

        //Capturando salarios dos funcionarios. 
        for (int i = 0; i < l; i++) {
            System.out.println("Dados do funcionario " + (i+1));
            for (int j = 0; j < c; j++) {
                System.out.print("informe o salário: ");
                salarFun[i][j] = sc.nextDouble();
                System.out.print("Informe suas vendas: ");
                vendasFun[i][j] = sc.nextInt();
                System.out.println("================================");
            }
        }

        //Salario final do funcionairo + comissao.
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
            	
                if(vendasFun[i][j] == 0){
                    salarMesFin[i][j] = salarFun[i][j];
                }else if(vendasFun[i][j] > 0 && vendasFun[i][j] <= 5){
                    double soma = (vendasFun[i][j] * 1.50);
                    salarMesFin[i][j] = soma + salarFun[i][j];
                    
                }else if (vendasFun[i][j] >= 6 && vendasFun[i][j] <= 50) {
                    double soma = (vendasFun[i][j] * 2.00);
                    salarMesFin[i][j] = soma + salarFun[i][j];
                    
                }else if (vendasFun[i][j] > 50) {
                    double soma = (vendasFun[i][j] * 2.50);
                    salarMesFin[i][j] = soma + salarFun[i][j];
                }
            }
        }

        //Media dos salarios pagos pela empresa.
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                somaSalario += salarMesFin[i][j];
            }
        }
        media = somaSalario/5;

        //Calculo para conseguir o maior salario pago.
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
               if(salarFun[i][j] > searchValue[i]){
                   searchValue[i] = salarFun[i][j];
               }
            }
        }
        for (int i = 0; i < searchValue.length; i++) {
            if (searchValue[i] > maiorSalario){
                maiorSalario = searchValue[i];
            }
        }
        
        sc.close();
        
        //impressao dos salarios ao fim do mês.
        System.out.printf("\n\n===============================\n\n");
        for (int i = 0; i < l; i++) {
            System.out.println("Salário do Funcionario " + (i+1));
            for (int j = 0; j < c; j++) {
                System.out.printf("Salário Mensal: R$ %.2f\n", salarMesFin[i][j]);
            }
        }
        
        //impressao da media dos salarios.
        System.out.println("");
        System.out.println("===============Media dos Salários===============");
        System.out.printf("Média do mês: R$ %.2f\n", media);
        
        //impressao do maior salario pago pela empresa.
        System.out.println("");
        System.out.println("===============Maior Salário fixo===============");
        System.out.printf("O Maior salário fixo foi: R$ %.2f\n", maiorSalario);
	}

}
