package com.yolandaoctl.a10119171uts.ui.daily;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yolandaoctl.a10119171uts.R;

import java.util.ArrayList;


//Yolanda Octaviane 10119171 IF5 Rabu 4 Mei 2022
public class DailyAdapter extends RecyclerView.Adapter<DailyAdapter.myviewholder> {

    ArrayList<DailyModel> dailyModel;

    public DailyAdapter(ArrayList<DailyModel> dailyModel) {
        this.dailyModel = dailyModel;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_daily, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.logoDaily.setImageResource(dailyModel.get(position).getImage());
        holder.titleDaily.setText(dailyModel.get(position).getTitle());
        holder.descDaily.setText(dailyModel.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return dailyModel.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView logoDaily;
        TextView titleDaily, descDaily;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            logoDaily = itemView.findViewById(R.id.logo_daily);
            titleDaily = itemView.findViewById(R.id.title_daily);
            descDaily = itemView.findViewById(R.id.desc_daily);
        }
    }
}