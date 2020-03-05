package me.diegoospina.webapi.service;

import me.diegoospina.webapi.vo.ResponseNumberTransform;

public interface INumberTransformService {
    /**
     * Transform arabic number to roman
     *
     * @param number
     * @return String roman number
     */
    ResponseNumberTransform convertArabicToRoman(int number);
}
