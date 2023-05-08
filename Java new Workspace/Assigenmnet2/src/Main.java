import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		FileReader file= new FileReader("C:\\Users\\adnan\\OneDrive\\Desktop\\New.txt");
		FileWriter file2=new FileWriter("C:\\Users\\adnan\\OneDrive\\Desktop\\New1.txt");
		BufferedReader F = new BufferedReader(file);
		BufferedWriter writer=new BufferedWriter(file2);
		String st =F.readLine();
		List<String> arr = new ArrayList<String>();
		
		
		while ((st=F.readLine())!=null) {
			arr.add(st);	
		}
		int a=arr.size();
		if(a>=3) {
			for (int x =0, y = arr.size();x<3; x++)
			{
			  writer.append(arr.get(a-3+x)+"\n");
			}
		}
		else {
			for (int x = 1, y = arr.size();x<=arr.size(); x++)
			{
			  writer.append(arr.get(a-x)+"\n");
			}
		}
		
		F.close();
		file.close();
		writer.close();
		file2.close();
	}

}
