/* Copyright (c) 2018 ZUM Internet, Inc.
 * All right reserved.
 * http://www.zum.com
 * This software is the confidential and proprietary information of ZUM
 * , Inc. You shall not disclose such Confidential Information and
 * shall use it only in accordance with the terms of the license agreement
 * you entered into with ZUM.
 *
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-01-18
 */
package com.dotori.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LottoFactory {
    private static final List<Integer> lottoBalls = new ArrayList<>();

    static {
        for(Integer i = 1 ; i <= 45; i ++) {
            lottoBalls.add(i);
        }
    }

    public List<Integer> getLottoBalls() {
        Collections.shuffle(lottoBalls);
        return lottoBalls.stream()
                .limit(6)
                .collect(Collectors.toList());
    }
}