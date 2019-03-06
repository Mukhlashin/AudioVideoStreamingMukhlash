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

public class VideoViewHolder extends RecyclerView.ViewHolder {

    public static ImageView imgVideo;
    public static TextView tvVideo;
    public LinearLayout lnVideo;

    public VideoViewHolder(@NonNull View itemView, Context context) {
        super(itemView);

        imgVideo = itemView.findViewById(R.id.img_video);
        tvVideo = itemView.findViewById(R.id.tv_video);
        lnVideo = itemView.findViewById(R.id.ln_video);

    }
}
