package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.annotation.subsection02.qualifier.PokemonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.Format;

public class Aplication {

    public static void main(String[] args) {


        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section02");

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println("definitionName = " + definitionName);
        }

        PokemonService pokemonService = applicationContext.getBean(PokemonService.class);
        pokemonService.pokemonAttack();
    }
}
