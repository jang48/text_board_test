package main.Module;

import main.Controller.Board;
import main.Controller.Controller2;
import main.Util.util;
import main.View.View;

import java.util.ArrayList;
import java.util.Scanner;

public class text_board {

    util date = new util();

    View view1 = new View();

    Controller2 contrl = new Controller2();

    public void start() {

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

                contrl.insert(title, content);
                System.out.println("게시물이 등록되었습니다.");

            } else if (commend.equals("list")) {
                ArrayList<Board> article = contrl.allList();
                contrl.getArticlelist(article);

            } else if (commend.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int num = Integer.parseInt(sc.nextLine());
                Board board4 = contrl.getArticleid(num);
                if (board4 == null) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    System.out.print("제목 : ");
                    String newtitle = sc.nextLine();
                    System.out.print("내용 : ");
                    String newcontent = sc.nextLine();

                    board4.setTitle(newtitle);
                    board4.setContent(newcontent);

                    System.out.printf("%d번 게시물이 수정되었습니다.\n", num);
                }

            } else if (commend.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int num = Integer.parseInt(sc.nextLine());
                Board article5 = contrl.getArticleid(num);
                if(article5 == null) {
                    System.out.println("없는 게시물 번호입니다.");
                }else{
                    contrl.delete(article5);
                    System.out.printf("%d번 게시물이 삭제되었습니다.\n", num);
                }

            } else if (commend.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요. : ");
                int num = Integer.parseInt(sc.nextLine());
                Board article6 = contrl.getArticleid(num);
                if (article6 == null) {
                    System.out.println("존재하지 않는 게시물 번호입니다.");
                } else {
                    view1.getArticledetail(article6);
                }
            } else if (commend.equals("search")){
                System.out.print("검색 키워드를 입력해주세요 : ");
                String keyword = sc.nextLine();
                contrl.getKeywordlist(keyword);
            }
        }
    }






}
