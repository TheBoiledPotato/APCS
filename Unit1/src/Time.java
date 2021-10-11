public class Time {
    public static void main(String[] args) {

int hour = 18 ;
int minute = 30 ;
int second = 00 ;
int daySecond = 86400 ;
minute = hour*60 + minute;
second = minute*60 + second;
System.out.print("seconds since midnight: ");
System.out.println(second);
System.out.print("seconds until midnight: ");
System.out.println(daySecond - second);
System.out.println("% of day passed " +(100.0 * second / daySecond));
    }   

}
