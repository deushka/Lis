package comers_0890.httpsvk.lischattie;

/**
 * Created by Asus on 18.12.2017.
 */

public class Message {
    private String text;
    private String author;
    private String time;
    public Message(String text, String s, String time){
        this.text = text;
        this.author = s;
        this.time = time;
    }
    public Message(){

    }

    public String getText() {
        return text;
    }
    public String getAuthor(){
        return author;
    }
    public String getTime() {
        return time;
    }
    public void setText(String text) {
        this.text = text;
    }
}
