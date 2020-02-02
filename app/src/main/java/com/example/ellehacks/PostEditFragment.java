package com.example.ellehacks;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class PostEditFragment extends Fragment {

    private Button post;
    public PostEditFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_post_edit, container, false);

        post = view.findViewById(R.id.post_btn);
        post.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Posted", Toast.LENGTH_SHORT).show();
                HomeActivity.fragmentManager.beginTransaction()
                        .replace(R.id.FragmentContainer, new ProfileFragment(), null)
                        .addToBackStack(null)
                        .commit();
            }

        });

        return view;
    }

}
