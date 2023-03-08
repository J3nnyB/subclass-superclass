/*******************
   Name: Jennifer Byrne
   
   Date: December 31, 2019
   
   Notes: ENTD381 Week 4 Assignment (7 of 8 files) - This file is subclass Reception which extends HospitalEmp. It
          prints out the name of the head of reception instantiated in HospitalEmpDriver. It also prints a statement
          if an appointment is requested.
  
*******************/
// Class declaration - Reception is a subclass of HospitalEmp
public class Reception extends HospitalEmp {   

   // Extends the superclass constructor to the subclass
   public Reception(String first, String last, String role) {
   
      super(first, last, role);
      
   }
   
   // headReception method - Prints the name of the head of reception
   public void headReception() {
   
      System.out.println("The head of reception is " + fName + " " + lName + ".");
   
   }
   
   // requestAppt method - Prints the number to call if requesting an appointment
   public void requestAppt() {
   
      System.out.println("If you need to set an appointment, please call " + fName + " at 703-456-7890, ext. 12.");
   
   }
   
} 
