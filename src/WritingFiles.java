import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\indianic\\Desktop\\WriteFiles\\mytextFile.html");
		FileWriter fw = new FileWriter(f);
		BufferedWriter writer = new BufferedWriter(fw);
		
		writer.write("<html><body><title>Way2Automation</title><h1>Learning Java and Selenium Automation</body></html>");
		
		/*for(int i=0; i<3; i++){
			
			for(int j=0; j<4; j++){
				
				int num = (int)(Math.random()*100);
				writer.write(num +",");
			}
			
			writer.newLine();
		}*/
		
		/*writer.write("Second Line");
		writer.newLine();
		writer.write("India");
		writer.newLine();
		writer.write("Way2Automation");
		*/
		writer.close();
		
		System.out.println("File Created..!!");
		
		
	}
	
}
