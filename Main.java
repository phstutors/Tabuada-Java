package pasta;


//Criado por phstutors
//Nao modifique
//Criado dia 29/03/2022
//Aula de java professor Leonardo

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

		public static void main(String[] args) throws IOException {
			Scanner ler = new Scanner(System.in);
			int i, n;

			System.out.println("Digite um numero para saber sua tabuada: ");
			n = ler.nextInt();
			
			FileWriter arq = new FileWriter("C:\\Users\\IFPE - P1\\Desktop\\tabuada.txt");
			PrintWriter gravarArq = new PrintWriter(arq);
			
			gravarArq.printf("----Tabuada----%n");
			for (i=1; i<=10; i++) {
				gravarArq.printf("%2d X %d = %2d | %n", i, n, (i*n));
			}
			gravarArq.printf("+-------------+%n");
			
			arq.close();
			System.out.println("Tabuada criada com sucesso na area de trabalho!!!");
	}
			
}