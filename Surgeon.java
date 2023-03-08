/*******************
   Name: Jennifer Byrne
   
   Date: December 31, 2019
   
   Notes: ENTD381 Week 4 Assignment (6 of 8 files) - This file is subclass Surgeon which extends HospitalEmp. It
          prints out the name of the chief surgeon instantiated in HospitalEmpDriver. 
  
*******************/
// Class declaration - Surgeon is a subclass of HospitalEmp
public class Surgeon extends HospitalEmp {
   
   // Extends the superclass constructor to the subclass
   public Surgeon(String first, String last, String role) {
   
      super(first, last, role);
      
   }
   
   // chiefSurgeon method - Prints out the name of the chief surgeon
   public void chiefSurgeon() {
   
      System.out.println("The chief surgeon is " + fName + " " + lName + ".");
   
   }
   
}
