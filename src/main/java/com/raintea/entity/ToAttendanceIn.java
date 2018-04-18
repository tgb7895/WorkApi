package com.raintea.entity;

public class ToAttendanceIn {
    private int worker_id;
    private String x;
    private String y;
    private int flag;
    private String date;

    public int getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(int worker_id) {
        this.worker_id = worker_id;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ToAttendanceIn(int worker_id, String x, String y, int flag, String date) {

        this.worker_id = worker_id;
        this.x = x;
        this.y = y;
        this.flag = flag;
        this.date = date;
    }
}
