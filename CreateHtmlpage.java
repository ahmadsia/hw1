
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateHtmlpage {

	public static void main(String[] args) throws IOException {
		// scan number of columns
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter number columns: ");
		int numberOfColumns = kb.nextInt();
		String color="";
		kb.close();
		
		// Create file
		File myFile =new File("test.html");
		myFile.createNewFile();
		BufferedWriter writer = new BufferedWriter(new FileWriter(myFile, true));
		
		// fill content
		writer.append("<html>\n");	     
		writer.append("\t<head>  <meta charset=\"utf-\" /> </head>\n");	     
		writer.append("\t<body>\n");
		
		for(int i=0 ; i<numberOfColumns;i++) {
			if (i%3==0)
				color="red";
			else if (i%3==2)
				color="blue";
			else
				color = "green";
			writer.append("\t\t<div style=\"width:10%;height:100%;background-color:"+color+";float:right\"></div>\n");	     
		}
		
		writer.append("\t</body>\n");
		writer.append("</html>");	     
	    
	    // Close file
	    writer.close();	
  
	}
		
	
}