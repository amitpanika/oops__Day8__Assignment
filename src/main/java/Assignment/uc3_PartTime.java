package Assignment;
      /*
          HERE WE ARE CALCULATING THE EMPLOYEE PART TIME DAILY WAGE..........>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
      */
public class uc3_PartTime {
    public static int IS_FULL_TIME = 2;
    public static int IS_PART_TIME = 1;
    public static int EMP_RATE_PER_HRS = 20;

    public static void main(String[] args) {
        int Empwage = 0;
        int empHrs = 0;
        int empCheck = (int) Math.floor(Math.random() *10) % 3;
        if (empCheck == IS_FULL_TIME)
            empHrs = 8;
        else if (empCheck==IS_PART_TIME)
            empHrs = 4;
        else
            empHrs = 0;
        Empwage = empHrs* EMP_RATE_PER_HRS;
            System.out.println(" Emp Wage " + Empwage);

    }


}
