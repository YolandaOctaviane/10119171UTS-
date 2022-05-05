package com.yolandaoctl.a10119171uts.ui.favorite;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.yolandaoctl.a10119171uts.R;

import java.util.ArrayList;


public class FavoriteFragment extends Fragment {

    // views music
    RecyclerView recyclerViewMusic;
    ArrayList<FavoriteModel> favoriteModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_favorite, container, false);

        // music
        recyclerViewMusic = root.findViewById(R.id.recview_music);
        recyclerViewMusic.setLayoutManager(new LinearLayoutManager(getContext()));

        favoriteModel = new ArrayList<>();

        FavoriteModel music1 = new FavoriteModel(R.drawable.eight, "Eight", "IU ft Suga");
        favoriteModel.add(music1);
        FavoriteModel music2 = new FavoriteModel(R.drawable.enhypen, "Just a Little Bit", "Enhypen");
        favoriteModel.add(music2);
        FavoriteModel music3 = new FavoriteModel(R.drawable.into_the_iland, "Into The I-Land", "IU Version");
        favoriteModel.add(music3);
        FavoriteModel music4 = new FavoriteModel(R.drawable.bubble_eve, "Bubble", "Eve Ft Uta");
        favoriteModel.add(music4);
        FavoriteModel music5 = new FavoriteModel(R.drawable.my_last_day, "My Last Day", "ユアネス - yourness");
        favoriteModel.add(music5);
        FavoriteModel music6 = new FavoriteModel(R.drawable.fighttogether, "Fight Together", "Namie Amuro");
        favoriteModel.add(music6);
        FavoriteModel music7 = new FavoriteModel(R.drawable.newyork_bol4, "New York", "BOL4 x WH3N");
        favoriteModel.add(music7);
        FavoriteModel music8 = new FavoriteModel(R.drawable.bol4_seoul, "Seoul", "BOL4");
        favoriteModel.add(music8);
        FavoriteModel music9 = new FavoriteModel(R.drawable.ending_scene_iu, "Ending Scene", "IU");
        favoriteModel.add(music9);

        recyclerViewMusic.setAdapter(new FavoriteAdapter(favoriteModel));

        // video
        VideoView vvVideo = root.findViewById(R.id.vv_video);
        String videoPath = "android.resource://" + getContext().getPackageName() + "/" + R.raw.bubbleftutaeve;
        Uri uri = Uri.parse(videoPath);
        vvVideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(getContext());
        vvVideo.setMediaController(mediaController);
        mediaController.setAnchorView(vvVideo);

        return root;
    }
}