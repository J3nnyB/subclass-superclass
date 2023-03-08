/*******************
   Name: Jennifer Byrne
   
   Date: December 31, 2019
   
   Notes: ENTD381 Week 4 Assignment (5 of 8 files) - This file is subclass Admin which extends HospitalEmp. It
          prints out the name of the head of the hospital instantiated in HospitalEmpDriver. 
  
*******************/
// Class declaration - Admin is a subclass of HospitalEmp
public class Admin extends HospitalEmp {
   
   // Extends the superclass constructor to the subclass
   public Admin(String first, String last, String role) {
   
      super(first, last, role);
      
   }
   
   // headAdmin method - Prints out the name of the head of hospital
   public void headAdmin() {
   
      System.out.println("The head of hospital is " + fName + " " + lName + ".");   
   
   }
   
}