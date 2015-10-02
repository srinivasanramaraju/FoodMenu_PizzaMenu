package sramaraj_a3.cs442.com.pizzamenu;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class PizzaDetailActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setIcon(R.mipmap.ic_launcher);

            // Check if the device is in landscape mode
            if (getResources().getConfiguration().orientation
                    == Configuration.ORIENTATION_LANDSCAPE) {
                // If the screen is now in landscape mode, we can show the
                // dialog in-line with the list so we don't need this activity.
                finish();
                return;
            }

            // Check if we have any Pizza data saved
            if (savedInstanceState == null) {

                // If not then create the DetailsFragment
                PizzaDetailFragment details = new PizzaDetailFragment();

                // Get the Bundle of key value pairs and assign them to the DetailsFragment
                details.setArguments(getIntent().getExtras());

                // Add the details Fragment
                getFragmentManager().beginTransaction().add(android.R.id.content, details).commit();
            }
        }
    }
