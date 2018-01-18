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