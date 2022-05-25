package br.com.fiap.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Teste4 {
	public static void main(String[] args) {
		File diretorio = new File("fiap");

		if (diretorio.exists()){
			System.out.println("Diretório existe!");
		}else{
			if (diretorio.mkdir())
				System.out.println("Diretório criado!");
			else
				System.out.println("Diretório não criado.");
		}

		File arquivo = new File(diretorio,"file.txt");
		try {
			if (arquivo.createNewFile())
				System.out.println("Arquivo criado!");
			else
				System.out.println("Arquivo não criado!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			//Abre o arquivo para escrita
			FileWriter writer = new FileWriter(arquivo);
			PrintWriter print = new PrintWriter(writer);
			print.println("Teste");
			print.println("Escrevendo no arquivo");
			
			print.close();
			writer.close();
			
			//Abre o arquivo para leitura
			FileReader stream = new FileReader(arquivo);
			BufferedReader reader = new BufferedReader(stream);

			//Lê uma linha do arquivo
			String linha = reader.readLine();
			while (linha != null){
				System.out.println(linha);
				//Lê a próxima linha do arquivo
				linha = reader.readLine();
			}

			stream.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
