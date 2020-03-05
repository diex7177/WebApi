package me.diegoospina.webapi.service;

import me.diegoospina.webapi.service.impl.NumberTransformServiceImpl;
import me.diegoospina.webapi.vo.ResponseNumberTransform;
import org.junit.jupiter.api.Test;

import java.util.Random;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

class NumberTransformServiceTest {

    private final NumberTransformService sut = new NumberTransformServiceImpl();

    @Test
    public void arabicToRomanSuccess() {
        // Given
        int arabicNumber = new Random().nextInt();

        // When
        ResponseNumberTransform result = sut.arabicToRoman(arabicNumber);

        // Then

        assertThat(result, is(not(nullValue())));
        assertThat(result.getArabicNumber(), is(1));
        assertThat(result.getRomanNumber(), is("I"));
    }
}