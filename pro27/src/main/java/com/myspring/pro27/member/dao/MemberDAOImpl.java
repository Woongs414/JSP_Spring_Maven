package com.myspring.pro27.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myspring.pro27.member.vo.MemberVO;


@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO{
	@Autowired //?ïÑ?ûò?ùò setÍµ¨Î¨∏?ùÑ ?ï†?Ñà?Öå?ù¥?Öò?úºÎ°? ???ã†?ï†?àò?ûà?ã§.
	private SqlSession sqlSession;
	/* public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession; 
		*/
	
	@Override
	public List selectAllMemberList() throws DataAccessException{
		List<MemberVO> membersList = null;
		membersList = sqlSession.selectList("mapper.member.selectAllMemberList");
		return membersList;
		
	}
	
	@Override
	public int insertMember(MemberVO memberVO) throws DataAccessException{
		int result=sqlSession.insert("mapper.member.insertMember",memberVO);
		return result;
	}
	
	@Override
	public int deleteMember(String id) throws DataAccessException{
		int result = sqlSession.delete("mapper.member.deleteMember",id);
		return result;
	}
	

}
