package at.htldornbirn._4cWI2024.swp.observer;

public class Newschannel {
    private String name;

    public Newschannel(String name) {
        this.name = name;
    }

    public void receiveNews(String news) {
        System.out.println(name + " received news: " + news);
    }

    @Override
    public String toString() {
        return this.name;
    }
}