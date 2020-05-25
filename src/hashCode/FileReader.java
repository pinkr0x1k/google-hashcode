package hashCode;


import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) throws IOException {

	

		Folder[] folder = new Folder[1];
		folder[0] = new Folder("./a_example/", ".txt");
		folder[1] = new Folder("./b_read_on/", ".txt");
		folder[2] = new Folder("./c_inculabula/", ".txt");
		folder[3] = new Folder("./f_libraries_of_the_world/", ".txt");
	

		Folder stopFolder = new Folder("./f_libraries_of_the_world", ".txt");

		
		for (int i = 0; i < folder.length; i++) {

		

					File fld = new File(folder[i].folderName + folder[i].folderType);
					Scanner scanner = new Scanner(fld);

					
					while (scanner.hasNext()) {
						String[] tokens = scanner.nextLine().split("");
						for (String a : tokens)
							System.out.println(a);

					}

					File stopfld = new File(stopFolder.folderName + stopFolder.folderType);
					Scanner scanner2 = new Scanner(stopfld);

					String fileContent = "";

					while (scanner2.hasNextLine()) {
						fileContent = scanner.nextLine() + "\n";
						//System.out.println(fileContent);
					}

		}
			}

	}


