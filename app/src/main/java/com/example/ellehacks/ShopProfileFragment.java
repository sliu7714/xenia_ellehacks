package com.example.ellehacks;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShopProfileFragment extends Fragment {

    private Button follow;

    private TextView followers;

    public ShopProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_shop_profile, container, false);
        follow = view.findViewById(R.id.follow_btn);
        followers = view.findViewById(R.id.followers_num);
        follow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                follow.setText("followed");
                follow.setBackgroundColor(Color.parseColor("#F2F2F2"));
                followers.setText("6284");

            }

        });
        return view;
    }

}
