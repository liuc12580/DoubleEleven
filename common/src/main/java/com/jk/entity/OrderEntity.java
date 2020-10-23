package com.jk.entity;

import lombok.Data;

@Data
public class OrderEntity {

    private Integer orderId;

    private String orderNum;

    private String orderName;

    private String orderPrice;

    private String createTime;

    private Integer payType;
}
