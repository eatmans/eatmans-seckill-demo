package com.eatmans.web.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/5/26
 */
@Data
public class Seckill {

    private long seckillId;

    private String name;

    private int number;

    private Date startTime;

    private Date endTime;

    private Date createTime;
}
