package com.sample.etc;

import java.util.ArrayList;
import java.util.List;

public class Sample {

    public static void main(String[] args) {
        // 匿名クラスでジェネリクスが不要
        List<String> list = new ArrayList<>() {
            @Override
            public boolean equals(Object arg0) {
                return super.equals(arg0);
            }
        };

        // NG アンダースコア1つだけは使えなくなった
        // String _;
    }
}
