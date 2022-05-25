package br.com.fiap.dbaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Teste {

	public static void main(String[] args) {
		try {
			//Registra o Driver
			Class.forName("org.postgresql.Driver");

			//Abre uma conexão			
			Connection conexao = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/BuddyCloud", "postgres", "C@ndinho2021");

			System.out.println("Conectado!");

			PreparedStatement statement = conexao.prepareStatement("SELECT * FROM qualificacoessocios WHERE qualificacao = ?");
			statement.setString(1, "31");
			ResultSet result = statement.executeQuery();
			
			 //Percorre todos os registros encontrados
		    while (result.next()){
		      //Recupera os valores de cada coluna
		      String qualificacao = result.getString("qualificacao");
		      String descricao = result.getString("descricao");
		      boolean cota = result.getBoolean("cota");
		      String obsoleta = result.getString("obsoleta");
		      
		      //Exibe as informações do registro
		      System.out.println(qualificacao + " - " + descricao + " - " + cota + " - " + obsoleta);
		  }
			
			//Fecha a conexão
			conexao.close();

			//Tratamento de erro	
		} catch (SQLException e) {
			System.err.println("Não foi possível conectar no Banco de Dados");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("O Driver JDBC não foi encontrado!");
			e.printStackTrace();
		}
	}
}