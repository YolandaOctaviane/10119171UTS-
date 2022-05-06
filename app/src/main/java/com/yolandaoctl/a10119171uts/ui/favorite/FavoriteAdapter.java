package com.yolandaoctl.a10119171uts.ui.favorite;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yolandaoctl.a10119171uts.R;

import java.util.ArrayList;

public class FavoriteAdapter extends RecyclerView.Adapter<FavoriteAdapter.myviewholder> {

    ArrayList<FavoriteModel> musicModel;

    public FavoriteAdapter(ArrayList<FavoriteModel> musicModel) {
        this.musicModel = musicModel;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_favorite, parent, false);
        return new FavoriteAdapter.myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.logoMusic.setImageResource(musicModel.get(position).getImage());
        holder.titleFavorite.setText(musicModel.get(position).getTitle());
        holder.singerFavorite.setText(musicModel.get(position).getPenyanyi());
    }

    @Override
    public int getItemCount() {
        return musicModel.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView logoMusic;
        TextView titleFavorite, singerFavorite;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            logoMusic = itemView.findViewById(R.id.logo_music);
            titleFavorite = itemView.findViewById(R.id.title_favorite);
            singerFavorite = itemView.findViewById(R.id.singer_favorite);
        }
    }
}
