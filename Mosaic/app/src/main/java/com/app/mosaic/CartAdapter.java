package com.app.mosaic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.mosaic.Models.Message;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CartAdapter extends BaseAdapter {
    ArrayList<Message> cartItems;
    private LayoutInflater inflater;
    public CartAdapter(Context cartActivityContext, ArrayList<Message> cartItems) {
        this.cartItems = cartItems;
        this.inflater = LayoutInflater.from(cartActivityContext);
    }
    @Override
    public int getCount() {
        return cartItems.size();
    }

    @Override
    public Object getItem(int position) {
        return cartItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CartAdapter.ViewHolder holder;
        if (convertView == null) {
            holder = new CartAdapter.ViewHolder();
            convertView = inflater.inflate(R.layout.cart_layout_single_item, parent, false);
            holder.messageText = convertView.findViewById(R.id.single_item__details);
            holder.messageImage = convertView.findViewById(R.id.single_item_image);
            convertView.setTag(holder);
        } else {
            holder = (CartAdapter.ViewHolder) convertView.getTag();
        }
        Message message = cartItems.get(position);
        holder.messageText.setText(message.getDescription());
        Glide.with(parent.getContext()).load(message.getImageUrl()).into(holder.messageImage);
        return convertView;
    }

    private static class ViewHolder {
        TextView messageText;
        ImageView messageImage;
    }
}


