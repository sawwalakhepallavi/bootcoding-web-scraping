package com.bootcoding;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WebScrap {
    public static void main(String[] args) throws IOException {
        String url="https://www.w3resource.com/c-programming-exercises/";
        URL obj=new URL(url);
        HttpURLConnection con=(HttpURLConnection) obj.openConnection();
        con.setRequestProperty("User-Agent","Mozilla/5.0");
        int responseCode= con.getResponseCode();
        System.out.println("Response code: " + responseCode);
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        String html = response.toString();
        Document doc = Jsoup.parse(html);
        Elements links=doc.select("a[href]");
        for (Element link : links) {
            String href = link.attr("href");
            System.out.println(href);
        }


//        Writer writer = Files.newBufferedWriter(Paths.get("links.csv"));
//        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
    }
}
