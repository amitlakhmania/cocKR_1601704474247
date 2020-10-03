package com.cockr.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.PropertySource;

import com.cockr.controller.base.CocBaseController;

@RestController
@PropertySource("classpath:${configfile.path}/cocKR.properties")
@RequestMapping(value="${endpoint.api}", headers = "Accept=application/json")
public class CocController extends CocBaseController {

	//OVERRIDE HERE YOUR CUSTOM CONTROLLER

}
