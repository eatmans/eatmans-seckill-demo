package com.eatmans.web.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/5/26
 */
@Data
public class SuccessKilled {

    private long seckillId;

    private long userPhone;

    private short state;

    private Date createTime;

    //多对一,因为一件商品在库存中有很多数量，对应的购买明细也有很多。
    private Seckill seckill;

}
