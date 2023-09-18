package main.Controller;

import main.Util.util;

import java.util.ArrayList;

public class Controller2 {

    ArrayList<Board> boards = new ArrayList<>();

    util date = new util();

    int numid = 4;

    public Controller2(){
        Board a1 = new Board(1, "안녕하세요 반갑습니다. 자바 공부중이에요.", "a1", date.regdate());
        Board a2 = new Board(2, "자바 질문좀 할게요~", "a2", date.regdate());
        Board a3 = new Board(3, "정처기 따야되나요?", "a3", date.regdate());

        boards.add(a1);
        boards.add(a2);
        boards.add(a3);
    }

    public void insert(String title, String content){
        Board article = new Board(numid, title, content, date.regdate());
        boards.add(article);
        numid++;
    }

    public void delete(Board article5){
        boards.remove(article5);
    }
    public ArrayList<Board> allList(){
        return boards;
    }

    public void getArticlelist(ArrayList<Board> boards) {
        for (int i = 0; i < boards.size(); i++) {
            Board article2 = boards.get(i);
            System.out.println("==================");
            System.out.printf("번호 : %d\n", article2.getNumid());
            System.out.printf("제목 : %s\n", article2.getTitle());
            System.out.println("==================");
        }
    }

    public Board getArticleid(int num) {
        Board article = null;
        for (int i = 0; i < boards.size(); i++) {
            Board article5 = boards.get(i);
            if (num == article5.getNumid()) {
                return article5;
            }
        }
        return article;
    }

}
