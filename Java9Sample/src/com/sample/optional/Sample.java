package com.sample.optional;

import java.util.Optional;

public class Sample {

    public static void main(String[] args) {
        Optional<String> foo = Optional.of("Foo");
        Optional<Object> bar = Optional.ofNullable(null);

        // ifPresent
        // Foo が出力される
        foo.ifPresent(System.out::println);
        // 何も出力されない
        bar.ifPresent(System.out::println);

        // ifPresentOrElse
        // Foo が出力される
        foo.ifPresentOrElse(System.out::println, () -> System.out.println("Bar"));
        // Bar が出力される
        bar.ifPresentOrElse(System.out::println, () -> System.out.println("Bar"));

        // or
        foo.or(() -> Optional.of("Bar")).ifPresent(System.out::println);
        bar.or(() -> Optional.of("Bar")).ifPresent(System.out::println);

        // stream
        long count2 = foo.stream().count();
        System.out.println(count2);
        long count = bar.stream().count();
        System.out.println(count);
    }
}
