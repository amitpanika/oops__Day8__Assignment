package Assignment;

public class uc5__CalculatingForAMonth {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HRS = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;

    public static void main(String[] args) {
        int Empwage = 0;
        int empHrs = 0;
        int totalempwage = 0;

        for ( int day =0; day<=NUM_OF_WORKING_DAYS; day++){
            int empCheck = (int) Math.floor(Math.random() *10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            Empwage = empHrs * EMP_RATE_PER_HRS;
            totalempwage += Empwage;
            System.out.println("EMPWAGE " + Empwage);
        }
        System.out.println(" Total  Emp Wage: " + totalempwage);
    }
}
