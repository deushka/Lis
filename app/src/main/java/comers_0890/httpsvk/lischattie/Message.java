package comers_0890.httpsvk.lischattie;

/**
 * Created by Asus on 18.12.2017.
 */

public class Message {
    private String text;
    private String author;
    public Message(String text, String s){
        this.text = text;
        this.author = s;
    }
    public Message(){

    }

    public String getText() {
        return text;
    }
    public String getAuthor(){
        return author;
    }
    public void setText(String text) {
        this.text = text;
    }
}
