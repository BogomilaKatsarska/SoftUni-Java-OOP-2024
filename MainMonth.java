package Month;

public class MainMonth {
    public static void main(String[] args) {
        System.out.println(Month.APRIL);
        printMonth(Month.JANUARY);
        for(Month month: Month.values()){
            System.out.println(month);
            System.out.println(month.ordinal()); // returns the consecutive number of the month
        }
    }
    public static void printMonth(Month month){
        System.out.println("This month is " + month);
    }
}
