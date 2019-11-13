package com.lm.credit.constant;


import com.lm.credit.util.BaseResponse;

public enum RespCode {
    /**
     * SUCCESS
     */
    SUCCESS("10000", "成功"),
    SERVER_ERROR("10001", "服务器端出错");

    private String code;
    private String message;

    RespCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static BaseResponse fromBaseResponse(RespCode respCode, String seqNo) {
        BaseResponse response = new BaseResponse(respCode.getCode(), respCode.getMessage(), seqNo);
        return response;
    }
}
