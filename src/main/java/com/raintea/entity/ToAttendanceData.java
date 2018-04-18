package com.raintea.entity;

public class ToAttendanceData {
    private int repair_id;
    private String owner_name;
    private String order_number;
    private String cause;
    private String address;

    public ToAttendanceData() {
    }

    public ToAttendanceData(int repair_id, String owner_name, String order_number, String cause, String address) {
        this.repair_id = repair_id;
        this.owner_name = owner_name;
        this.order_number = order_number;
        this.cause = cause;
        this.address = address;
    }

    public int getRepair_id() {
        return repair_id;
    }

    public void setRepair_id(int repair_id) {
        this.repair_id = repair_id;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
