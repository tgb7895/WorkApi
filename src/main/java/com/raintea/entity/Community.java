package com.raintea.entity;

public class Community {
    private int community_id;
    private String community_name;

    public int getCommunity_id() {
        return community_id;
    }

    public void setCommunity_id(int community_id) {
        this.community_id = community_id;
    }

    public String getCommunity_name() {
        return community_name;
    }

    public void setCommunity_name(String community_name) {
        this.community_name = community_name;
    }

    @Override
    public String toString() {
        return "Community{" +
                "community_id=" + community_id +
                ", community_name='" + community_name + '\'' +
                '}';
    }
}
