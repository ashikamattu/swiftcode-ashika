package data;

public class Message {
    public FeedResponse feedResponse;
    public enum Sender {
        USER, BOT
    }
    public Sender sender ;
    public String text;
}
