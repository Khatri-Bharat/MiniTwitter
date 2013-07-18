package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostController {

    @RequestMapping(value = "/posts/{username}", method = RequestMethod.POST)
    public void createPost(@PathVariable String username) {
        // create a post from the given user
    }

    @RequestMapping(value = "/posts/{username}", method = RequestMethod.GET)
    public void fetchPost(@PathVariable String username) {
        // create a post from the given user
    }

}
