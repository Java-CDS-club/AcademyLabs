package java.oop.lab_2_13_3;


public enum MyDayOfWeek {

    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public MyDayOfWeek nextDay() {
        if (this.ordinal() == MyDayOfWeek.values().length - 1) {
            return SUNDAY;
        } else {
            return MyDayOfWeek.values()[this.ordinal() + 1];
        }
    }
}
