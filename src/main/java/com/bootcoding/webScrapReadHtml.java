package com.bootcoding;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class webScrapReadHtml {
    public static void main(String[] args) {
        String url="https://www.w3resource.com/c-programming-exercises/basic-declarations-and-expressions/index.php";
        try{
            Document document= Jsoup.connect(url).get();
            System.out.println(document.outerHtml());
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
