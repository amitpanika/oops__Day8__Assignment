package comparison;

public class calculateLength {
    int x1 = 45, x2 = 88, y1 = 65, y2 = 88;

    public static void main(String[] args) {
        calculateLength calculateLength = new calculateLength();
        System.out.println("Length of line1");
        calculateLength.printLine();
        calculateLength calculateLength2 = new calculateLength();
        calculateLength.x1 = 55;
        calculateLength.y1 = 95;
        calculateLength.x2 = 75;
        calculateLength.y2 = 65;
        System.out.println("Length of line2");
        calculateLength.printLine();

    }

    public void printLine() {
        int line = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println(((int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))));
    }

}

