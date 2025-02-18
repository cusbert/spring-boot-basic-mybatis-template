package com.example.persistence;

import com.example.domain.BoardVO;

import java.util.List;

public interface BoardDAO {

    public void create(BoardVO vo) throws Exception;

    public BoardVO read(Integer bno) throws Exception;

    public List<BoardVO> listAll() throws Exception;
}
