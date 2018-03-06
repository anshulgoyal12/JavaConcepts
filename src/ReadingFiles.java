import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\indianic\\Desktop\\WriteFiles\\mytextFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		
		String line = null;
		while((line = reader.readLine())!=null){
			
			System.out.println(line);
		}
		
		
		
		
	}

}
