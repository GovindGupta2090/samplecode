package JavaPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

public class FileExamples {

	

@Test(enabled=false)
public void fileread()

{
	            try {  
	                File file = new File("D:\\Selenium\\javaprog\\files\\abc.txt");  
	                if (file.createNewFile()) {  
	                    System.out.println("New File is created!");  
	                } else {  
	                    System.out.println("File already exists.");  
	                }  
	            } catch (IOException e) {  
	                e.printStackTrace();  
	            }     
		 
	            
	            try{    
	                FileOutputStream fout=new FileOutputStream("D:\\Selenium\\javaprog\\files\\fos.txt");    
	                //fout.write(65); 
	                
	                String s ="Write String Directly in byte array form";
	                byte b[] = s.getBytes();
	                //will write A
	                fout.write(65);
	                //Write Byte Array
	                fout.write(b);
	                
	                //by default not appneded
	                fout.close();    
	                System.out.println("success...");    
	               }catch(Exception e){System.out.println(e);}    
	         } 
	


@Test
public void fileWrite()
{
	
	try{    
        FileInputStream fin=new FileInputStream("D:\\Selenium\\javaprog\\files\\fos.txt");    
        int i=fin.read();  
        System.out.print((char)i);    
int i1;
while((i1=fin.read())!=-1)
{
	System.out.print((char)i1); 
}
        
        fin.close();    
      }catch(Exception e){System.out.println(e);}    
     }    
	
}
