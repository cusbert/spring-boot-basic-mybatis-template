package com.example.persistence;

import com.example.domain.MemberVO;

public interface MemberDAO {
    public String getTime();
    public int insertMember(MemberVO memberVO);
}
