//package com.httpRequest;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//import javax.lang.model.util.Elements;
//import java.io.IOException;
//
//public class JavaDocLink {
//    public static  void main(String[] args) {
//        try {
//            String path =
//                    "https://docs.oracle.com/en/java/javase/12";
//            Document doc = Jsoup.connect(path).get();
//            Elements topics = docs.select("ul.topics");
//            for (Element topic : topics) {
//                for (Element listItem : topic.chldren()) {
//                    for (Element link : listItem.children()) {
//                        String url = link.attr("href");
//                        String text = link.text();
//                        System.out.println(url + " " + text);
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
