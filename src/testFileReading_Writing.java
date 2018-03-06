import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testFileReading_Writing {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\indianic\\Desktop\\WriteFiles\\myText.txt");
		file.createNewFile();
		
		System.out.println("File Created");
		
		FileWriter fw = new FileWriter("C:\\Users\\indianic\\Desktop\\WriteFiles\\myText.txt");
		BufferedWriter write = new BufferedWriter(fw);
		write.write("The First Line");
		write.newLine();
		write.write("Second Line");
		
		write.flush();
		
		System.out.println("File Write");
		
		FileReader fr = new FileReader("C:\\Users\\indianic\\Desktop\\WriteFiles\\myText.txt");
		BufferedReader reader = new BufferedReader(fr);
		
		String i = "";
		
		while((i=reader.readLine())!=null){
			
			System.out.println(i);
			
		}
		
	}

}
