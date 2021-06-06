package _17_trabalhando_com_arquivos._183_classes_file_scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("/home/heniojr/workspaces/temp/in.txt");
		Scanner sc = null;
		try {
		sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());//testar se existe uma nova linha no arquivo;
			}
		}
		catch(IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
}
