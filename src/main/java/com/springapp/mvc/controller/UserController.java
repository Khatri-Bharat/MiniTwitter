package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @RequestMapping(value = "/users/{username}/newsfeed", method = RequestMethod.GET)
    public ModelAndView getNewsfeed(@PathVariable String username, HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        System.out.println(request.getHeader("User-Agent"));
        System.out.println(request.getRemoteHost());
        return mv;
    }

    @RequestMapping(value = "/users/{username}/followers", method = RequestMethod.GET)
    public void getFollowers(@PathVariable String username) {
        System.out.println("Getting user's followers");
    }

    @RequestMapping(value = "/users/{username}/following", method = RequestMethod.GET)
    public void getFollowing(@PathVariable String username) {
        System.out.println("Getting user's following");
    }

}
