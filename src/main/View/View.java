package main.View;

import main.Controller.Board;

import java.util.ArrayList;

public class View {
    public void getArticledetail(Board board) {
        System.out.println("==================");
        System.out.printf("번호 : %d\n", board.getNumid());
        System.out.printf("제목 : %s\n", board.getTitle());
        System.out.printf("내용 : %s\n", board.getContent());
        System.out.printf("등록날짜 : %s\n", board.getDate());
        System.out.println("==================");
    }
}
