package main;

public class Board {
    private String title;
    private String content;
    private int numid;

    private String date;

    Board(int numid, String title, String content ){
        this.numid = numid;
        this.title = title;
        this.content = content;
    }

    Board(int numid, String title, String content, String date){
        this.numid = numid;
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNumid() {
        return numid;
    }

    public void setNumid(int numid) {
        this.numid = numid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
