package br.com.fiap.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Teste {

	public static void main(String[] args) {
		try {
			//Abre o arquivo
			FileWriter stream = new FileWriter("C:\\Users\\gianc\\Desktop\\arquivo.txt");
			PrintWriter print = new PrintWriter(stream);

			//Escreve no arquivo
			print.println("Testes");
			print.println("Escrevendo no arquivo");

			print.close();
			//Fecha o arquivo
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
