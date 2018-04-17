package com.charlie.entity;


import java.util.List;

public class LoginEntity extends Returndata {

    private int worker_id;
    private String username;
    private String phone;
    private String home_address;
    private String upic;
    private String card_id;
    private int evaluation;
    private List<Community> community_data;

    public List<Community> getCommunity_data() {
        return community_data;
    }

    public void setCommunity_data(List<Community> community_data) {
        this.community_data = community_data;
    }

    public int getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(int worker_id) {
        this.worker_id = worker_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHome_address() {
        return home_address;
    }

    public void setHome_address(String home_address) {
        this.home_address = home_address;
    }

    public String getUpic() {
        return upic;
    }

    public void setUpic(String upic) {
        this.upic = upic;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }

    @Override
    public String toString() {
        return "LoginEntity{" +
                "worker_id=" + worker_id +
                ", username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", home_address='" + home_address + '\'' +
                ", upic='" + upic + '\'' +
                ", card_id='" + card_id + '\'' +
                ", evaluation=" + evaluation +
                ", community_data=" + community_data +
                '}';
    }
}
