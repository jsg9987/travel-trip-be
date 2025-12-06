package com.ssafy.travelTune.global.error;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
	// Method Not Allowed Error
	METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, "지원하지 않는 HTTP 메소드입니다."),
	
	// Not Found Error: 404
	NOT_FOUND(HttpStatus.NOT_FOUND, "Not Found "),
	NOT_FOUND_END_POINT(HttpStatus.NOT_FOUND, "존재하지 않는 API 엔드포인트입니다."),
    NOT_FOUND_RESOURCE(HttpStatus.NOT_FOUND, "해당 리소스가 존재하지 않습니다."),
    NOT_FOUND_AUTHORIZATION_HEADER(HttpStatus.NOT_FOUND, "Authorization 헤더가 존재하지 않습니다."),
    NOT_FOUND_USER(HttpStatus.NOT_FOUND, "존재하지 않는 사용자입니다."),

	// Invalid Argument Error(BAD_REQUEST): 400 
    MISSING_PATH_VARIABLE(HttpStatus.BAD_REQUEST, "필수 경로 변수가 누락되었습니다."),
    MISSING_REQUEST_PARAMETER(HttpStatus.BAD_REQUEST, "필수 파라미터가 누락되었습니다."),
    INVALID_ARGUMENT(HttpStatus.BAD_REQUEST, "유효하지 않은 인자입니다."),
    INVALID_PARAMETER_FORMAT(HttpStatus.BAD_REQUEST, "유효하지 않은 인자 형식입니다."),
    INVALID_HEADER_ERROR(HttpStatus.BAD_REQUEST, "유효하지 않은 헤더입니다."),
    INVALID_PERIOD(HttpStatus.BAD_REQUEST, "유효하지 않은 period입니다."),
    MISSING_REQUEST_HEADER(HttpStatus.BAD_REQUEST, "필수 요청 헤더가 누락되었습니다."),
    BAD_REQUEST_PARAMETER(HttpStatus.BAD_REQUEST, "잘못된 요청 파라미터입니다."),
    UNSUPPORTED_MEDIA_TYPE(HttpStatus.BAD_REQUEST, "지원하지 않는 미디어 타입입니다."),
    BAD_REQUEST_JSON(HttpStatus.BAD_REQUEST, "잘못된 JSON 형식입니다."),
    EXCEEDED_MAX_SIZE(HttpStatus.BAD_REQUEST, "파일 크기가 3MB를 초과했습니다."),
    DUPLICATED_USER(HttpStatus.BAD_REQUEST, "중복된 사용자입니다."),
    NO_FILE_EXTENSION(HttpStatus.BAD_REQUEST, "파일에 확장자가 없습니다."),
	
    // Unauthorized Error: 401
    UNAUTHORIZED_MEMBER(HttpStatus.UNAUTHORIZED, "인증되지 않은 사용자입니다."),
    FAILURE_LOGIN(HttpStatus.UNAUTHORIZED, "잘못된 아이디 또는 비밀번호입니다."),
    EXPIRED_TOKEN_ERROR(HttpStatus.UNAUTHORIZED, "만료된 토큰입니다."),
    INVALID_TOKEN_ERROR(HttpStatus.UNAUTHORIZED, "유효하지 않은 토큰입니다."),
    TOKEN_MALFORMED_ERROR(HttpStatus.UNAUTHORIZED, "토큰이 올바르지 않습니다."),
    TOKEN_TYPE_ERROR(HttpStatus.UNAUTHORIZED, "토큰 타입이 일치하지 않거나 비어있습니다."),
    TOKEN_UNSUPPORTED_ERROR(HttpStatus.UNAUTHORIZED, "지원하지 않는 토큰입니다."),
    TOKEN_GENERATION_ERROR(HttpStatus.UNAUTHORIZED, "토큰 생성에 실패하였습니다."),
    TOKEN_UNKNOWN_ERROR(HttpStatus.UNAUTHORIZED, "알 수 없는 토큰입니다."),
	
    // Access Denied Error(FORBIDDEN): 403
    ACCESS_DENIED(HttpStatus.FORBIDDEN, "접근 권한이 없습니다."),
	
	// Unsupported Media Type: 415
	
	
    // Internal Server Error: 500
	INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "서버 내부 에러입니다."),
	
	
    // External Server Error(BAD_GATEWAY): 502
	EXTERNAL_SERVER_ERROR(HttpStatus.BAD_GATEWAY, "서버 외부 에러입니다.");
	
	private final HttpStatus httpStatus;
	private final String message;
}
