package com.bootcoding;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ReadData {
    public static void main(String[] args) {
        String url="https://www.w3resource.com/c-programming-exercises/basic-declarations-and-expressions/index.php";
        try{
            Document document= Jsoup.connect(url).get();
            for(Element row:document.select("article > p")){
//                if(row.select("strong").text().equals("")){
//                    System.out.println(row.select("strong"));
//                }
                System.out.println(row);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
