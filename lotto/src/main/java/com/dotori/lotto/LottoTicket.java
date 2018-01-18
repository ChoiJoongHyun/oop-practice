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

import java.util.List;

public class LottoTicket {

    private List<Integer> lotto;

    public LottoTicket(List<Integer> lotto) {
        this.lotto = lotto;
    }

    public List<Integer> getLotto() {
        return lotto;
    }

    @Override
    public String toString() {
        return "LottoTicket{" +
                "lotto=" + lotto +
                '}';
    }
}