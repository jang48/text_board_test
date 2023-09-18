package main.Util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class util {
    public String regdate(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:dd");
        String regdate = now.format(formatter);
        return regdate;
    }

}
