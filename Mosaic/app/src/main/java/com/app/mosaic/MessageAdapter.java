package com.app.mosaic;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.mosaic.Models.Message;
import com.app.mosaic.interfaces.OnAddToCartListener;
import com.bumptech.glide.Glide;

import java.util.List;

import okhttp3.internal.http2.Http2Connection;

public class MessageAdapter extends BaseAdapter {

    private List<Message> messages;
    private LayoutInflater inflater;
    private OnAddToCartListener onAddToCartListener;

    public MessageAdapter(Context context, List<Message> messages, OnAddToCartListener onAddToCartListener) {
        this.messages = messages;
        this.inflater = LayoutInflater.from(context);
        this.onAddToCartListener = onAddToCartListener;
    }

    @Override
    public int getCount() {
        return messages.size();
    }

    @Override
    public Object getItem(int position) {
        return messages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return messages.get(position).getType();
    }

    @Override
    public int getViewTypeCount() {
        return 2; // Out messages and response messages
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int viewType = getItemViewType(position);

        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            switch (viewType) {
                case Message.TYPE_OUT:
                    convertView = inflater.inflate(R.layout.widget_out_message, parent, false);
                    holder.messageText = convertView.findViewById(R.id.out_message_text);
                    holder.messageTime = convertView.findViewById(R.id.out_message_time);
                    break;
                case Message.TYPE_RESPONSE:
                    convertView = inflater.inflate(R.layout.widget_in_message, parent, false);
                    holder.messageText = convertView.findViewById(R.id.response_message_text);
                    holder.messageTime = convertView.findViewById(R.id.response_message_time);
                    holder.messageImage = convertView.findViewById(R.id.in_message_image);
                    break;
            }
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Message message = messages.get(position);
        holder.messageText.setText(message.getDetails());
        holder.messageTime.setText(message.getTime());
        if(viewType == Message.TYPE_RESPONSE) {
            // get image url if exists
            if(message.getImageUrl() != null) {
                holder.messageImage.setVisibility(View.VISIBLE);
                Glide.with(convertView).load(message.getImageUrl()).into(holder.messageImage);
            } else {
                holder.messageImage.setVisibility(View.GONE);
            }

            // handle on click listener for image
            holder.messageImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onAddToCartListener.onAddToCart(message);
                    // handle image click
                }
            });
        }

        return convertView;
    }

    private static class ViewHolder {
        TextView messageText;
        TextView messageTime;
        ImageView messageImage;
    }
}

