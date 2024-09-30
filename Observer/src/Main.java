import at.htldornbirn._4cWI2024.swp.observer.NewsAgency;
import at.htldornbirn._4cWI2024.swp.observer.Newschannel;
s//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var newsAgency = new NewsAgency("APA");
        var newschannel = new Newschannel("orf.at");

        newsAgency.registerNewsChannel(newschannel);

        System.out.println(newsAgency);
        System.out.println(newschannel);

        newsAgency.broadcastMessage("Breaking news: Observer pattern implemented successfully!");
    }
}
