package com.ssafy.travelTune.global.common;

import com.ssafy.travelTune.global.error.ErrorCode;

import lombok.Getter;

@Getter
public class ExceptionDto {
//    private HttpStatus status;
    private final String message;

    public ExceptionDto(ErrorCode errorCode) {
        this.message = errorCode.getMessage();
    }

    public static ExceptionDto of(ErrorCode errorCode) {
        return new ExceptionDto(errorCode);
    }
}