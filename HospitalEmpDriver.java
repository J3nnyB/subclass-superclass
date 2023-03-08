/*******************
   Name: Jennifer Byrne
   
   Date: December 31, 2019
   
   Notes: ENTD381 Week 4 Assignment (1 of 8 files) - This is the executable driver that contains the main method
          to create a new object from each subclass of superclass HospitalEmp. The new object variables call various 
          methods from the super/subclasses. 
  
*******************/
// Class declaration
public class HospitalEmpDriver {
   
   // Main method
   public static void main(String[] args) {
      
      // Instantiate object variables from their respective class
      Doctor doctor = new Doctor("Stephanie", "King", "doctor");
      Nurse nurse = new Nurse("Brandon", "Chung", "nurse");
      Admin admin = new Admin("Christina", "Rice", "administrator");
      Surgeon surgeon = new Surgeon("David", "Williams", "surgeon");
      Reception reception = new Reception("Sara", "Campbell", "receptionist");
      Janitor janitor = new Janitor("Catherine", "Holt", "janitor");
      
      // Header
      System.out.println("== Hospital Employees ==");
      
      // Object doctor calls other methods    
      doctor.chiefMD();
      doctor.diagnose();
      doctor.prescribe();
      
      System.out.println("-------------------------");
      
      // Object nurse calls other methods
      nurse.chiefRN();
      nurse.diagnose();
      nurse.prescribe();
      
      System.out.println("-------------------------");
      
      // Object admin calls other methods
      admin.headAdmin();
      admin.diagnose();
      admin.prescribe();
      
      System.out.println("-------------------------");
      
      // Object surgeon calls other methods
      surgeon.chiefSurgeon();
      surgeon.diagnose();
      surgeon.prescribe();
      
      System.out.println("-------------------------");
      
      // Object reception calls other methods
      reception.headReception();
      reception.diagnose();
      reception.requestAppt();
      
      System.out.println("-------------------------");
      
      // Object janitor calls other methods
      janitor.headJanitor();
      janitor.diagnose();
      janitor.requestClean();
   
   }

}