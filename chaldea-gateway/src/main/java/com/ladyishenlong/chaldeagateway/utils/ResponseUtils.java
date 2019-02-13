package com.ladyishenlong.chaldeagateway.utils;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 返回信息
 *
 * @param <T>
 */
@Data
@NoArgsConstructor
@ToString
public class ResponseUtils<T> implements Serializable {

    private int code;//规定0为请求失败
    private String message;

    private T data;


    public ResponseUtils(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    /**
     * 请求成功
     *
     * @param message
     * @param data
     * @param <T>
     * @return
     */

    public static <T> ResponseUtils success(String message, T data) {
        return new ResponseUtils(1, message, data);
    }

    public static <T> ResponseUtils success(String message) {
        return success(message, null);
    }

    public static <T> ResponseUtils success(T data) {
        return success("成功", data);
    }

    public static <T> ResponseUtils success() {
        return success("成功", null);
    }


    /**
     * 请求失败
     *
     * @param message
     * @param data
     * @param <T>
     * @return
     */

    public static <T> ResponseUtils failure(String message, T data) {
        return new ResponseUtils(0, message, data);
    }


    public static <T> ResponseUtils failure(String message) {
        return failure(message, null);
    }


    public static <T> ResponseUtils failure(T data) {
        return failure("失败", data);
    }

    public static <T> ResponseUtils failure() {
        return failure("失败", null);
    }


}
