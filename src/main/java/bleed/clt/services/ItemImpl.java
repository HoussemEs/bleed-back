package bleed.clt.services;

import bleed.clt.entities.*;
import bleed.clt.interfaces.ICartService;
import bleed.clt.interfaces.IItemService;
import bleed.clt.repositories.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
@Slf4j
public class ItemImpl implements IItemService {
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Boolean deleteItem(Long idItem) {
        return null;
    }

    @Override
    public Item getItem(Long idItem) {
        return itemRepository.findById(idItem).orElse(null);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}
