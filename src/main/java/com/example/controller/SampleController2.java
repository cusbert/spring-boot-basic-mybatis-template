package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("web")
public class SampleController2 {

    private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);

    @RequestMapping("doC")
    public String doC(@ModelAttribute("msg") String msg) {
        logger.info("doC called...");

        return "result";
    }
}
