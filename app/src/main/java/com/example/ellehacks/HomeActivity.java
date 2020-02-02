package com.example.ellehacks;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {


    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fragmentManager = getSupportFragmentManager();

        if (findViewById(R.id.FragmentContainer)!=null)
        {
            if (savedInstanceState != null)
            {
                return;
            }
            FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();

            HomeFragment homeFragment = new HomeFragment();

            fragmentTransaction.add(R.id.FragmentContainer, homeFragment, null).commit();
        }

        // changing fragment to schedule if calender icon on bottom bar is clicked
        ImageButton exploreButton = (ImageButton)findViewById(R.id.explore_btn);
        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity.fragmentManager.beginTransaction()
                        .replace(R.id.FragmentContainer,new ExploreFragment(), null)
                        .addToBackStack(null)
                        .commit();
//                Test
//                Toast.makeText(getApplicationContext(),"explore btn", Toast.LENGTH_SHORT).show();
            }

        });

        // changing fragment to post if plus icon on bottom bar is clicked
        ImageButton postButton = (ImageButton)findViewById(R.id.post_btn);
        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity.fragmentManager.beginTransaction()
                        .replace(R.id.FragmentContainer,new PostFragment(), null)
                        .addToBackStack(null)
                        .commit();
//                Test
//                Toast.makeText(getApplicationContext(),"post btn", Toast.LENGTH_SHORT).show();
            }

        });

        // changing fragment to user profile if profile icon on bottom bar is clicked
        ImageButton profileButton = (ImageButton)findViewById(R.id.profile_btn);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity.fragmentManager.beginTransaction()
                        .replace(R.id.FragmentContainer,new ProfileFragment(), null)
                        .addToBackStack(null)
                        .commit();
//                Test
//                Toast.makeText(getApplicationContext(),"profile btn", Toast.LENGTH_SHORT).show();
            }

        });
        // changing fragment to home if home icon on bottom bar is clicked
        ImageButton homeButton = (ImageButton)findViewById(R.id.home_btn);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity.fragmentManager.beginTransaction()
                        .replace(R.id.FragmentContainer,new HomeFragment(), null)
                        .addToBackStack(null)
                        .commit();
//                Test
//                Toast.makeText(getApplicationContext(),"home btn", Toast.LENGTH_SHORT).show();
            }

        });



    }
}
