package com.example.springbootex.dataload;

import com.example.springbootex.entity.Coffee;
import com.example.springbootex.repo.CoffeeRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/*
* Использовал @PostConstruct для начального заполнения БД:
* Создать класс с аннотацией @Component
* внедрить в него репозиторий
* создать метод с аннотацией @PostConstruct
* в методе заполнить базу используя методы репозитория
* */
@Component
@RequiredArgsConstructor
public class DataLodyr {
    private final CoffeeRepository coffeeRepository;

    @PostConstruct
    private void zamutitData(){
        coffeeRepository.saveAll(List.of(
                new Coffee("Banana"),
                new Coffee("Roma"),
                new Coffee("Miata"),
                new Coffee("Liqior")
        ));
    }
}
