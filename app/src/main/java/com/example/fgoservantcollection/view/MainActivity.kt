package com.example.fgoservantcollection.view

import com.google.firebase.analytics.FirebaseAnalytics
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fgoservantcollection.BuildConfig.APPLICATION_ID
import com.example.fgoservantcollection.R
import com.google.android.gms.ads.MobileAds
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase

private lateinit var firebaseAnalytics: FirebaseAnalytics

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Obtain the FirebaseAnalytics instance.
        firebaseAnalytics = Firebase.analytics;
        firebaseAnalytics.logEvent("EVENTO_TESTE", null);

        MobileAds.initialize(this, "ca-app-pub-3747675872720963~8821603075");
    }
}