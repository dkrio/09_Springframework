package com.ohgiraffers.entitymanager;

import com.ohgiraffers.section01.entitymanager.EntityManagerFactoryGenerator;
import com.ohgiraffers.section01.entitymanager.EntityManagerGenerator;
import com.ohgiraffers.section02.crud.EntityManagerCRUD;
import com.ohgiraffers.section02.crud.Menu;
import com.sun.jdi.connect.Connector;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EntityManagerFactoryGeneratorTest {

    @Test
    @DisplayName("엔터티 매니저 팩토리 생성 확인")
    void testGenerateEntityManagerFactory() {

        // when
        EntityManagerFactory factory = EntityManagerFactoryGenerator.getInstance();

        // then
        assertNotNull(factory);
    }

    @Test
    @DisplayName("엔터티 매니저 팩토리 싱글톤 인스턴스 확인")
    void testEntityManagerFactorySingleton() {

        // when
        EntityManagerFactory factory1 = EntityManagerFactoryGenerator.getInstance();
        EntityManagerFactory factory2 = EntityManagerFactoryGenerator.getInstance();

        // then
        assertEquals(factory1, factory2);
        assertEquals(factory1.hashCode(), factory2.hashCode());
    }

    @Test
    @DisplayName("엔터티 매니저 생성 확인")
    void testGenerateEntityManager() {

        // when
        EntityManager entityManager = EntityManagerGenerator.getInstance();

        // then
        assertNotNull(entityManager);
    }

    @Test
    @DisplayName("엔터티 매니저 스코프 확인")
    void testEntityManagerScope() {
        // when
        EntityManager entityManager1 = EntityManagerGenerator.getInstance();
        EntityManager entityManager2 = EntityManagerGenerator.getInstance();

        // then
        assertNotEquals(entityManager1, entityManager2);
        assertNotEquals(entityManager1.hashCode(), entityManager2.hashCode());
    }
}