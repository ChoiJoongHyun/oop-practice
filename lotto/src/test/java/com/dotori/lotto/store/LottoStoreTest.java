package com.dotori.lotto.store;

import com.dotori.lotto.LottoTicket;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

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

public class LottoStoreTest {

    LottoStore lottoStore = new LottoStore();

    @Test
    public void 로또_구입_가능_장수() {
        Integer count = lottoStore.lottoTicketCount(20000);
        assertTrue(count == 4);
    }

    @Test
    public void 거스름돈() {
        Integer money = lottoStore.change(23000);
        assertTrue(money == 3000);
    }

    @Test
    public void 로또_자동으로_구입() {
        List<LottoTicket> tickets = lottoStore.getLottoTicket(4);
        System.out.println(tickets);
    }
}