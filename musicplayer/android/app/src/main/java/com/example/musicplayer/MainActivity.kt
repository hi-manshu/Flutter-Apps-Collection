package com.example.musicplayer

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import io.flutter.app.FlutterActivity
import android.support.v4.content.ContextCompat
import android.support.v4.app.ActivityCompat
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity(): FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GeneratedPluginRegistrant.registerWith(this)
    }
    override fun onResume() {

        super.onResume()

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    arrayOf(Manifest.permission.RECORD_AUDIO),
                    1000)
        }
    }

}