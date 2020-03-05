package me.diegoospina.webapi.service.impl;


import me.diegoospina.domain.INumberTransform;
import me.diegoospina.domain.NumberTransform;
import me.diegoospina.webapi.service.INumberTransformService;
import me.diegoospina.webapi.vo.ResponseNumberTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NumberTransformService implements INumberTransformService {
    private final INumberTransform numberTransform;

    @Autowired
    public NumberTransformService() {
        this.numberTransform = new NumberTransform();
    }

    @Override
    public ResponseNumberTransform convertArabicToRoman(int arabicNumber) {
        String romanNumber = this.numberTransform.convertArabicToRoman(arabicNumber);
        return new ResponseNumberTransform.Builder()
                .withArabicNumber(arabicNumber)
                .withRomanNumber(romanNumber)
                .build();
    }
}
