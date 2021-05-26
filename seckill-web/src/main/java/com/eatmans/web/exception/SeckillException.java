package com.eatmans.web.exception;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/5/26
 */
/**
 * 秒杀相关的所有业务异常
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}