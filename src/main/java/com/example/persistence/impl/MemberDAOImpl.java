package com.example.persistence.impl;

import com.example.domain.MemberVO;
import javax.inject.Inject;

import com.example.persistence.MemberDAO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {

    @Inject
    private SqlSession sqlSession;

    private static final String NAMESPACE = "com.example.mapper.MemberMapper"; // Mapper namespace

    @Override
    public String getTime() {
        return sqlSession.selectOne(NAMESPACE+".getTime");
    }

    @Override
    public int insertMember(MemberVO memberVO) {
        return sqlSession.insert(NAMESPACE+".insertMember", memberVO);
    }
}
