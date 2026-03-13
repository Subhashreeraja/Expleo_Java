package iostream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.io.FileReader;
import java.io.FileWriter;

public class CharStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []b=new char[128];
		try(FileReader fr=new FileReader(args[0]);
				FileWriter fw=new FileWriter(args[1]);	) {
			
			int count=0,read=0;
			while((read=fr.read(b))!=-1) {
				fw.write(b);
				
				System.out.println(" "+Arrays.toString(b));
				count+=read;
			}
			System.out.println("Total Count: "+count+"characters");
			
		}
		catch(FileNotFoundException f) {
			System.out.println("File not found "+f);
		}catch(IOException e) {
			System.out.println("IOException: "+e);
		}

	}

}
