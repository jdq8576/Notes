package enumtest;

/**
 * @author tim
 * @date 2022/11/22 18:20
 */
public class Main {
    public static void main(String[] args) {
        Weekday weekday = Weekday.SUN;
        if (weekday == Weekday.SAT || weekday == Weekday.SUN) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }

        for (Weekday value : Weekday.values()) {
            System.out.println(value.name());
        }

        System.out.println(weekday.ordinal());

        Weekday day = Weekday.SUN;
        if (day.dayValue == 6 || day.dayValue == 0) {
            System.out.println("Today is " + day + ". Work at home!");
        } else {
            System.out.println("Today is " + day + ". Work at office!");
        }

        System.out.println(day.toString());
        System.out.println(day.name());

        System.out.println(Weekday.valueOf(Weekday.class, "SUN"));
    }
}

enum Weekday {
    SUN(1, "星期一"), MON(2, "星期二"),

    TUE(3, "星期三"), WED(4, "星期四"),

    THU(5, "星期五"), FRI(6, "星期六"),

    SAT(0, "星期日");

    public final int dayValue;
    public final String chinese;

    Weekday(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return this.chinese;
    }
}
