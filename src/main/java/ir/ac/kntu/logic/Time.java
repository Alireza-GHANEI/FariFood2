package ir.ac.kntu.logic;

public class Time {

    private int hour;
    private int minute;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Time() {
    }

    @Override
    public String toString() {
        return
                " hour:" + hour +
                ", minute:" + minute;
    }
}
