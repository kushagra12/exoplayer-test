

package com.example.exoplayertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.StyledPlayerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimpleExoPlayer player = new SimpleExoPlayer.Builder(this).build();
        StyledPlayerView playerView = findViewById(R.id.simpleTest);
        playerView.setPlayer(player);
        MediaItem mediaItem = MediaItem.fromUri("https://dyte-uploads.s3.ap-south-1.amazonaws.com/test/vp9_sample.webm");
        player.setMediaItem(mediaItem);
        player.prepare();
        player.play();
    }
}