package com.eatmans.web.dao;

import com.eatmans.web.entity.Seckill;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/5/26
 */
public interface SeckillDao
{

    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return 如果影响行数>1，表示更新库存的记录行数
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * 根据id查询秒杀的商品信息
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);



}
