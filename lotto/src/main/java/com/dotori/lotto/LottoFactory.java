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