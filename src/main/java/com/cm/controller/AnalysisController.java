package com.cm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author cm
 * @date 2024/10/18 9:14
 */
@RestController
@RequestMapping("/analysis")
public class AnalysisController {


    @RequestMapping(value = "/v1",method = RequestMethod.GET)
    public String analysis(){
        return "analysis";
    }
}
