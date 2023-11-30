package com.jdbc.practice.item.service;

import com.jdbc.practice.item.domain.Item;
import com.jdbc.practice.item.repository.ItemUpdateDto;

import java.util.Optional;
import java.util.List;

public interface ItemService {
    Item save(Item item);
    void update(Long itemId, ItemUpdateDto updateParam);
    Optional<Item> findById(Long id);
    List<Item> findItems(ItemSearchCond itemSearch);
}
