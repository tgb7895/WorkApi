package com.raintea.entity;

public class OrderIn {
    String community_id;
    String worker_id;

    public OrderIn() {
    }

    public OrderIn(String community_id, String worker_id) {
        this.community_id = community_id;
        this.worker_id = worker_id;
    }

    public String getCommunity_id() {
        return community_id;
    }

    public void setCommunity_id(String community_id) {
        this.community_id = community_id;
    }

    public String getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(String worker_id) {
        this.worker_id = worker_id;
    }
}
