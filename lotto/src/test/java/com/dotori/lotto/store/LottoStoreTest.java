package com.dotori.lotto.store;

import com.dotori.lotto.LottoTicket;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

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