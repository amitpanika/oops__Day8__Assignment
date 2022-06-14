package Assignment;
    /*
    / HERE WE ARE CHECKING EMPLOYEE IS PRESENT................>>>>>>>>>>>>>>>>>>>>>>>>>
   */
public class uc1__CheckEmployee {

          int employee_is_present = 1;
          int employee_is_absent = 0;

    public static void main(String[] args) {

        int emp_check =  (int) Math.floor(Math.random() *10) % 2;

        if (emp_check == 1){
            System.out.println("present");
        } else
            System.out.println("Absent");
    }
}
