package com.jdbc.practice.item.config;

import com.jdbc.practice.item.repository.ItemRepository;
import com.jdbc.practice.item.service.ItemService;
import com.jdbc.practice.item.service.ItemServiceV1;
import com.jdbc.practice.repository.jpa.JpaItemRepositoryV1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class JpaConfig {
    private final EntityManager em;
    public JpaConfig(EntityManager em) {
        this.em = em;
    }
    @Bean
    public ItemService itemService() {
        return new ItemServiceV1(itemRepository());
    }
    @Bean
    public ItemRepository itemRepository() {
        return new JpaItemRepositoryV1(em);
    }
}
