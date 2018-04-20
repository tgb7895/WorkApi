package com.raintea.entity;

import java.util.List;

public class GetUndistributedOrderData {
    private int order_id;
    private String order_number;
    private String address;
    private String owner_phone;
    private String appointment_time;
    private String cause;
    private String owner_phone_1;
    private List<String> image;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner_phone() {
        return owner_phone;
    }

    public void setOwner_phone(String owner_phone) {
        this.owner_phone = owner_phone;
    }

    public String getAppointment_time() {
        return appointment_time;
    }

    public void setAppointment_time(String appointment_time) {
        this.appointment_time = appointment_time;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getOwner_phone_1() {
        return owner_phone_1;
    }

    public void setOwner_phone_1(String owner_phone_1) {
        this.owner_phone_1 = owner_phone_1;
    }

    public List<String> getImage() {
        return image;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }
}
