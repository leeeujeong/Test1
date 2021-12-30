package com.koreait.test1.dao;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;


import com.koreait.test1.dto.Board;


public class BoardDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public List<Object> selectBoardList(){
		return sqlSession.selectList("mapper.boardDAO.selectBoardList"); 
		}
	public int selectBoardCount() {
		return sqlSession.selectOne("mapper.boardDAO.selectBoardCount");
	}
	public int insertBoard(String writer, String title, String content) { 
		return sqlSession.insert("mapper.boardDAO.insertBoard");
	}
	public Board selectByIdx(int idx) {
		return sqlSession.selectOne("mapper.boardDAO.selectByIdx", idx);
	}
	public int updateBoard(String title, String content, int idx) {
		return sqlSession.update("mapper.boardDAO.updateBoard");
	}
	public int deleteBoard(int idx) {
		return sqlSession.delete("mapper.boardDAO.deleteBoard", idx);
	}
}
