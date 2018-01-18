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