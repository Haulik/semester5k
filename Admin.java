import java.io.*;
import java.util.*;

public class Admin{
   private String username;
   private String password;
   private boolean Admin = true;
   
   public Admin(){
      username = "hermand";
      password = "rosebud123";
   }

   public Admin(String username, String password){
      this.username = username;
      this.password = password;
   }
   
   public void setPassword(String password){
      this.password = password;
   }
   
   public void setUsername(String username){
      this.username = username;
   }
   
   public String getUsername(){
      return username;
   }
   
   public String getPassword(){
      return password;
   }


}