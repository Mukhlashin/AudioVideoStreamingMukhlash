package com.example.audiovideostreamingmukhlash.Adapter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.audiovideostreamingmukhlash.R;
import com.example.audiovideostreamingmukhlash.ViewHolder.RadioViewHolder;

public class RadioAdapter extends RecyclerView.Adapter<RadioViewHolder> {

    Context context;

    String[] namaRadio = {"Radio Rodja", "Radio Rodja", "Radio Rodja", "Radio Rodja", "Radio Rodja", "Radio Rodja", "Radio Rodja", "Radio Rodja", "Radio Rodja", "Radio Rodja", "Radio Rodja", "Radio Rodja"};
    int[] gambarRadio = {R.drawable.rodja, R.drawable.rodja, R.drawable.rodja, R.drawable.rodja, R.drawable.rodja, R.drawable.rodja, R.drawable.rodja, R.drawable.rodja, R.drawable.rodja, R.drawable.rodja, R.drawable.rodja, R.drawable.rodja, };
    String[] urlRadio = {"http://live2.radiorodja.com/;stream.mp3", "http://146.71.85.109:5940/;stream.mp3" };

    public RadioAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RadioViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.radio_adapter, null);
        return new RadioViewHolder(v, context);
    }

    @Override
    public void onBindViewHolder(@NonNull RadioViewHolder radioViewHolder, int i) {
        radioViewHolder.tvRadio.setText(namaRadio[i]);
        radioViewHolder.imgRadio.setImageResource(gambarRadio[i]);
    }

    @Override
    public int getItemCount() {
        return namaRadio.length;
    }
}
