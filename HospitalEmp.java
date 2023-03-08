/*******************
   Name: Jennifer Byrne
   
   Date: December 31, 2019
   
   Notes: ENTD381 Week 4 Assignment (2 of 8 files) - This is the superclass HospitalEmp, which extends to subclasses:
          Doctor, Nurse, Admin, Surgeon, Reception, and Janitor. 
  
*******************/
// Class declaration
public class HospitalEmp {

   // Global variables - protected so only subclasses can access them
   protected String fName;
   protected String lName;
   protected String title;
   
   // Class constructor which allows 3 string parameters to pass values to the global variables
   public HospitalEmp(String first, String last, String role) {
   
      fName = first;
      lName = last;
      title = role;
      
   }
   
   // diagnose method - determines if an employee is able to make a medical diagnosis based on title
   public void diagnose() {
   
      if (title == "doctor" || title == "nurse" || title == "surgeon") {  
         
         System.out.println("This person is able to make a medical diagnosis.");
      
      } else {
      
         System.out.println("This person is NOT able to make a medical diagnosis.");
      
      }
   
   }
   
   // prescribe method - determines if an employee is able to prescribe medicine based on title
   public void prescribe() {
   
      if (title == "doctor" || title == "nurse" || title == "surgeon") {  
         
         System.out.println("This person is able to prescribe medicine.");
      
      } else {
      
         System.out.println("This person is NOT able to prescribe medicine.");
      
      }
   
   }

}
   
  



   




   