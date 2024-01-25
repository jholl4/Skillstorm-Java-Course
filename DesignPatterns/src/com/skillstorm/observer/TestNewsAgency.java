package com.skillstorm.observer;

public class TestNewsAgency {
    public static void main(String[] args) {
        NewsAgency skillstormNews = new NewsAgency();
        DigitalSubscriber ds1 = new DigitalSubscriber();
        DigitalSubscriber ds2 = new DigitalSubscriber();
        DigitalSubscriber ds3 = new DigitalSubscriber();
        DigitalSubscriber ds4 = new DigitalSubscriber();
        skillstormNews.subscribe(ds1);
        skillstormNews.subscribe(ds2);
        skillstormNews.subscribe(ds3);
        skillstormNews.subscribe(ds4);

        skillstormNews.setNews("Top notch Java technology presenters at 1pm EST today!");

        skillstormNews.unsubscribe(ds3);
        skillstormNews.unsubscribe(ds4);

        skillstormNews.setNews("I'm not wearing any pants, film at 11");

    }
}
