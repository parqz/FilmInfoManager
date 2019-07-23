/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filminfomanager;

import java.util.List;

/**
 *
 * @author PARQZ
 */
public class Film {
    private String name;
    private int year;
    private String country;
    private List<String> genreList;
    private int durationMinutes;
    private String director;
    private String description;
    
   //constructor// public Film (String name,int year,..) {}
    public String getName()
        { 
            return this.name;
        }
    public int getFilmYear()
        { 
            return this.year;
        }
    public int getFilmDuration()
        { 
            return this.durationMinutes;
        }
    public String getFilmCountry()
        { 
            return this.country;
        }
    public String getFilmDirector()
        { 
            return this.director;
        }
    public String getFilmDescription()
        { 
            return this.description;
        }    
    public List<String> getFilmGeners()
        {
        return this.genreList;
        }
    @Override
    public String toString()
    {
        return "Name:" +getName()+ ",Year:" + getFilmYear()+",Duration:"+getFilmDuration()+ ",Country:"+getFilmCountry()+ ",Genere:"+getFilmGeners()+",Director:"+getFilmDirector()+",Description:"+getFilmDescription();
    }
}//end of class Film
