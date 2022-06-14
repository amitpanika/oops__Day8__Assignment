package Assignment;

  /*
  /  HERE WE ARE CHECKING EMPLOYEE DAILY WAGE.........>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
  */

public class uc2__DailyEmployeeWage {
    public static int EMP_FULL_TIME = 1;
    public static  int EMP_RATE_FULL_HRS = 20;
    public static int Emp_hrs = 0;
    public static int emp_Wage = 0;

    public static void main(String[] args) {


        int emp_check =  (int) Math.floor(Math.random() *10) % 2;
        int EMP_hrs;
        if (emp_check == EMP_FULL_TIME)
            EMP_hrs = 8;
        else
            EMP_hrs = 0;
        int empwage = EMP_hrs * EMP_RATE_FULL_HRS;
        System.out.println("Emp Wage: " + empwage);
    }

}
