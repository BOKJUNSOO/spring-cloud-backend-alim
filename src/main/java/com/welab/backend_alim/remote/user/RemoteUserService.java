package com.welab.backend_alim.remote.user;


import com.welab.backend_alim.remote.user.dto.UserInfoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "backend-user", path = "/backend/user/v1")
public interface RemoteUserService {
    @GetMapping(value="/info")
    public String hello();

    @PostMapping(value = "/info")
    public UserInfoDto.Response sendUserInfo(@RequestBody UserInfoDto.Request request);

    @GetMapping(value="/getinfo")
    public String getInfo(@RequestParam("userId") String request);
}


//package com.welab.backend_alim.remote.user;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//@Service
//@RequiredArgsConstructor
//public class RemoteUserService {
//    private final RestTemplate restTemplate;
//
//    public String hello() {
//        return restTemplate.getForObject(
//                "http://backend-user/backend/user/v1/hello",
//                String.class
//        );
//    }
//}
