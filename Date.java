public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int newMonth) {
        this.month = newMonth;
    }

    public void setDay(int newDay) {
        this.day = newDay;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public void setDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date: " + month + "/" + day + "/" + year;
    }
}