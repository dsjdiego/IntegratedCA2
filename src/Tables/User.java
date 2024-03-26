/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tables;

/**
 *
 * @author User
 */
public class User {
    private int userId;
    private String userName;
    private String password;
    private String typeUser;

    public User(int userId, String userName, String password, String typeUser) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.typeUser = typeUser;
    }

    // Getters and Setters
    public int getUserId() { 
        return userId; 
    }
    
    public void setUserId(int userId) { 
        this.userId = userId; 
    }
    
    public String getUserName() { 
        return userName; 
    }
    
    public void setUserName(String userName) { 
        this.userName = userName; 
    }
    
    public String getPassword() { 
        return password; 
    }
    
    public void setPassword(String password) { 
        this.password = password; 
    }
    
    public String getTypeUser() { 
        return typeUser; 
    }
    
    public void setTypeUser(String typeUser) { 
        this.typeUser = typeUser; 
    }
}
