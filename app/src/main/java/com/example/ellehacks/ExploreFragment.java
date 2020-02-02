package com.example.ellehacks;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreFragment extends Fragment {



    private ImageButton like;
    private ImageButton dislike;

    public ExploreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_explore, container, false);


        like = view.findViewById(R.id.heart_btn);
        like.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                HomeActivity.fragmentManager.beginTransaction()
                        .replace(R.id.FragmentContainer, new ExploreLikeFragment(), null)
                        .addToBackStack(null)
                        .commit();
                like.setColorFilter(Color.parseColor("#FA5151"));
            }
        });

        dislike = view.findViewById(R.id.heart2_btn);
        dislike.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                HomeActivity.fragmentManager.beginTransaction()
                        .replace(R.id.FragmentContainer, new ExploreDislikeFragment(), null)
                        .addToBackStack(null)
                        .commit();
                dislike.setColorFilter(Color.parseColor("#C7A8CB"));
            }
        });


        return view;
    }

}
