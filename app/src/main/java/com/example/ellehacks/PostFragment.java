package com.example.ellehacks;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class PostFragment extends Fragment {

    private ImageButton next;

    public PostFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_post, container, false);

        next = view.findViewById(R.id.next_btn);
        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                HomeActivity.fragmentManager.beginTransaction()
                        .replace(R.id.FragmentContainer, new PostEditFragment(), null)
                        .addToBackStack(null)
                        .commit();
            }

        });

        return view;
    }

}
