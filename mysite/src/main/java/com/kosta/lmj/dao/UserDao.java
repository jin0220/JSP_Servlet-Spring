package com.kosta.lmj.dao;

import com.kosta.lmj.vo.UserVo;

public interface UserDao {

	public UserVo getUser(int no);

	public UserVo getUser(String email, String password);

	public int insert(UserVo vo);

	public String idCheck(String email);

	public int update(UserVo vo);

}