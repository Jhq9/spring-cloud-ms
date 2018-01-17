package isa.qa.senior.core;

import java.io.Serializable;

/**
 * 响应结果生成工具
 */
public class ResultGenerator implements Serializable{
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static Result genSuccessResult() {
        return new Result()
                    .setCode(ResultCodeEnum.SUCCESS)
                    .setMessage(DEFAULT_SUCCESS_MESSAGE);
        }

    public static Result genSuccessResult(Object data) {
        return new Result()
                    .setCode(ResultCodeEnum.SUCCESS)
                    .setMessage(DEFAULT_SUCCESS_MESSAGE)
                    .setData(data);
        }

    public static Result genFailResult(String message) {
        return new Result()
                    .setCode(ResultCodeEnum.FAIL)
                    .setMessage(message);
        }

    public static Result genFailResult(int resultCode,String message){
        return new Result()
                   .setCode(resultCode)
                   .setMessage(message);
    }
}

