package me.diegoospina.webapi.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class NumberTransformController {
    @RequestMapping(value = "ArabicToRoman", method = RequestMethod.POST)
    public String ArabicToRoman(@RequestBody String arabicNumber) {
        //return consultantService.createConsultant(consultant);
        return "Test";
    }
}
