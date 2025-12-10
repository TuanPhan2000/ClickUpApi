package com.phan.clickupapi.enums;

public enum ResponseStatus {

    SUCCESS(200, true),
    CREATED(201, true),
    BAD_REQUEST(400, false),
    UNAUTHORIZED(401, false),
    FORBIDDEN(403, false),
    NOT_FOUND(404, false),
    SERVER_ERROR(500, false);

    private final int status;
    private final boolean success;

    ResponseStatus(int status, boolean success) {
        this.status = status;
        this.success = success;
    }

    public int getStatus() {
        return status;
    }

    public boolean isSuccess() {
        return success;
    }

}
