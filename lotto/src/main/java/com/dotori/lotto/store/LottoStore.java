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
package com.dotori.lotto.store;

import com.dotori.lotto.LottoFactory;
import com.dotori.lotto.LottoTicket;

import java.util.ArrayList;
import java.util.List;

public class LottoStore extends LottoFactory {

    private static final Integer LOTTO_PRICE = 5000;

    public Integer lottoTicketCount(Integer money) {
        return money / LOTTO_PRICE;
    }

    public Integer change(Integer money) {
        return money % LOTTO_PRICE;
    }

    public List<LottoTicket> getLottoTicket(Integer count) {
        List<LottoTicket> lottoTickets = new ArrayList<>();
        for(int i = 0 ; i < count ; i ++) {
            lottoTickets.add(new LottoTicket(getLottoBalls()));
        }
        return lottoTickets;
    }
}