package com.itxxy.pojo.common;

import lombok.Getter;

@Getter
public enum ErrorCode {
    SUCCESS(0,"ok",""),
    PARAMS_ERROR(40000,"请求参数错误",""),
    NULL_ERROR(40001,"数据为空",""),
    NOT_LOGIN_ERROR(40100,"未登录",""),
    NOT_AUTH_ERROR(40300,"没有权限",""),
    SYSTEM_ERROR(50000,"系统内部异常","")
    ;
    /**
     * 状态码
     */
    private final int code;
    /**
     * 状态码信息
     */
    private final String message;
    /**
     * 状态码信息（详细描述）
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

}
