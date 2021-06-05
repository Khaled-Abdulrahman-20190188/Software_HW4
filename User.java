/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw_hw4;

import java.util.ArrayList;


/**
 *
 * @author c.city
 */
public class User extends UserData{
    String Name,Password,Email,Location;
    int ID;
    public static int count=0;
    public static final ArrayList<Integer>IDs=new ArrayList<Integer>();
    String Phone;
    public void SignIn(int id,String password)
    {
    
    }
    public void Register(String Name,int ID,String Password,String Email,String Phone,String Location)
    {
        if (count==0)
        {
          IDs.add(0);
          
        }
        for(int i=0;i<IDs.size();i++)
        {
            if(ID==IDs.get(i))
            {
                if(ID==0)
                System.out.println("You can not assign ID with zero value");
                else
                    System.out.println("There are similar ID with this value, please try again with another");
                break;
            }
            else
            {
                if(count==0)
                {
                    this.ID=ID;
                    IDs.set(0, ID);
                    count++;
                }
                else
                {
                    this.ID=ID;
                   IDs.add(ID);
                   count++;
                }
            }
        }
    if(ID!=0)
    {
        this.Name=Name;
        this.Email=Email;
        this.Location=Location;
        this.Password=Password;
        this.Phone=Phone;
        }
    }
    public void Display()
    {
    System.out.println("Name: "+Name+"\nID: "+ID+"\nEmail: "+Email+"\nPhone: "+Phone+"\nLocation: "+Location );
    }
}
