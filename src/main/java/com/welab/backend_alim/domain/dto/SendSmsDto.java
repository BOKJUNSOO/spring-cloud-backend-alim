package com.welab.backend_alim.domain.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


// request, response 한번에 처리
// 연관관계를 보기에는 이점이 있음
// 디폴트 생성자의 접근지정자를 private 로 설정한 상태 + 인스턴스화를 못하도록 설정
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SendSmsDto {
    @Getter
    @Setter
    public static class Request {
        private String userId;
        private String phoneNumber;
        private String title;
        private String message;
    }

    @Getter
    @Setter
    public static class Response {
        private String result;
    }

}
