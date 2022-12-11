package main;

public class Calendar {

    int year;

    public Calendar(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        return (year > 1900 && year <=2000 && year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}
