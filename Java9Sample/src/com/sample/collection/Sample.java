package com.sample.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Sample {

    public static void main(String[] args) {
        List.of(1, 2, 3);
        // nullを含むとエラー
        List.of(1, null);

        // keyとvalueを交互に指定
        Map.of("foo", 1, "bar", 2);
        // キーが重複するとエラー
        Map.of("foo", 1, "bar", 2, "bar", 3);
        // valueにnullはエラー
        Map.of("foo", null);
        // keyにnullはエラー
        Map.of("foo", 1, null, 2);

        Set.of(1, 2, 3);
        // 重複はエラー
        Set.of(1, 1);
        // nullを含むとエラー
        Set.of(1, null);
    }

}
