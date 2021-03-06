package me.diegoospina.webapi.service;

import me.diegoospina.webapi.service.impl.NumberTransformService;
import me.diegoospina.webapi.vo.ResponseNumberTransform;
import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class NumberTransformServiceTest {

    private final INumberTransformService sut = new NumberTransformService();

    @Test
    public void arabicToRomanSuccess() {
        // Given
        int arabicNumber = 99;

        // When
        ResponseNumberTransform result = sut.convertArabicToRoman(arabicNumber);

        // Then

        assertThat(result, is(not(nullValue())));
        assertThat(result.getArabicNumber(), is(99));
        assertThat(result.getRomanNumber(), is("XCIX"));
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void arabicToRomanFailure() {

        // Given
        int arabicNumber = 99999;

        //When - Then
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            sut.convertArabicToRoman(arabicNumber);
        });

    }
}