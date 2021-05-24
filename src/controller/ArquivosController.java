package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArquivosController implements IArquivosController {   // selecionar adicionar metodos nao implementados
	
	
	public ArquivosController() {							// CTRL + 3 escrever Constructor
		super();
		
	}

	@Override
	public void readDir(String path) throws IOException {
		File dir = new File(path);
		if (dir.exists() && dir.isDirectory()) {   //obrigatorio verifica se existe diretorio e se é diretorio
			File[] files = dir.listFiles();         // cria um vetor e coloca a lista de arquivos lidos
			for(File f: files) {
				if (f.isFile()) {
					System.out.println("     \t" + f.getName());  // pegar o nome
				}
				else {
					System.out.println("<DIR> \t" + f.getName());
				}
			}
		}
		else {
			throw new IOException("Diretorio Invalido");
		}
		
	}

	@Override
	public void createFile(String path, String nome) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readFile(String path, String nome) throws IOException {
		File arq = new File(path, nome);
		if (arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		} else {
			throw new IOException("Arquivo Invalido");
		}
		
	}

	@Override
	public void openFile(String path, String nome) throws IOException {
		// TODO Auto-generated method stub
		
	}

	
}
