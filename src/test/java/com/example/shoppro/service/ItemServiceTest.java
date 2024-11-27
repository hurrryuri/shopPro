package com.example.shoppro.service;

import com.example.shoppro.dto.ItemDTO;
import com.example.shoppro.dto.PageRequestDTO;
import com.example.shoppro.dto.PageResponseDTO;
import lombok.extern.log4j.Log4j2;
import org.apache.juli.logging.Log;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Log4j2
class ItemServiceTest {

    @Autowired
    ItemService itemService;


    @Test
    @Transactional
    @Rollback(value = false)
    public void removeTest(){


        //삭제할 번호
        Long testid = 215L;
        itemService.remove(testid);




    }

    @Test
    public void listTest(){
        //이메일, pageRequestDTO
        String email = "test@a";
        PageRequestDTO pageRequestDTO
                =new PageRequestDTO();

        pageRequestDTO.setSearchDateType("6m");
        PageResponseDTO<ItemDTO> itemDTOPageResponseDTO =
                itemService.list(pageRequestDTO, email);

        itemDTOPageResponseDTO
                .getDtoList()
                .forEach(itemDTO -> log.info(itemDTO) );
    }

}