/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tables;

//GITHUB LINK: https://github.com/dsjdiego/IntegratedCA2.git

/**
 *
 * @author User
 */
public class User {
    private int User_ID;
    private String User_name;
    private String Password;
    private String Type_User;

    //Constructor
    public User(int User_ID, String User_name, String Password, String Type_User) {
        this.User_ID = User_ID;
        this.User_name = User_name;
        this.Password = Password;
        this.Type_User = Type_User;
    }

    // Getters and Setters
    public int getUser_ID() { 
        return User_ID; 
    }
    
    public void setUser_ID(int User_ID) { 
        this.User_ID = User_ID; 
    }
    
    public String getUser_name() { 
        return User_name; 
    }
    
    public void setUser_name(String User_name) { 
        this.User_name = User_name; 
    }
    
    public String getPassword() { 
        return Password; 
    }
    
    public void setPassword(String Password) { 
        this.Password = Password; 
    }
    
    public String getType_User() { 
        return Type_User; 
    }
    
    public void setType_User(String Type_User) { 
        this.Type_User = Type_User; 
    }
}
