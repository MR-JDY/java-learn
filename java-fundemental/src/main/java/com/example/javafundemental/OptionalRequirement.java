package com.example.javafundemental;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 避免空指针之类的东西
 */

public class OptionalRequirement {

    @Test
    void testOptional() {
        Optional<String> a = Optional.of("A");
        a.ifPresent((b) -> System.out.println(b + "B"));
        a.ifPresent(System.out::println);

        a.ifPresentOrElse((b) -> System.out.println(b + "B"), System.out::println);

        Optional<Integer> intA = Optional.of(1);
        Optional<Integer> i = intA.filter(inta -> inta > 1);
        assertThat(i).isEqualTo(Optional.empty());
        Optional<Integer> j = intA.filter(inta -> inta > 0);
        assertThat(j).isEqualTo(intA);

    }
}
