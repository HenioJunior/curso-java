package _17_trabalhando_com_arquivos._186_classes_filewriter_bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
	
		String[] lines = new String[] {"-------------", "Bom dia", "Boa tarde", "Boa noite"};
		
		String path = "/home/heniojr/workspaces/temp/out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)))
		{
			for(String line: lines)//Para cada String line contido no vetor lines;
			{
				bw.write(line);// irei escrever a linha no arquivo;
				bw.newLine();//criaco de uma nova linha
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
