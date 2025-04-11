package com.javaBootCamp.streams_section26;

import java.util.stream.Stream;

public class StreamsourceChallenge {
    public static void main(String[] args) {

        int seed = 1;
        Stream<String> streamB = Stream.iterate(seed, i -> i + 1)
                .limit(15)
                .map(i -> "B" + i);

//        streamB.forEach(System.out::println);

    }
}
