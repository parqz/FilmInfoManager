/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filminfomanager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PARQZ
 */
public class system {
   
    private List<Film> filmsList;
    private List<Account> accounts;
    private String name;
    
    public system (String n,List<Film> f,List<Account> a)
    {
        this.accounts=a;
        this.filmsList=f;
        this.name=n;
    }
    public system()
    {
        
    }
    void Add2AccountsList(Account acnt)
    {
        this.accounts.add(acnt);
    }
    void Add2FilsList(Film flm)
    {
        this.filmsList.add(flm);
    }    
    public List<Film> searchByName(String name)
    {
        List<Film> result = new ArrayList<>();
        for(Film f : filmsList )
        {
            if(f.getName().equals(name))
                result.add(f);
        }
        return result;
        
    }
   public List<Film> searchByYear(int year)
    {
        List<Film> result = new ArrayList<>();
                for(Film f : filmsList )
        {
            if(year == f.getFilmYear())
                result.add(f);
        }
        return result;
    }
        public List<Film> searchByConuntry(String country)
    {
        List<Film> result = new ArrayList<>();
                for(Film f : filmsList )
        {
            if(f.getFilmCountry().equals(country))
                result.add(f);
        }
        return result;
    }
        public List<Film> searchByDirector(String dirname)
    {
        List<Film> result = new ArrayList<>();
                for(Film f : filmsList )
        {
            if(f.getFilmDirector().equals(dirname))
                result.add(f);
        }
        return result;
    } 
       public List<Film> searchByGeneres(List<String> generelist)
    {
        List<Film> result = new ArrayList<>();
                for(Film f : filmsList )
        {
            if(f.getFilmGeners().containsAll(generelist))
                result.add(f);
        }
        return result;
    } 
     public List<Film> searchByDirYear(String dir,int year)
    {
        List<Film> tresult = new ArrayList<>();
        List<Film> result = new ArrayList<>();
        tresult = searchByDirector(dir);
         for(Film f : tresult )
        {
            if(year == f.getFilmYear())
                result.add(f);
        }
        return result;
    }
        
    
    
}//End Of Class System
