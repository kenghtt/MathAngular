package com.math.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Project: MathAngular
 * Package: com.controller
 * <p>
 * User: jeremytouch
 * Date: 7/25/19
 * Time: 12:10 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */


@Controller
public class MathController {

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World";
    }

}

