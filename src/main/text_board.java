package main;

import main.Util.util;

import java.util.ArrayList;
import java.util.Scanner;

public class text_board {
    ArrayList<Board> boards = new ArrayList<>();

    util date = new util();
    int numid = 4;

    public void start() {
        Board a1 = new Board(1, "안녕하세요 반갑습니다. 자바 공부중이에요.", "a1", date.regdate());
        Board a2 = new Board(2, "자바 질문좀 할게요~", "a2", date.regdate());
        Board a3 = new Board(3, "정처기 따야되나요?", "a3", date.regdate());

        boards.add(a1);
        boards.add(a2);
        boards.add(a3);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("명령어 : ");
            String commend = sc.nextLine().trim();
            if (commend.equals("exit")) {
                System.out.print("프로그램을 종료합니다.");
                break;

            } else if (commend.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String content = sc.nextLine();

                Board article = new Board(numid, title, content,date.regdate());
                boards.add(article);
                numid++;
                System.out.println("게시물이 등록되었습니다.");
            } else if (commend.equals("list")) {
                getArticlelist(boards);
            } else if (commend.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int num = Integer.parseInt(sc.nextLine());
                Board board4 = getArticleid(num);
                if (board4 == null) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    System.out.print("제목 : ");
                    String newtitle = sc.nextLine();
                    System.out.print("내용 : ");
                    String newcontent = sc.nextLine();

                    Board newboard = new Board(num, newtitle, newcontent);

                    boards.set(num - 1, newboard);
                    System.out.printf("%d번 게시물이 수정되었습니다.\n", num);
                }
            } else if (commend.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int num = Integer.parseInt(sc.nextLine());
                Board article5 = getArticleid(num);
                if(article5 == null) {
                    System.out.println("없는 게시물 번호입니다.");
                }else{
                    boards.remove(article5);
                    System.out.printf("%d번 게시물이 삭제되었습니다.\n", num);
                }
            } else if (commend.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요. : ");
                int num = Integer.parseInt(sc.nextLine());
                Board article6 = getArticleid(num);
                if (article6 == null) {
                    System.out.println("존재하지 않는 게시물 번호입니다.");
                } else {
                    getArticledetail(article6);
                }
            }
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

    public void getArticledetail(Board board) {
        System.out.println("==================");
        System.out.printf("번호 : %d\n", board.getNumid());
        System.out.printf("제목 : %s\n", board.getTitle());
        System.out.printf("내용 : %s\n", board.getContent());
        System.out.printf("등록날짜 : %s\n", board.getDate());
        System.out.println("==================");
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


}
