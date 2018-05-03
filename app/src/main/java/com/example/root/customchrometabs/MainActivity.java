package com.example.root.customchrometabs;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsIntent.Builder;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String url = "https://www.fitbit.com/oauth2/authorize?response_type=token&client_id=22CS3R&redirect_uri=http%3A%2F%2Fchromecustomtabs.com&scope=activity%20heartrate%20location%20nutrition%20profile%20settings%20sleep%20social%20weight&expires_in=604800";
    CustomTabsIntent customTabsIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getFitbitOAuthToken();

        Builder builder = new Builder();
        builder.setToolbarColor(Color.CYAN);
        customTabsIntent = builder.build();
    }

    public void openGoogle(View view) {
        customTabsIntent.launchUrl(getApplicationContext(), Uri.parse(url));
    }
}
