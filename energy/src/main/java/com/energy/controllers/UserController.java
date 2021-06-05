package com.energy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @RequestMapping("/test")
    public ModelAndView testAdd(HttpServletRequest request, HttpServletResponse response) {
         ModelAndView model = new ModelAndView();
         model.setViewName("test");
         model.addObject("number",9);
        return model;
    }
}
