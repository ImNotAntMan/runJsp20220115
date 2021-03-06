package com.shopadmin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopadmin.mapper.Board2Mapper;
import com.shopadmin.myapp.Board2VO;
import com.shopadmin.myapp.PageDTO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class Board2ServiceImpl implements Board2Service {
	
	@Setter(onMethod_ = @Autowired)
	private Board2Mapper mapper;
	
	@Override
	public Board2VO read(Board2VO board) {
		return mapper.read(board);
	}
	
	@Override
	public Board2VO read(int b_num) {
		return mapper.read(b_num);
	}
	
	@Override
	public void insert(Board2VO board) {
		mapper.insert(board);
	}
	
	@Override
	public List<Board2VO> getList(PageDTO page) {
		return mapper.getList(page);
	}
	
	@Override
	public void update(Board2VO board) {
		mapper.update(board);
	}
	
	@Override
	public void delete(Board2VO board) {
		mapper.delete(board);
	}
	
	@Override
	public int getTotalCount() {
		return mapper.getTotalCount();
	}

}
