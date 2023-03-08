/*******************
   Name: Jennifer Byrne
   
   Date: December 31, 2019
   
   Notes: ENTD381 Week 4 Assignment (4 of 8 files) - This file is subclass Nurse which extends HospitalEmp. It
          prints out the name of the chief nurse instantiated in HospitalEmpDriver. 
  
*******************/
// Class declaration - Nurse is a subclass of HospitalEmp
public class Nurse extends HospitalEmp {
   
   // Extends the superclass constructor to the subclass
   public Nurse(String first, String last, String role) {
   
      super(first, last, role);
      
   }
   
   // chiefRN method - Prints out the name of the chief nurse
   public void chiefRN() {
      
      System.out.println("The chief nurse is " + fName + " " + lName + ".");
         
   }
   
} 