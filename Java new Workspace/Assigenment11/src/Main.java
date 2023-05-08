import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		FileReader file= new FileReader("C:\\Users\\adnan\\OneDrive\\Desktop\\New.txt");
		FileWriter file2=new FileWriter("C:\\Users\\adnan\\OneDrive\\Desktop\\New1.txt");
		BufferedReader F = new BufferedReader(file);
		BufferedWriter writer=new BufferedWriter(file2);
		String st =F.readLine();
		
		
		//while ((st=F.readLine())!=null) {
			StringTokenizer T =new StringTokenizer(st);
			int n=st.split("\\s").length;
//			List<String> arr = new ArrayList<String>();
			String[] arr=new String[n];
			for (int i = 0; i < n; i++) {
				String IN= T.nextToken();
				arr[i]=IN;
				//arr.add(IN);
			}
			int j = n;
			String[] b = new String[n];
			
			for (int i = 0; i < n / 2; i++) {
	            String t = arr[i];
	            arr[i] = arr[n - i - 1];
	            arr[n - i - 1] = t;
	            
	        }
	        for (int k = 0; k < n; k++) {
	        	writer.append(" "+arr[k]);
	        }
	        System.err.println("Reverser string inpute complete");
			
		
			
		//}
		
		
		F.close();
		file.close();
		writer.close();
		file2.close();
		
	}

}
