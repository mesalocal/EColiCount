package ecolicounts;

import java.io.*;
import java.util.*;

import org.apache.commons.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String filename = scan.nextLine();
		File file = new File(filename);
		String info = FileUtils.readFileToString(file);
		int i = 0, A = 0, C = 0, G = 0, T = 0;

		for (i = 0; i < info.length(); i++) {
			switch (info.charAt(i)) {
			case 'A':
				A++;
				break;
			case 'C':
				C++;
				break;
			case 'G':
				G++;
				break;
			case 'T':
				T++;
				break;

			}
		}
		System.out.println("#A = " + A + "\n" + "#C = " + C + "\n" + "#G = " + G + "\n" + "#T = " + T);
	}
}
