package br.com.fiap.io;

import java.io.File;
import java.io.IOException;

public class Teste3 {
	public static void main(String[] args) {

		File arquivo = new File("arquivo.txt");

		// Verifica se o arquivo existe
		if (arquivo.exists()) {
			System.out.println("O arquivo existe!" +
					" Pode ser lido: " + (arquivo.canRead() ? "Sim" : "N�o") +
						" Pode ser gravado: " + (arquivo.canWrite() ? "Sim" : "N�o") +
							" Tamanho: " + arquivo.length() +
								" Caminho: " + arquivo.getPath());
		} else {
			// Cria o arquivo
			try {
				if (arquivo.createNewFile())
					System.out.println("Arquivo criado!");
				else
					System.out.println("Arquivo n�o criado!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
