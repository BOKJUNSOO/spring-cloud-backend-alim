package com.welab.backend_alim.api.open;


import com.welab.backend_alim.remote.user.RemoteUserService;
import com.welab.backend_alim.remote.user.dto.UserInfoDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/api/alim/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class AlimController {
    private final RemoteUserService remoteUserService;

    @GetMapping(value="/test")
    public String test() {
        return remoteUserService.hello();
    }

    @PostMapping(value ="/info")
    public UserInfoDto.Response sms(@RequestBody UserInfoDto.Request request) {
        var response = remoteUserService.sendUserInfo(request);
        return response;
    }

    @GetMapping(value ="/getinfo")
    public String getInfo(@RequestParam("userId") String request) {
        var response = remoteUserService.getInfo(request);
        return response;
    }
}
