package com.example.ellehacks;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public ImageButton heart1;
    public ImageButton heart2;
    public String red = "#FA5151";

    private TextView likes_1;
    private TextView likes_2;

    private ImageButton chat_icon;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.home_fragment, container, false);
        View view = inflater.inflate(R.layout.home_fragment, container, false);


        heart1 = view.findViewById(R.id.heart_btn);
        likes_1 = view.findViewById(R.id.like_num_tv);
        heart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                heart1.setColorFilter(Color.parseColor(red));
                likes_1.setText("124");
            }
        });

        heart2 = view.findViewById(R.id.heart_btn2);
        likes_2 = view.findViewById(R.id.like_num_tv2);
        heart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                heart2.setColorFilter(Color.parseColor(red));
                likes_2.setText("49");
            }
        });

        //changing fragment to profile of clotho once their username is clicked
        TextView clotho = view.findViewById(R.id.post_username3);
        clotho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                HomeActivity.fragmentManager.beginTransaction()
                        .replace(R.id.FragmentContainer, new ShopProfileFragment(), null)
                        .addToBackStack(null)
                        .commit();
            }

        });

        chat_icon = view.findViewById(R.id.profile_btn2);
        chat_icon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                HomeActivity.fragmentManager.beginTransaction()
                        .replace(R.id.FragmentContainer, new ChatFragment(), null)
                        .addToBackStack(null)
                        .commit();
            }

        });



        return view;




    }

}
