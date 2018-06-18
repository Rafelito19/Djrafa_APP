package com.example.android.uamp.ui;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.android.uamp.R;


    import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.uamp.R;
import com.example.android.uamp.utils.ResourceHelper;

import org.w3c.dom.Text;

import java.io.IOException;
import java.util.ArrayList;

/**
     * Placeholder activity for features that are not implemented in this sample, but
     * are in the navigation drawer.
     */

    public class Local_Playlist extends BaseActivity implements MyAdapter.ListItemClickListener {

private Toast tost;
   private  ArrayList<String> songlist = new ArrayList<String>();
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_placeholder);
            initializeToolbar();
           // TextView newtext =(TextView) findViewById(R.id.textfortest);


           songlist = Android_fileTarray.ReadFile(this,"songs.txt");

         //  newtext.setText(songlist.get(0));
           // mytext.setText("hello world");


            //SETUP RECYCLER
            RecyclerView rv= (RecyclerView) findViewById(R.id.rv);
            rv.setLayoutManager(new LinearLayoutManager(this));

            //FILL LIST


            //adapter
            MyAdapter adapter=new MyAdapter(this,songlist, (MyAdapter.ListItemClickListener) this);
            rv.setAdapter(adapter);










        }

    @Override
    public void onListItemClick(int clickedItemIndex) {
        String msg= "Playing "+songlist.get(clickedItemIndex);
        tost= Toast.makeText(this , msg,Toast.LENGTH_LONG);



        String url = "http://music.djloboapp.com/music/"+songlist.get(clickedItemIndex)+".mp3"; // your URL here
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);


      try {
          mediaPlayer.setDataSource(url);
          mediaPlayer.prepare(); // might take long! (for buffering, etc)
          mediaPlayer.start();
      }

    catch (IOException e) {
          e.printStackTrace();
          tost=Toast.makeText(this,"Unable to play, please check your conection and try again",Toast.LENGTH_LONG);
      }
        tost.show();
    }
}