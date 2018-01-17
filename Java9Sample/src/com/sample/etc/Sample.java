package com.sample.etc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Sample {

    public static void main(String[] args) throws FileNotFoundException {
        // 匿名クラスでジェネリクスが不要
        List<String> list = new ArrayList<>() {
            @Override
            public boolean equals(Object arg0) {
                return super.equals(arg0);
            }
        };

        // NG アンダースコア1つだけは使えなくなった
        // String _;

        // try-with-resource文
        FileInputStream is = new FileInputStream("foo");
        try (is) {
            // omit
        } catch (Exception e) {
        }

        // Java8
        try (FileInputStream is2 = new FileInputStream("foo")) {
            // omit
        } catch (Exception e) {
        }
    }

    interface Foo {

        private String bar() {
            return "bar";
        }

        private String bar(String baz) {
            return baz;
        }

        private static void qux() {
        }
    }
}
