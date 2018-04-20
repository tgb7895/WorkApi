package com.raintea.entity;

import java.util.List;

public class GetUndistributedOrder extends Returndata {
    List<GetUndistributedOrderData> data;

    public List<GetUndistributedOrderData> getData() {
        return data;
    }

    public void setData(List<GetUndistributedOrderData> data) {
        this.data = data;
    }
}
