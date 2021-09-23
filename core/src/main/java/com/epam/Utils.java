package com.epam;

import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        for(String currentString :str) {
            if(!StringUtils.isPositiveNumber(currentString)) {
                return false;
            }
        }
        return true ;
    }
}
