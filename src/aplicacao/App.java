package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.pensao;


public class App {
    public static void main(String[] args) throws Exception {
        
        //Vetores POO programa p/ Pensionato possui dez quartos p/alugar p/ estudantes,sendo esses quartos 
		//identificados pelos Nº 0 a 9.Quartos inicie vazios depois leia a quantidade N representando o numero
		//de estudantes que vão alugar quartos.(N pode ser de 1 a 10)Em seguida registre o aluguel dos N estudades.
		//Para cada registro de aluguel, informar o nome e email do estudante,bem como qual dos quartos ele escolheu
		//(de 0 a 9).Suponha que seja escolhido um quarto vago.Ao final seu programa deve imprimir um relatorio de
		//todas ocupaçoes da pensão,por ordem de ocupação.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		pensao[] vect = new pensao[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("pensao #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int Number = sc.nextInt();
			//erro corrigido
			vect[Number] = new pensao(name, email);
			
		}
		
		System.out.println();
		System.out.println("Quartos Ocupados: ");
		for(int i=0; i< 10; i++) {
		   if(vect[i] != null) {
			   System.out.println(i + ": " + vect[i]);
		   }
		}
      sc.close();



    }
}
