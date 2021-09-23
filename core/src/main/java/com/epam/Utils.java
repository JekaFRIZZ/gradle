package com.epam;

import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        if(str == null || str.length == 0) {
            return false;
        }
        for(String currentString :str) {
            if(!StringUtils.isPositiveNumber(currentString)) {
                return false;
            }
        }
        return true ;
    }
}
