package com.jdbc.practice.item.repository.mybatis;

import com.jdbc.practice.item.domain.Item;
import com.jdbc.practice.item.repository.ItemUpdateDto;
import com.jdbc.practice.item.service.ItemSearchCond;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;
@Mapper
public interface ItemMapper {
    void save(Item item);
    void update(@Param("id") Long id, @Param("updateParam") ItemUpdateDto
            updateParam);
    Optional<Item> findById(Long id);
    List<Item> findAll(ItemSearchCond itemSearch);
}
