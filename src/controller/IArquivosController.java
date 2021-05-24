package controller;

import java.io.IOException;

public interface IArquivosController {
	public void readDir(String path) throws IOException ;     // leitura de um diretorio
	public void createFile(String path, String nome) throws IOException; // criacao de diretorio
	public void readFile(String path, String nome) throws IOException; // leitura de um arquivo
	public void openFile(String path, String nome) throws IOException; // abir arquivo
	
}
