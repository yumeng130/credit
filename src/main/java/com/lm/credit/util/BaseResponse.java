package com.lm.credit.util;

import lombok.Data;

@Data
public class BaseResponse<T> {

    private String code;
    private String message;
    private String seqNo;

    /**
     * 描述 : 结果集(泛型)，正确请求时这里有值
     */
    private T data;

    public BaseResponse() {
    }

    public BaseResponse(String code, String message, String seqNo) {
        this.code = code;
        this.message = message;
        this.seqNo = seqNo;
    }

}
