package mtWebCrawler;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<WebCrawler> bots = new ArrayList<>();
        bots.add(new WebCrawler("https://abcnews.go.com", 1));
        bots.add(new WebCrawler("https://www.nytimes.com", 2));

        for (WebCrawler w: bots) {
            try {
                w.getThread().join();
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}