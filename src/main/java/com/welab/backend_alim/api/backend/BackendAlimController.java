package com.welab.backend_alim.api.backend;

import com.welab.backend_alim.domain.dto.SendSmsDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

// Micro service 간 통신용 이므로 게이트웨이 외부에서는 이를 공개 안함 (서비스간 api)
// 이에 엔드포인트가 /backend 로 시작하는 엔드포인트는 라우팅을 안함!
@Slf4j // logging
@RestController
@RequestMapping(value = "/backend/alim/v1",produces = MediaType.APPLICATION_JSON_VALUE)
public class BackendAlimController {
    @GetMapping(value = "/hello")
    public String hello() {
        return "알림 백엔드 서비스가 호출되었습니다.";
    }

    @PostMapping(value="/sms")
    public SendSmsDto.Response sendSms(@RequestBody SendSmsDto.Request request) {
        log.info("sendSms: userId={}", request.getUserId());
        // 서비스 레벨에서 이루어져야 하는 로직은 생략

        SendSmsDto.Response response = new SendSmsDto.Response(); // SendSmsDto 자체를 인스턴스화 하지 않음을 확인
        response.setResult("OK");
        return response;
    }
}
