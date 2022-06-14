package comparison;

class calculate {
    int x1, x2, y1, y2;

    public static void main(String[] args) {
        calculate calculate1 = new calculate();
        calculate1.x1 = 25;
        calculate1.y1 = 35;
        calculate1.x2 = 65;
        calculate1.y2 = 25;
        System.out.println("Length of line1");
        calculate1.line1();
        calculate calculate2 = new calculate();
        calculate2.x1 = 75;
        calculate2.y1 = 95;
        calculate2.x2 = 65;
        calculate2.y2 = 35;
        System.out.println("Length of line2");
        calculate2.line2();

    }

    public void line1() {

        int line = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println((int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));

    }

    public void line2() {
        int line = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println((int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
    }
}
