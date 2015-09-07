package br.com.leitor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
	static String desktop = "C:" + File.separator + "Users" + File.separator + "leonardo" + File.separator + "Desktop" + File.separator;
	
	public static void main(String[] args) throws IOException {
		
		File f01 = new File(new StringBuilder().append(desktop).append(File.separator).append("001.txt").toString());
		File f02 = new File(new StringBuilder().append(desktop).append(File.separator).append("002.txt").toString());
		
		FileWriter fw = new FileWriter(f02, true); //true como segundo parametro para permitir que o texto de origem seja copiado para o final do conteudo
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.newLine();
		bw.append(new String(Files.readAllBytes(f01.toPath())));
		bw.close();
		
		System.out.println(new String(Files.readAllBytes(f02.toPath())));
		
	}
}
