import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;







public class FileEx {
	public static void main(String[] args) throws IOException {
		
		
		File myfile = new File("sssss.txt");
//
//        Object s1 = "asas";
//        Object s2 = "assdfsdafas";
//        Object s3 = "asafafas";
//
//        try (ObjectOutputStream newFile = new ObjectOutputStream(new FileOutputStream(myfile))) {
//            newFile.writeObject(s1);
//            newFile.writeObject(s2);
//            newFile.writeObject(s2);
//
//            ObjectInputStream o = new ObjectInputStream(new FileInputStream(myfile));
//            System.out.println(o.readObject());
//            System.out.println(o.readObject());
//            System.out.println(o.readObject());
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

		System.out.println("================");
		
//		Scanner scanner=null;
//		  try{
//	            
//
//	         //   scanner=new Scanner(new BufferedReader(new FileReader("sssss.txt")));
//
//
//		        
//		        
//	            FileReader file=new FileReader("sssss.txt");
//
//	            BufferedReader buffer=new BufferedReader(file);
//	            
//	            scanner=new Scanner(buffer);
//
//	            while(scanner.hasNextLine()){
//	                String description=scanner.nextLine();
//	                System.out.println(description);
//	            }
//	        }
//	        catch(IOException e){
//	            e.printStackTrace();
//	        }
//	        finally {
//	            if(scanner!=null){
//	                scanner.close();
//	            }
//	        }
		
		
		
		Console cnsl = null;
	      String name = null;
	      
	      try {
	         // creates a console object
	         cnsl = System.console();

	         // if console is not null
	         if (cnsl != null) {
	            
	            // read line from the user input
	            name = cnsl.readLine("Name: ");
	            
	            // prints
	            System.out.println("Name entered : " + name);
	         }     
	         
	      } catch(Exception ex) {
	         // if any error occurs
	         ex.printStackTrace();      
	      }

	}
}
