package com.example.audiovideostreamingmukhlash.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.audiovideostreamingmukhlash.Adapter.RadioAdapter;
import com.example.audiovideostreamingmukhlash.Adapter.VideoAdapter;
import com.example.audiovideostreamingmukhlash.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideoFragment extends Fragment {

    RecyclerView rvVideo;
    VideoAdapter adapter;

    public VideoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View layout = inflater.inflate(R.layout.fragment_video, container, false);
        rvVideo = layout.findViewById(R.id.rv_radio);
        adapter = new VideoAdapter(getActivity());
        rvVideo.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false));
        rvVideo.setAdapter(adapter);
        return layout;
    }

}
