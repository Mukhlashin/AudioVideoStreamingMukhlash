package com.example.audiovideostreamingmukhlash.ViewHolder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.audiovideostreamingmukhlash.R;

public class RadioViewHolder extends RecyclerView.ViewHolder {

    public static ImageView imgRadio;
    public static TextView tvRadio;
    public LinearLayout lnRadio;

    public RadioViewHolder(@NonNull View itemView, Context context) {
        super(itemView);

        imgRadio = itemView.findViewById(R.id.img_radio);
        tvRadio = itemView.findViewById(R.id.tv_radio);
        lnRadio = itemView.findViewById(R.id.ln_radio);

    }
}
