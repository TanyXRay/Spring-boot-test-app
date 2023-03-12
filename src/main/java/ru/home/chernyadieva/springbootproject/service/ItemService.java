package ru.home.chernyadieva.springbootproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.home.chernyadieva.springbootproject.model.Item;
import ru.home.chernyadieva.springbootproject.model.Person;
import ru.home.chernyadieva.springbootproject.repository.ItemRepository;

import java.util.List;

@Transactional(readOnly = true)
@Service
public class ItemService {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> findByItemName(String itemName) {
        return itemRepository.findByItemName(itemName);
    }

    public List<Item> findByOwner(Person owner) {
        return itemRepository.findByOwner(owner);
    }
}
