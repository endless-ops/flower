package cn.dreamchase.flower.ui.bean;

public class RecordDate {
    private String date;
    private int year;
    private int month;
    private int day;
    private int week;
    private long time;
    private int plant_counts;
    private int share_counts;
    private float hour;

    public RecordDate setHour(float hour) {
        this.hour = hour;
        return this;
    }

    public String getDate() {
        return date;
    }

    public RecordDate setDate(String date) {
        this.date = date;
        return this;
    }

    public int getYear() {
        return year;
    }

    public RecordDate setYear(int year) {
        this.year = year;
        return this;
    }

    public int getMonth() {
        return month;
    }

    public RecordDate setMonth(int month) {
        this.month = month;
        return this;
    }

    public int getDay() {
        return day;
    }

    public RecordDate setDay(int day) {
        this.day = day;
        return this;
    }

    public int getWeek() {
        return week;
    }

    public RecordDate setWeek(int week) {
        this.week = week;
        return this;
    }

    public long getTime() {
        return time;
    }

    public RecordDate setTime(long time) {
        this.time = time;
        return this;
    }

    public int getPlant_counts() {
        return plant_counts;
    }

    public RecordDate setPlant_counts(int plant_counts) {
        this.plant_counts = plant_counts;
        return this;
    }

    public int getShare_counts() {
        return share_counts;
    }

    public RecordDate setShare_counts(int share_counts) {
        this.share_counts = share_counts;
        return this;
    }

    public float getHour() {
        return hour;
    }

}
