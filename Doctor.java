/*******************
   Name: Jennifer Byrne
   
   Date: December 31, 2019
   
   Notes: ENTD381 Week 4 Assignment (3 of 8 files) - This file is subclass Doctor which extends HospitalEmp. It
          prints out the name of the chief physician instantiated in HospitalEmpDriver. 
  
*******************/
// Class declaration - Doctor is a subclass of HospitalEmp
public class Doctor extends HospitalEmp {

   // Extends the superclass constructor to the subclass
   public Doctor(String first, String last, String role) {
      
      super(first, last, role);
      
   } 
   
   // chiefMD method - Prints out the name of the chief physician  
   public void chiefMD() {
        
      System.out.println("The chief physician is " + fName + " " + lName + ".");
      
   }

} 