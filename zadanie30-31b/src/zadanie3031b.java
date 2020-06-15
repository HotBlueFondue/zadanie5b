import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zadanie3031b {
	
	public static void szukaj(String nazwaPlikWe, String nazwaPlikWy, String s�owo) throws FileNotFoundException, IOException{
        
        File F;
        F = new File(nazwaPlikWe+".txt");
        List<String> zdania=new ArrayList<>();
        List<String> zapiska=new ArrayList<>();
        Scanner scannner=new Scanner(F);
        	int  i=1;
        	while(scannner.hasNextLine())
        	{ 
        	
            zdania.add(scannner.nextLine());
           
            
        	}
        	
        	
        	for (String string : zdania) 
        	{	
        		
        		if(string.contains(s�owo))
           		{	
        			
        			
        			zapiska.add(i+":"+string);
        			i++;
        			if (string.contains("."))
        			{
        				i++;
        			}
           		}
           		else
           		{
           			i++;
           		}
        	}
        
            File FW=new File(nazwaPlikWy+".txt");
            FileWriter writer = new FileWriter(FW);
            for (String zapiska2 : zapiska) 
            {
        writer.write(zapiska2+"\n");
            }
            scannner.close();
            writer.close();
            System.out.println("Utworzono plik");
        
}
	public static void main(String[] args) throws IOException{
	       
       
        String nazwaPlikWe="",nazwaPlikWy="",s�owo="";
        System.out.println("Nazwa pliku wej�ciowego: ");
        Scanner scannner=new Scanner(System.in);
        nazwaPlikWe=scannner.nextLine();
        System.out.println("Nazwa pliku wyj�ciowego: ");
        nazwaPlikWy=scannner.nextLine();
        System.out.println("Szukane s�owo: ");
        s�owo=scannner.nextLine();
        szukaj(nazwaPlikWe,nazwaPlikWy,s�owo);
        scannner.close();
        
        
    }
}
