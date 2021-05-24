package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {

		IArquivosController arqCont = new ArquivosController();  // 1°classe Interface e 2° classe interface implementada
		String dirWin = "C:\\Windows";
		String path = "C:\\TEMP";
		String nome = "generic_food.csv";
		
		try {
//			arqCont.readDir(dirWin);
			arqCont.readFile(path, nome);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
