package com.app.mosaic.controllers;

import android.app.Dialog;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.mosaic.Models.Message;
import com.app.mosaic.R;
import com.bumptech.glide.Glide;

public class AddToCartDialog {
    // open dialog to add item to cart
    public void openDialog(Context context, Message message) {
        // open dialog with item details and add to cart button and cancel button
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_add_to_cart);
        // set the image
        ImageView image = dialog.findViewById(R.id.dialog_add_to_cart_image);
        if(message.getImageUrl() != null) {
            Glide.with(context).load(message.getImageUrl()).into(image);
        }
        // set the message details
        TextView description = dialog.findViewById(R.id.dialog_add_to_cart_details);
        description.setText(message.getDetails());

        // handle add to cart button
        dialog.findViewById(R.id.dialog_add_to_cart_button).setOnClickListener(v -> {
            // add item to cart
            // close dialog
            dialog.dismiss();
        });

        // handle cancel button
        dialog.findViewById(R.id.dialog_add_to_cart_cancel).setOnClickListener(v -> {
            // close dialog
            dialog.dismiss();
        });

        dialog.show();
    }
}
