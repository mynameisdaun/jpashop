package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.repository.ItemRepository;
import jpabook.jpashop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    /*
    * 회원 가입
    * */
    @Transactional(readOnly = false)
    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    /*
     * 모든 멤버 조회
     * */
    public List<Item> findItems() {
        return itemRepository.findAll();
    }

    /*
     * 회원 한명 조회
     * */
    public Item findOne(Long id) {
        return itemRepository.findOne(id);
    }
}
