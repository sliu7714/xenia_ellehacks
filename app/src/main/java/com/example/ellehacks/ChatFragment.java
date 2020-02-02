package com.example.ellehacks;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChatFragment extends Fragment {

    public TextView chat1;
    public TextView chat2;


    public ChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        chat1 = view.findViewById(R.id.text1);
        chat2 = view.findViewById(R.id.text2);
        chat1.setBackgroundColor(Color.parseColor("#E8E8E8"));
        chat2.setBackgroundColor(Color.parseColor("#E8E8E8"));
        return view;
    }

}
