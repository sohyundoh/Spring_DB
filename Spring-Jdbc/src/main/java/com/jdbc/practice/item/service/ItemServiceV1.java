package com.jdbc.practice.item.service;

import com.jdbc.practice.item.domain.Item;
import com.jdbc.practice.item.repository.ItemRepository;
import com.jdbc.practice.item.repository.ItemUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceV1 implements ItemService {
    //대부분의 기능을 ItemRepository에 위임
    private final ItemRepository itemRepository;
    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }
    @Override
    public void update(Long itemId, ItemUpdateDto updateParam) {
        itemRepository.update(itemId, updateParam);
    }
    @Override
    public Optional<Item> findById(Long id) {
        return itemRepository.findById(id);
    }
    @Override
    public List<Item> findItems(ItemSearchCond cond) {
        return itemRepository.findAll(cond);
    }
}
