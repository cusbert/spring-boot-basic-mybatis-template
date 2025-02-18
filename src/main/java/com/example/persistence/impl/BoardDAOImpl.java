package com.example.persistence.impl;

import com.example.domain.BoardVO;
import com.example.persistence.BoardDAO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BoardDAOImpl implements BoardDAO {

    @Autowired
    private SqlSession session;

    private static final String NAMESPACE = "com.example.mapper.BoardMapper";

    @Override
    public void create(BoardVO vo) throws Exception {
        session.insert(NAMESPACE + ".create", vo);
    }

    @Override
    public BoardVO read(Integer bno) throws Exception {
        return session.selectOne(NAMESPACE + ".read", bno);
    }

    @Override
    public List<BoardVO> listAll() throws Exception {
        return session.selectList(NAMESPACE + ".listAll");
    }
}
