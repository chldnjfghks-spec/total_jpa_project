package com.my.total_jpa_back.common.exception;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
//
public class ErrorResponse {
    // 에러상태코드
    private int status;
    // 오류메시지
    private String message;
}
