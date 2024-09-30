package at.htldornbirn._4cWI2024.swp.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private final String name;
    private final List<Newschannel> newsChannelList;

    public NewsAgency(String name) {
        this.name = name;
        this.newsChannelList = new ArrayList<>();
    }

    public void registerNewsChannel(Newschannel newsChannel) {
        newsChannelList.add(newsChannel);
    }

    public void broadcastMessage(String message) {
        for (Newschannel channel : newsChannelList) {
            channel.receiveNews(message);
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}