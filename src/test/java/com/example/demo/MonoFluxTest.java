package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.w3c.dom.ls.LSOutput;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootTest
public class MonoFluxTest {
    @Test
    public void testMono() {
        Mono<?> monoString1 = Mono.just("javatechie")
                .then(Mono.error(new RuntimeException(("Exception ocured"))))
                .log();
        Mono<?> monoString2 = Mono.just("im am the techie")
                .then(Mono.error(new RuntimeException(("Exception ocured"))))
                .log();
        Mono<?> monoString3 = Mono.just("im am no a good techie :'(")
                .then(Mono.error(new RuntimeException(("Exception ocured"))))
                .log();
        monoString1.subscribe(System.out::println, System.out::println);
        monoString2.subscribe(System.out::println, System.out::println);
        monoString3.subscribe(System.out::println, System.out::println);
    }

    @Test
    public void testFlux() {
        Flux<String> fluxString =  Flux.just("Spring","Spring-Boot","Hibernate","Microservice")
                .concatWithValues("AWS")
                .concatWithValues(String.valueOf(Flux.error(new RuntimeException(("Exception ocured")))))
                .concatWithValues("Cloud")
                .log();
        fluxString.subscribe(System.out::println, System.out::println);
    }
}
