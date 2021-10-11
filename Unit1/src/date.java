public class date {
    public static void main(String[] args) {
        String day = "Monday";
        int date = 23;
        String month = "August";
        int year = 2021;
        writeAmerican(day, date, month, year);
        writeEuropean(day, date, month, year);

    }

    public static void writeAmerican(String day, int date, String month, int year) {

        System.out.print(day + ", ");
        System.out.print(month + " ");
        System.out.print(date + ", ");
        System.out.println(year);
    }

    // euro
    public static void writeEuropean(String day, int date, String month, int year) {

        System.out.print(day + " ");
        System.out.print(date + " ");
        System.out.print(month + " ");
        System.out.println(year);
    }
}
