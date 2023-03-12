package ru.home.chernyadieva.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.home.chernyadieva.springbootproject.model.Item;
import ru.home.chernyadieva.springbootproject.model.Person;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

    List<Item> findByItemName(String itemName);

    //person.getItem()
    List<Item> findByOwner(Person owner);


}
