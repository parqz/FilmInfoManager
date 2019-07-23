/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filminfomanager;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.oracle.jrockit.jfr.DataType;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PARQZ
 */
public class FilmInfoManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int s,y;
        String n = null,p = null,i =null,ch="y";
        List<String> temp = new ArrayList<>();
        boolean enter = true;
        Scanner in=new Scanner(System.in);
        Gson gson = new Gson();
        List<Film> result = new ArrayList<>();
        List<Film> films = new ArrayList<>();
        List<Account> accounts = new ArrayList<>();
        Account adminAccount = new Account("parqz", "parsa","110111", 22);
        accounts.add(adminAccount);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            
             BufferedReader br = new BufferedReader(new FileReader("E:\\Projects\\FilmInfoManager\\FilmInfoManager\\movies.json"));
             //convert the json string back to object  
            String buffer;
            while ((buffer = br.readLine()) != null) 
            {
                Film tempFilmObj = gson.fromJson(buffer, Film.class);
                films.add(tempFilmObj);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        system mainSys = new system("FilmInfo", films, accounts);

         do
        {
        System.out.println("\t\t\t\t\t\tFilm Information Manager");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Enter One Option:");
        System.out.println("1)Login:");
        System.out.println("2)Sign In:");
         s = in.nextInt();
        }while(s<0 && s>3);
         if(s==1)
         {
         do {
          System.out.println("\t\t\t\t\t\tLogin");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("ID:");
        i=in.next();
        System.out.println("PASS:");
         p=in.next();
        for(Account a : accounts)
        {
            if(a.getId().equals(i) && a.getPass().equals(p))
            {
                System.out.print("Successful...");
                enter = false; 
            }
        }
        if(enter)
        System.out.print("Invalid Password,Enter Again");
        }while(enter);
      }
         else if(s == 2)
      {
        System.out.println("\t\t\t\t\t\tSign In");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Enter yout ID:");
        i=in.next();
        System.out.print("Enter your PASS:");
        p=in.next(); 
        System.out.println("Enter your Name:");
        n=in.next();
        System.out.println("Enter your Age:");
        int a =in.nextInt();
        Account ac = new Account(i, n, p, a);
        accounts.add(ac);
        System.out.println("Successful...");
        
      }
do{
      do {
       System.out.println("\t\t\t\t\t\tSearch by:");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("1)Name:");
        System.out.println("2)year:");
        System.out.println("3)Country:");
        System.out.println("4)Director:");
        System.out.println("5)Generes:");
        System.out.println("6)Director & Year:");
        s = in.nextInt();
      }while(s<0 && s>6);
        switch (s) {
            case 1:
                System.out.println("Enter the name of film you want to search:");
                n = reader.readLine();
                result = mainSys.searchByName(n);
                break;
            case 2:
                System.out.println("Enter the year of film you want to search:");
                y = in.nextInt();
                result = mainSys.searchByYear(y);
                break;
            case 3:
                System.out.println("Enter the country of film you want to search:");
                n = reader.readLine();
                result = mainSys.searchByConuntry(n);
                break;
            case 4:
                System.out.println("Enter the director of film you want to search:");
                n = reader.readLine();
                result = mainSys.searchByDirector(n);
                break;
            case 5:
                System.out.println("Enter the generes of film you want to search:");
                n = reader.readLine();
                temp.add(n);
                result = mainSys.searchByGeneres(temp);
                break;
            case 6:
                System.out.println("Enter the director of film you want to search:");
                n = reader.readLine();
                System.out.println("Enter the year of film you want to search:");
                y = in.nextInt();
                result = mainSys.searchByDirYear(n,y);
                break;
            default:
                break;
        }    
           for (int j=0;j<result.size();j++)
           System.out.println(result.get(j).toString());
           System.out.println("Do you want to search again?(y/n)");
           ch = in.next();
}while(ch != "y");

    }//end of main method

}//End Of Class FilmInfoManager
