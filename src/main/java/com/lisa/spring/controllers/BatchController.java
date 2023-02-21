package com.lisa.spring.controllers;

import com.lisa.spring.dao.PersonDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test-batch-update")
public class BatchController {
    private final PersonDao personDao;

    public BatchController(PersonDao personDao) {
        this.personDao = personDao;
    }

    @GetMapping
    public String index() {
        return "batch/1index";

    }

//    @GetMapping("/without")
//    public String withoutBatch() {
//        personDao.testMultipleUpdate();
//        return "redirect:/people";
//    }
//
//    @GetMapping("/with")
//    public String withBatch() {
//        personDao.testButchUpdate();
//        return "redirect:/people";
//    }

}
