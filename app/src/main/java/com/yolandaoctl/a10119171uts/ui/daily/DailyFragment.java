package com.yolandaoctl.a10119171uts.ui.daily;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yolandaoctl.a10119171uts.R;
import java.util.ArrayList;

//Yolanda Octaviane 10119171 IF5 Rabu 4 Mei 2022
public class DailyFragment extends Fragment {

    RecyclerView recyclerViewDaily;
    ArrayList<DailyModel> dailyModel;
    RecyclerView recyclerViewFriendlist;
    ArrayList<FriendlistModel> friendlistModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_daily, container, false);

        recyclerViewDaily = root.findViewById(R.id.view_daily);
        recyclerViewDaily.setLayoutManager(new LinearLayoutManager(getContext()));

        dailyModel = new ArrayList<>();

        DailyModel daily1 = new DailyModel(R.drawable.ic_wakeup, "Wake up", "06.00 a.m");
        dailyModel.add(daily1);
        DailyModel daily2 = new DailyModel(R.drawable.ic_college, "College", "07.00 a.m - 03.00 p.m");
        dailyModel.add(daily2);
        DailyModel daily3 = new DailyModel(R.drawable.ic_games, "Play Game / piano", "04.00 p.m - 06.00 p.m ");
        dailyModel.add(daily3);
        DailyModel daily4 = new DailyModel(R.drawable.ic_study, "Study", "06.30 p.m - 07.30 p.m");
        dailyModel.add(daily4);
        DailyModel daily5 = new DailyModel(R.drawable.ic_tv, "Watch Anime / Drakor", "08.00 p.m - 10.00 p.m");
        dailyModel.add(daily5);
        DailyModel daily6 = new DailyModel(R.drawable.ic_sleep, "Sleep", "11.00 pm / 12.00 p.m");
        dailyModel.add(daily6);

        recyclerViewDaily.setAdapter(new DailyAdapter(dailyModel));

        recyclerViewFriendlist = root.findViewById(R.id.view_friendlist);
        recyclerViewFriendlist.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        friendlistModel = new ArrayList<>();

        FriendlistModel friendlist1 = new FriendlistModel(R.drawable.foto_putih, "Putih");
        friendlistModel.add(friendlist1);
        FriendlistModel friendlist2 = new FriendlistModel(R.drawable.foto_melinda, "Melinda");
        friendlistModel.add(friendlist2);
        FriendlistModel friendlist3 = new FriendlistModel(R.drawable.foto_sevira, "Sevira");
        friendlistModel.add(friendlist3);
        FriendlistModel friendlist4 = new FriendlistModel(R.drawable.foto_syifa, "Syifa");
        friendlistModel.add(friendlist4);
        FriendlistModel friendlist5 = new FriendlistModel(R.drawable.foto_rika, "Rika");
        friendlistModel.add(friendlist5);
        FriendlistModel friendlist6 = new FriendlistModel(R.drawable.foto_ghea, "Ghea");
        friendlistModel.add(friendlist6);
        FriendlistModel friendlist7 = new FriendlistModel(R.drawable.foto_afifah, "Afifah");
        friendlistModel.add(friendlist7);
        FriendlistModel friendlist8 = new FriendlistModel(R.drawable.foto_aul, "Mya");
        friendlistModel.add(friendlist8);
        FriendlistModel friendlist9 = new FriendlistModel(R.drawable.foto_angga, "Angga");
        friendlistModel.add(friendlist9);

        recyclerViewFriendlist.setAdapter(new FriendlistAdapter(friendlistModel));

        return root;
    }
}