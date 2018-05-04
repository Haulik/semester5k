import java.io.*;
import java.util.*;

public class Menu{

   public static void menuPromptStart(){
      System.out.println("1: Login");
      System.out.println("0: Exit");
   }

   public static void MenuCase(){
      if(User.getTrainer() == true){
         System.out.println("1: Change password");
         System.out.println("2: Register Time");
         System.out.println("3: Times");
         System.out.println("4: Members");
         System.out.println();
         System.out.println("5: log off");
         System.out.println("0: Close System");
      }
      else if (User.getAdmin() == true){
         System.out.println("1: Change password");
         System.out.println("2: Create new Member");
         System.out.println("3: View restance");
         System.out.println("4: Members");
         System.out.println("5: Administrate member");
         System.out.println();
         System.out.println("6: log off");
         System.out.println("0: Close System");
      }
      else if (User.getCashier() == true){
         System.out.println("1: Change password");
         System.out.println("2: Members");
         System.out.println();
         System.out.println("3: log off");
         System.out.println("0: Close System");
      }
   }
   
   //Trainer
   public static void TrainerCase()throws IOException{
      boolean choice = true;
      int option;
      Scanner scan = new Scanner(System.in);
      
      MenuCase();
      while (choice){
      
         option = Sv�mmeklubbenDelphinen.antiJarl();
             
         switch(option){
                       
            case 1:
               System.out.println("Change password");
               Sv�mmeklubbenDelphinen.ChangedPassword();
               MenuCase();
               break;
         
            case 2:
               System.out.println("Register Time");
               MenuCase();
               break;
         
            case 3:
               System.out.println("Times");
               TimeCase();
               break;
               
            case 4:
               System.out.println("Members\n");
               MemberCase();
               break;
         
            case 5:
               System.out.println("Trainer is now logged off");
               User.SetTrainer(false);
               Sv�mmeklubbenDelphinen.restart();
               break;
            
            case 0:
               System.out.println("Closing System");               
               System.exit(0);
               Member.saveMembers();
               break;
               
            default:
               System.out.println("Wrong input, try again");
               MemberCase();
               break;
         }
      }
   
   } 
   //Admin
   public static void AdminCase()throws IOException{
      boolean choice = true;
      int option;
      Scanner scan = new Scanner(System.in);
      
      MenuCase();
      while (choice){
      
         option = Sv�mmeklubbenDelphinen.antiJarl();
             
         switch(option){
                       
            case 1:
               System.out.println("Change password");
               Sv�mmeklubbenDelphinen.ChangedPassword();
               MenuCase();
               break;
         
            case 2:
               System.out.println("Create new Member");
               Member.addMember();
               MenuCase();
               break;
         
            case 3:
               System.out.println("View restance");
               MenuCase();
               break;
               
            case 4:
            
               System.out.println("Members\n");
               MemberCase();
               break;
         
            case 5:
               System.out.println(" Administrate member");
               MenuCase();
               break;
               
            case 6:
               System.out.println("Admin is now logged off");
               User.SetAdmin(false);
               Sv�mmeklubbenDelphinen.restart();
               break;
            
            case 0:
               System.out.println("Closing System");
               System.exit(0);
               Member.saveMembers();
               break;
               
            default:
               System.out.println("Wrong input, try again");
               MemberCase();
               break;
         }
      }
   
   } 
   
   //Cashier
   public static void CashierCase()throws IOException{
      boolean choice = true;
      int option;
      Scanner scan = new Scanner(System.in);
      
      MenuCase();
      while (choice){
      
         option = Sv�mmeklubbenDelphinen.antiJarl();
             
         switch(option){
                       
            case 1:
               System.out.println("Change password");
               Sv�mmeklubbenDelphinen.ChangedPassword();
               MenuCase();
               break;
            
            case 2:
               System.out.println("Members\n");
               MemberCase();
               break;
         
            case 3:
               System.out.println("Cashier is now logged off");
               User.SetCashier(false);
               Sv�mmeklubbenDelphinen.restart();
               break;
            
            case 0:
               System.out.println("Closing System");
               System.exit(0);
               Member.saveMembers();
               break;
               
            default:
               System.out.println("Wrong input, try again");
               MemberCase();
               break;
         }
      }
   
   } 
      
   public static void MemberCase()throws IOException{
     
      boolean choice = true;
      int option;
      Scanner scan = new Scanner(System.in);
      MemberListMenu();
      while (choice){
      
         option = Sv�mmeklubbenDelphinen.antiJarl();
             
         switch(option){
                       
            case 1:
               System.out.println("View all member");
               System.out.println(Member.viewMember());
               MemberListMenu();
               break;
            
            case 2:
               System.out.println("View competetiv");
               MemberListMenu();
               break;
         
            case 3:
               System.out.println("View active");
               MemberListMenu();
               break;
            
            case 4:
               System.out.println("View back");
               MemberListMenu();
               break;
               
            case 5:
               System.out.println("View crawl");
               MemberListMenu();
               break;
               
            case 6:
               System.out.println("View breast");
               MemberListMenu();
               break;
               
            case 0:
               System.out.println("Going back");
               choice = false;
               MenuCase();
               break;
               
            default:
               System.out.println("Wrong input, try again");
               MemberCase();
               break;
         }
      }
   }
   public static void TimeCase()throws IOException{
     
      boolean choice = true;
      int option;
      Scanner scan = new Scanner(System.in);
      TimeMenu();
      while (choice){
      
         option = Sv�mmeklubbenDelphinen.antiJarl();
             
         switch(option){
                       
            case 1:
               System.out.println("View back time");
               System.out.println(Member.viewMember());
               TimeMenu();
               break;
            
            case 2:
               System.out.println("View crawl");
               TimeMenu();
               break;
         
            case 3:
               System.out.println("View breast time");
               TimeMenu();
               break;
            
            case 4:
               System.out.println("Set back time");
               TimeMenu();
               break;
               
            case 5:
               System.out.println("Set crawl time");
               TimeMenu();
               break;
               
            case 6:
               System.out.println("Set breast time");
               TimeMenu();
               break;
               
            case 0:
               System.out.println("Going back");
               choice = false;
               TimeMenu();
               break;
               
            default:
               System.out.println("Wrong input, try again");
               MemberCase();
               break;
         }
      }
   
   }
   public static void MemberListMenu(){
      System.out.println("1: View all member");
      System.out.println("2: View competetiv");
      System.out.println("3: View active");
      System.out.println("4: View back");
      System.out.println("5: View crawl");
      System.out.println("6: View breast");
      System.out.println();
      System.out.println("0: Back");
   }
   
   public static void TimeMenu(){
      System.out.println("1: View back time");
      System.out.println("2: View crawl time");
      System.out.println("3: View breast time");
      System.out.println("4: Set back time");
      System.out.println("5: Set crawl time");
      System.out.println("6: Set breast time");
   }
   
 

}