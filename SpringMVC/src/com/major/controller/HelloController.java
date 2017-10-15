package com.major.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Major on 2017/10/15.
 */
@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(ModelMap map) {
        map.addAttribute("name", "major");
        map.addAttribute("msg", "the spring mvc");
        return "hello";
    }

    @RequestMapping(value = "/add")
    public String add(HttpServletRequest request, ModelMap map) {
        String a = request.getParameter("a");
        String b = request.getParameter("b");
        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        map.addAttribute("a", a);
        map.addAttribute("b", b);
        map.addAttribute("sum", sum);
        return "add";
    }
}
