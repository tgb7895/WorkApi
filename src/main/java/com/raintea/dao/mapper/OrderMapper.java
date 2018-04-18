package com.raintea.dao.mapper;

import com.raintea.entity.OrderEntity;
import com.raintea.entity.OrderIn;

public interface OrderMapper {
//    小区 community_id array 小区id,物业人员维修小区id 不可空 个人id worker_id
    OrderEntity get(OrderIn order);
}
