package me.diegoospina.webapi.controller;


import me.diegoospina.webapi.service.impl.NumberTransformService;
import me.diegoospina.webapi.vo.ResponseNumberTransform;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NumberTransformControllerTest {
    @Autowired
    NumberTransformService numberTransformService;

    @Test
    void arabicToRoman() {
        // Given
        int arabicNumber = 99;

        // When
        ResponseNumberTransform result = numberTransformService.convertArabicToRoman(arabicNumber);

        // Then

        assertThat(result, is(not(nullValue())));
        assertThat(result.getArabicNumber(), is(99));
        assertThat(result.getRomanNumber(), is("XCIX"));
    }

    @Test
    public void arabicToRomanFailure() {

        // Given
        int arabicNumber = 99999;

        //When - Then
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            numberTransformService.convertArabicToRoman(arabicNumber);
        });

    }
}