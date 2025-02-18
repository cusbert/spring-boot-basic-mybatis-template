package com.example.persistence;

import com.example.domain.BoardVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/resources/mappers/*.xml"})
public class BoardDAOTest {

    @Autowired
    private BoardDAO dao;

    @Test
    public void testCreate() throws Exception {

        BoardVO boardVO = new BoardVO();
        boardVO.setTitle("제목");
        boardVO.setContent("내용");
        boardVO.setWriter("user01");

        dao.create(boardVO);
    }
}