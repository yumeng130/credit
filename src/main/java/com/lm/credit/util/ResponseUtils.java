package com.lm.credit.util;


import com.lm.credit.constant.RespCode;


public class ResponseUtils {

    public static BaseResponse success(String seqNo) {
        BaseResponse response = getDefaultSuccessAppMessage(seqNo);
        return response;
    }

    public static <T> BaseResponse<T> success(T data, String seqNo) {
        BaseResponse response = getDefaultSuccessAppMessage(seqNo);
        response.setData(data);
        return response;
    }

    public static <T> BaseResponse<T> success(T data, String seqNo, String message) {
        BaseResponse response = getDefaultSuccessAppMessage(seqNo);
        response.setMessage(message);
        response.setData(data);
        return response;
    }

    public static <T> BaseResponse<T> error(RespCode respCode, String seqNo) {
        BaseResponse response = getBaseResponse(respCode, seqNo);
        return response;
    }

    public static <T> BaseResponse<T> error(T data, RespCode respCode, String seqNo) {
        BaseResponse response = getBaseResponse(respCode, seqNo);
        response.setData(data);
        return response;
    }

    private static BaseResponse getDefaultSuccessAppMessage(String seqNo) {
        return getBaseResponse(RespCode.SUCCESS, seqNo);
    }

    private static BaseResponse getBaseResponse(RespCode respCode, String seqNo) {
        return RespCode.fromBaseResponse(respCode, seqNo);
    }


}
