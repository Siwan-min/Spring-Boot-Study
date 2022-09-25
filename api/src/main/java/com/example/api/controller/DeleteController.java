package com.example.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/delete-api")
public class DeleteController {

    // http://localhost:8080/api/v1/delete-api/{String 값}
    @DeleteMapping(value = "/{variable}") // value 이름과 메서드의 매개변수 이름을 동일하게 설정해야 삭제할 값이 주입된다.
    public String DeleteVariable(@PathVariable String variable) {
        return variable;
    }

    // http://localhost:8080/api/v1/delete-api/v1/delete-api/request1?email=value
    @DeleteMapping(value = "/request1")
    public String getRequestParam1(@RequestParam String email) {
        return "e-mail : " + email;
    }
    
}
