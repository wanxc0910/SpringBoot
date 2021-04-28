package com.example.blog.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：wanxc
 * @date ：Created in 2021/4/19 20:40
 * @description：
 */
@Data
public class Result implements Serializable {

    public static final long serializable = 1L;

    private String code; // 200 成功 其它 异常

    private String msg; // 返回信息

    private Object data; // 数据

    /**
     * @param code
     * @param msg
     * @param data
     * @return
     */
    public static Result getResult(String code, String msg, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    /**
     * 成功
     *
     * @param data
     * @return
     */
    public static Result success(Object data) {
        return getResult("200", "成功", data);
    }

    /**
     * 失败
     *
     * @param msg
     * @return
     */
    public static Result fail(String msg) {
        return getResult("400", msg, null);
    }

    /**
     * 失败
     *
     * @param msg
     * @return
     */
    public static Result fail(String code, String msg, Object data) {
        return getResult(code, msg, data);
    }
}
