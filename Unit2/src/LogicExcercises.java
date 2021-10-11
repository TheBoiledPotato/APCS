
public class LogicExcercises {
    public static void main(String[] args) {
        System.out.println(isThirteen(9, 23, 2240));
        System.out.println(isLeapYear(2000));
        unitTestIsThirteen();
    }

    public static boolean isThirteen(int month, int day, int year) {
    
        if (year > 2008) {
            return false;
        } else if (year < 2008) {
            return true;
        } else if (month < 9) {
            return true;
        } else if (month > 9) {
            return false;
        } else if (day < 23) {
            return false;
        } else if (day > 23) {
            return false;
        } else {
            return true;
        }

    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void unitTestIsThirteen() {
        final int YEAR = 2008;
        final int MONTH = 9;
        final int DAY = 23;
        System.out.println("Do the actual and expected results match?");
        // actual result expected result
        System.out.println("Birthday in next year:");
        // >m >d >y
        System.out.println(isThirteen(MONTH + 1, DAY + 1, YEAR + 1) == false);
        // <m >d >y
        System.out.println(isThirteen(MONTH - 1, DAY + 1, YEAR + 1) == false);
        // =m >d >y
        System.out.println(isThirteen(MONTH, DAY + 1, YEAR + 1) == false);

        // >m <d >y
        System.out.println(isThirteen(MONTH + 1, DAY - 1, YEAR + 1) == false);
        // <m <d >y
        System.out.println(isThirteen(MONTH - 1, DAY - 1, YEAR + 1) == false);
        // =m <d >y
        System.out.println(isThirteen(MONTH, DAY - 1, YEAR + 1) == false);

        // >m =d >y
        System.out.println(isThirteen(MONTH + 1, DAY, YEAR + 1) == false);
        // <m =d >y
        System.out.println(isThirteen(MONTH - 1, DAY, YEAR + 1) == false);
        // =m =d >y
        System.out.println(isThirteen(MONTH, DAY, YEAR + 1) == false);

        System.out.println("Birthday in previous year:");
        // >m >d <y
        System.out.println(isThirteen(MONTH + 1, DAY + 1, YEAR - 1) == true); //FALSE???
        // <m >d <y
        System.out.println(isThirteen(MONTH - 1, DAY + 1, YEAR - 1) == true);
        // =m >d <y
        System.out.println(isThirteen(MONTH, DAY + 1, YEAR - 1) == true); //FALSE????

        // >m <d <y
        System.out.println(isThirteen(MONTH + 1, DAY - 1, YEAR - 1) == true);
        // <m <d <y
        System.out.println(isThirteen(MONTH - 1, DAY - 1, YEAR - 1) == true);
        // =m <d <y
        System.out.println(isThirteen(MONTH, DAY - 1, YEAR - 1) == true);

        // >m =d <y
        System.out.println(isThirteen(MONTH + 1, DAY, YEAR - 1) == true);
        // <m =d <y
        System.out.println(isThirteen(MONTH - 1, DAY, YEAR - 1) == true);
        // =m =d <y
        System.out.println(isThirteen(MONTH, DAY, YEAR - 1) == true);

        System.out.println("Birthday in this year:");
        // >m >d =y
        System.out.println(isThirteen(MONTH + 1, DAY + 1, YEAR) == false);
        // <m >d =y
        System.out.println(isThirteen(MONTH - 1, DAY + 1, YEAR) == true);
        // =m >d =y
        System.out.println(isThirteen(MONTH, DAY + 1, YEAR) == false);

        // >m <d =y
        System.out.println(isThirteen(MONTH + 1, DAY - 1, YEAR) == false); //FALSE????
        // <m <d =y
        System.out.println(isThirteen(MONTH - 1, DAY - 1, YEAR) == true);
        // =m <d =y
        System.out.println(isThirteen(MONTH, DAY - 1, YEAR) == true);

        // >m =d =y
        System.out.println(isThirteen(MONTH + 1, DAY, YEAR) == false); //FALSE????
        // <m =d =y
        System.out.println(isThirteen(MONTH - 1, DAY, YEAR) == true);
        // =m =d =y
        System.out.println(isThirteen(MONTH, DAY, YEAR) == true);
    }
}
