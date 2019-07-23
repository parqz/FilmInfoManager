/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filminfomanager;

/**
 *
 * @author PARQZ
 */
public class Account {
    
    private  String id;
    private String name;
    private String pass;
    private int age;
    
 
    public Account(String i,String n,String p,int a)
    {
        this.id=i;
        this.age=a;
        this.name=n;
        this.pass=p;
    }
    
    public String getId()
    {
        return this.id;
    }
        public String getPass()
    {
        return this.pass;
    }
   public String getName()
    {
        return this.name;
    }
   public int getAge()
    {
        return this.age;
    }
   public void setId(String id)
    {
        this.id=id;
    }
   public void setAge(int a)
    {
        this.age=a;
    }
    public void setName(String name )
    {
        this.name=name;
    }
   public void setPass (String p)
    {
        this.pass=p;
    }
    
}//End Of Class Account
