package com.example.demo.service;

import com.example.demo.entity.Board;
import com.example.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardRepository boardRepo;

    @Override
    public List<Board> list() throws Exception {
        return boardRepo.list();
    }

    @Override
    public void register(Board board) throws Exception {

    }
}
