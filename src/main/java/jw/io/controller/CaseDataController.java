package jw.io.controller;

import com.mashape.unirest.http.exceptions.UnirestException;
import jw.io.web.Rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;
import java.util.Map;

@RestController
@EnableWebMvc
@RequestMapping("/cv19/cases")
public class CaseDataController {

    @Autowired
    Rest<String> rest;

    @RequestMapping(path = "/listAll", method = RequestMethod.GET)
    public String listAll() {
        return rest.get();
    }

    @RequestMapping(path = "/getBy", method = RequestMethod.GET)
    public String getBy(@RequestParam String q) {
        return rest.get(q);
    }

}
