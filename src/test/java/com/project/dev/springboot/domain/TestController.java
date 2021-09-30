package com.project.dev.springboot.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TestController {

    @Test
    public static void main(String[] args) {
        Board board = new Board();
        board.setBoardNo(1);
        Board board1 = new Board();
        board1.setBoardNo(2);

        List<Board> list = new ArrayList<>();
        list.add(board);
        list.add(board1);

        ObjectMapper mapper = new ObjectMapper();
        String jsonList = "";

        try {
            jsonList = mapper.writeValueAsString(list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(jsonList);
    }
}
