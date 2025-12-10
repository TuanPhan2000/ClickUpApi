package com.phan.clickupapi.model.response;

import com.phan.clickupapi.enums.ResponseStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
public class ApiResponse<T> {

    private int status;

    private boolean success;

    private List<MessageDetail> messages;

    private T data;

    private Instant timestamp;

    @Getter
    @Setter
    @Builder
    public static class MessageDetail {
        private String messageKey;
        private List<String> params;
    }

    public static <T> ApiResponse<T> create(T data, ResponseStatus responseStatus) {

        return ApiResponse.<T>builder()
                .status(responseStatus.getStatus())
                .success(responseStatus.isSuccess())
                .data(data)
                .timestamp(Instant.now())
                .messages(new ArrayList<>())
                .build();
    }

    public void addMessage(String key, String... params) {
        messages.add(
                MessageDetail.builder()
                        .messageKey(key)
                        .params(new ArrayList<>(List.of(params)))
                        .build()
        );
    }
}
