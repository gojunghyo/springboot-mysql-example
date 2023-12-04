package com.example.gojghomysql.controller;

import com.example.gojghomysql.entity.User;
import com.example.gojghomysql.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/demo")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * mvc 패턴에서
     * m: model 처리하고자하는 객체
     * v: view view resolver 에 의해서 보여지는 데이터바인딩한 화면 (view) path return 하므로 @RestController나
     * @ResponseBody 부분으로 리턴시 스트링이 리턴됨
     * c: controller
     *
     * 흐름: req -> dispatcherServlet -> handlerMapping -> controller -> servlet -> viewResolver -> view
     * -> response
     *
     *
     * 추가로 bean관련 어노테이션중
     * @Qualifier annotation은 어떤 bean 을 주입받을지 명시해주는데 이떄 사용한 값은 해당 bean의 이름이다.
     */

    @PostMapping(path = "/add/user")
    public @ResponseBody String addUser(@RequestParam String name,
                                        @RequestParam String email) {
        return userService.savedUser(name, email);
    }

    @GetMapping("/all/user")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }



}
