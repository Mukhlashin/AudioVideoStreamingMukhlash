package com.example.audiovideostreamingmukhlash.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import com.example.audiovideostreamingmukhlash.Adapter.RadioAdapter;
import com.example.audiovideostreamingmukhlash.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class RadioFragment extends Fragment {

    RecyclerView rvRadio;
    RadioAdapter adapter;

    public RadioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View layout = inflater.inflate(R.layout.fragment_radio, container, false);
        rvRadio = layout.findViewById(R.id.rv_radio);
        adapter = new RadioAdapter(getActivity());
        rvRadio.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false));
        rvRadio.setAdapter(adapter);
        return layout;
    }
}
