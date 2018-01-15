package com.sample.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Sample {

    public static void main(String[] args) {
        List.of(1, 2, 3, 4, 5).stream().takeWhile(i -> i != 3).forEach(System.out::println);
        List.of(1, 2, 3, 4, 5).stream().dropWhile(i -> i != 3).forEach(System.out::println);
        List.of(1, 2, 3, 4, 5).stream().dropWhile(i -> i != 5).forEach(System.out::println);

        // 順序付けられていないストリームを扱うときは出力結果が変わるので注意が必要
        Set.of(1, 2, 3, 4, 5).stream().dropWhile(i -> i != 3).forEach(System.out::println);

        // 0
        Stream.ofNullable(null).count();
        // 1
        Stream.ofNullable("Foo").count();
        
        // ストリームでfor文と同じことができる
        Stream.iterate(0, i -> i < 5, i -> i + 1).forEach(System.out::println);
    }
}
