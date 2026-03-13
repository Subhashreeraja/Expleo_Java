package iostream;
import java.io.FileOutputStream;
public class fileoutputstreamdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="Welcome to java portal!!!Have a Happy Learning";
		try {
			FileOutputStream output=new FileOutputStream("src/iostream/output.txt");
			byte[]array=data.getBytes();
			output.write(array);
			output.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
