package comers_0890.httpsvk.lischattie;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Asus on 18.12.2017.
 */

public class MessageAdapter extends ArrayAdapter{

    public MessageAdapter(Context context, int resource,List<Message> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_message, parent, false);
        }
        TextView messageText = (TextView) convertView.findViewById(R.id.messageTextView);
        TextView messageAuthor = (TextView) convertView.findViewById(R.id.messageTextViewAuthor);
        Message message = (Message) getItem(position);
        messageText.setText(message.getText());
        messageAuthor.setText(message.getAuthor()+" "+message.getTime());
        return convertView;
    }


}
