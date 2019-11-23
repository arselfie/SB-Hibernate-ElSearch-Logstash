package house.smart.smarthouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String welcome() {
        return "myindex";
    }

    @RequestMapping("/handler")
    public String handler() {
        return "hadlerindex";
    }

    @RequestMapping("/userList")
    public String userList() {
        return "userList";
    }

//    @RequestMapping("/user/list")
//    public String userList() {
//        return "user/list";
//    }

    @RequestMapping("/homeList")
    public String homeList() {
        return "homeList";
    }
}
