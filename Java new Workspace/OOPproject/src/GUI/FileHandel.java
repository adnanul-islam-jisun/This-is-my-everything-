package GUI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandel {
	
		public boolean Check(String name,String id) throws IOException {
			File file= new File("C:\\Users\\adnan\\OneDrive\\Desktop\\New1.txt");
			
		 Scanner F = new Scanner(file);
			
			
			
			boolean x=false;
			String c=name+id;
			while (F.hasNext()) {
				String st=F.next();
				if(c.equals(st)) {
					System.out.println(c);
					x=true;
					break;
				}

			}
			
			F.close();
			file.exists();
			return x;
			
			
		}
		public void Input(String name,String id) throws IOException {
			
			FileWriter file2=new FileWriter("C:\\Users\\adnan\\OneDrive\\Desktop\\New1.txt",true);
			
			BufferedWriter writer=new BufferedWriter(file2);
			
			String c=name+id;
			writer.append(c+"\n");
	
			writer.close();
			file2.close();
			
			
		}
		

}
