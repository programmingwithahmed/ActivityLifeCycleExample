package com.abc.activitylifecycleexample

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.activitylifecycleexample.databinding.ActivityPlayQuranBinding

class PlayQuranActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlayQuranBinding

    private lateinit var mediaPlayer: MediaPlayer


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPlayQuranBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mediaPlayer = MediaPlayer.create(this, R.raw.quran)

        binding.apply {

            btnRefresh.setOnClickListener {
                mediaPlayer.seekTo(0)
                mediaPlayer.start()
            }

            btnPause.setOnClickListener {
                mediaPlayer.pause()
            }

        }


    }


    override fun onResume() {
        super.onResume()

        mediaPlayer.start()
    }

    override fun onPause() {
        super.onPause()

        mediaPlayer.pause()
    }

}