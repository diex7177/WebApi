package me.diegoospina.webapi.controller;

import me.diegoospina.webapi.service.INumberTransformService;
import me.diegoospina.webapi.vo.ResponseNumberTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class NumberTransformController {
    private final INumberTransformService service;

    @Autowired
    public NumberTransformController(INumberTransformService service) {
        this.service = service;
    }

    @RequestMapping(value = "ArabicToRoman", method = RequestMethod.POST)
    public ResponseNumberTransform ArabicToRoman(@RequestBody int arabicNumber) {
        return service.convertArabicToRoman(arabicNumber);
    }
}
