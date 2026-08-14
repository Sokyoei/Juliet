package com.ahri.springbootlearn.utils.errors;

public enum HTTPError {
    SUCCESS(200, "成功"),
    FORBIDDEN(403, "服务器拒绝"),
    NOT_FOUND(404, "服务器不存在");

    private final int code;
    private final String description;

    HTTPError(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
