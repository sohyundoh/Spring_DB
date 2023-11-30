package com.jdbc.practice.item.repository;

import com.jdbc.practice.item.domain.Item;
import com.jdbc.practice.item.service.ItemSearchCond;

import java.util.Optional;
import java.util.List;


public interface ItemRepository {

    Item save(Item item);
    void update(Long itemId, ItemUpdateDto updateParam);
    Optional<Item> findById(Long id);
    List<Item> findAll(ItemSearchCond cond);

}
