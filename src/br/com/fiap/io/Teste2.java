package br.com.fiap.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Teste2 {
	public static void main(String[] args) {

		try {
			//Abre o arquivo
			FileReader stream = new FileReader("arquivo.txt");
			BufferedReader reader = new BufferedReader(stream);

			//Lê uma linha do arquivo
			String linha = reader.readLine();
			while (linha != null){
				System.out.println(linha);
				//Lê a próxima linha do arquivo
				linha = reader.readLine();
			}

			reader.close();
			//Fecha o arquivo
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
