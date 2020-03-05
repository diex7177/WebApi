package me.diegoospina.webapi.service;

import me.diegoospina.webapi.vo.ResponseNumberTransform;

public interface INumberTransformService {
    /**
     * Transform arabic number to roman
     *
     * @param arabicNumber number to convert
     * @return String roman number
     */
    ResponseNumberTransform convertArabicToRoman(int arabicNumber);
}
