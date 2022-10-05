import java.io.*;
public class Save_Test {

	public static void main(String[] args) throws IOException {
		try{
		    // Create file 
			//Note: if you don't put src/ before the name of the text file,
			// it will create an entirely new text file and not the one
			// you created in the first place
		    FileWriter fstream = new FileWriter("src/Save_File.txt",false);
		    BufferedWriter out = new BufferedWriter(fstream);
		    out.write("Hello Java");
		    //Close the output stream
		    out.close();
		    }catch (Exception e){//Catch exception if any
		      System.err.println("Error: " + e.getMessage());
		    }
		try {
			FileReader fileReader;
			fileReader = new FileReader("Save_File.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			line = bufferedReader.readLine();
			bufferedReader.close();
			System.out.println(line);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  }

	}
