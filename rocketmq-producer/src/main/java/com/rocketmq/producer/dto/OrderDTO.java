package com.rocketmq.producer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : fang.com
 * @CreatTime : 2021-01-27 13:01
 * @Description :
 * @Version :  0.0.1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    //主键id
    private Long id;
    private Long userid;
    //订单code
    private Integer commodityCode;
    //事务id
    private Long transactionId;
    //订单号码
    private String orderNo;
    //订单金额
    private Double amount;


}
