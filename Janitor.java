/*******************
   Name: Jennifer Byrne
   
   Date: December 31, 2019
   
   Notes: ENTD381 Week 4 Assignment (8 of 8 files) - This file is subclass Janitor which extends HospitalEmp. It
          prints out the name of the head janitor instantiated in HospitalEmpDriver. It also prints a statement
          if emergency cleaning is requested.
  
*******************/
// Class declaration - Janitor is a subclass of HospitalEmp
public class Janitor extends HospitalEmp {

   // Extends the superclass constructor to the subclass
   public Janitor(String first, String last, String role) {
   
      super(first, last, role);
      
   }
   
   // headJanitor method - Prints the name of the head janitor
   public void headJanitor() {
   
      System.out.println("The head janitor is " + fName + " " + lName + ".");
   
   }
   
   // requestClean method - Prints the number to call if requesting emergency cleaning
   public void requestClean() {
   
      System.out.println("If you need to request emergency cleaning, please call " + fName + " at 703-456-7890, ext. 15.");
   }

}   