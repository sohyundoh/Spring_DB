package com.jdbc.practice.item.config;

import com.jdbc.practice.item.repository.ItemRepository;
import com.jdbc.practice.item.repository.mybatis.ItemMapper;
import com.jdbc.practice.item.repository.mybatis.MyBatisItemRepository;
import com.jdbc.practice.item.service.ItemService;
import com.jdbc.practice.item.service.ItemServiceV1;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MyBatisConfig {
    private final ItemMapper itemMapper;
    //ItemMapper를 주입 받고 필요한 의존 관계를 만든다.
    @Bean
    public ItemService itemService() {
        return new ItemServiceV1(itemRepository());
    }
    @Bean
    public ItemRepository itemRepository() {
        return new MyBatisItemRepository(itemMapper);
    }
}