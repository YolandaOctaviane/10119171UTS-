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

        recyclerViewDaily = root.findViewById(R.id.recview_daily);
        recyclerViewDaily.setLayoutManager(new LinearLayoutManager(getContext()));

        dailyModel = new ArrayList<>();

        DailyModel daily1 = new DailyModel(R.drawable.ic_baseline_people_alt_24, "Wake up", "06.00 a.m");
        dailyModel.add(daily1);
        DailyModel daily2 = new DailyModel(R.drawable.ic_baseline_people_alt_24, "Lecture", "07.00 a.m - 03.00 p.m");
        dailyModel.add(daily2);
        DailyModel daily3 = new DailyModel(R.drawable.ic_baseline_people_alt_24, "Play Game / piano", "04.00 p.m - 06.00 p.m ");
        dailyModel.add(daily3);
        DailyModel daily4 = new DailyModel(R.drawable.ic_baseline_people_alt_24, "Study", "06.30 p.m - 07.30 p.m");
        dailyModel.add(daily4);
        DailyModel daily5 = new DailyModel(R.drawable.ic_baseline_people_alt_24, "Watch Anime / Drakor", "08.00 p.m - 10.00 p.m");
        dailyModel.add(daily5);
        DailyModel daily6 = new DailyModel(R.drawable.ic_baseline_people_alt_24, "Sleep", "11.00 pm / 12.00 p.m");
        dailyModel.add(daily6);

        recyclerViewDaily.setAdapter(new DailyAdapter(dailyModel));

        recyclerViewFriendlist = root.findViewById(R.id.recview_friendlist);
        recyclerViewFriendlist.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        friendlistModel = new ArrayList<>();

        FriendlistModel friendlist1 = new FriendlistModel(R.drawable.foto_yolan, "Putih");
        friendlistModel.add(friendlist1);
        FriendlistModel friendlist2 = new FriendlistModel(R.drawable.foto_yolan, "Melinda");
        friendlistModel.add(friendlist2);
        FriendlistModel friendlist3 = new FriendlistModel(R.drawable.foto_yolan, "Sevira");
        friendlistModel.add(friendlist3);
        FriendlistModel friendlist4 = new FriendlistModel(R.drawable.foto_yolan, "Syifa");
        friendlistModel.add(friendlist4);
        FriendlistModel friendlist5 = new FriendlistModel(R.drawable.foto_yolan, "Rika");
        friendlistModel.add(friendlist5);
        FriendlistModel friendlist6 = new FriendlistModel(R.drawable.foto_yolan, "Ghea");
        friendlistModel.add(friendlist6);

        recyclerViewFriendlist.setAdapter(new FriendlistAdapter(friendlistModel));

        return root;
    }
}