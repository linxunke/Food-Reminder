package com.isc.remind.controller;

import com.isc.remind.service.ReminderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import javax.validation.Valid;

//http://www.tikalk.com/redirectattributes-new-feature-spring-mvc-31/
//https://en.wikipedia.org/wiki/Post/Redirect/Get
//http://www.oschina.net/translate/spring-mvc-flash-attribute-example
@Controller
public class ReminderController {

    private final Logger logger = LoggerFactory.getLogger(ReminderController.class);

    private ReminderService reminderService;

    @Autowired
    public void setReminderService(ReminderService reminderService) {
        this.reminderService = reminderService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        logger.debug("index()");
        return "redirect:/main";
    }

    // list page
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String showAllFoods(Model model) {

        logger.debug("showAllFoods()");
        model.addAttribute("foods", reminderService.findAll());
        return "main/reminder";

    }


}