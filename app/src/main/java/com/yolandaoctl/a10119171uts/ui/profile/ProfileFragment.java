package com.yolandaoctl.a10119171uts.ui.profile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yolandaoctl.a10119171uts.AboutDialog;
import com.yolandaoctl.a10119171uts.R;


//Yolanda Octaviane 10119171 IF5 Jumat 6 Mei 2022
public class ProfileFragment extends Fragment {

    ImageView Instagram, Whatsapp, Telegram, Gmail, Linkedin, Maps;
    TextView  Abouts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        Instagram = root.findViewById(R.id.instagram);
        Whatsapp = root.findViewById(R.id.whatsapp);
        Telegram = root.findViewById(R.id.telegram);
        Gmail = root.findViewById(R.id.gmail);
        Linkedin = root.findViewById(R.id.linkedin);
        Maps = root.findViewById(R.id.maps);
        Abouts = root.findViewById(R.id.about);

        Instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insta = new Intent();
                insta.setAction(Intent.ACTION_VIEW);
                insta.addCategory(Intent.CATEGORY_BROWSABLE);
                insta.setData(Uri.parse("https://www.instagram.com/yolandaoctl"));
                startActivity(insta);
            }
        });

        Whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whatsapp = new Intent();
                whatsapp.setAction(Intent.ACTION_VIEW);
                whatsapp.addCategory(Intent.CATEGORY_BROWSABLE);
                whatsapp.setData(Uri.parse("https://wa.me/6287832654450"));
                startActivity(whatsapp);
            }
        });

        Telegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telegram = new Intent();
                telegram.setAction(Intent.ACTION_VIEW);
                telegram.addCategory(Intent.CATEGORY_BROWSABLE);
                telegram.setData(Uri.parse("https://t.me/yolandaoctl"));
                startActivity(telegram);
            }
        });

        Gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gmail = new Intent();
                gmail.setAction(Intent.ACTION_VIEW);
                gmail.addCategory(Intent.CATEGORY_BROWSABLE);
                gmail.setData(Uri.parse("mailto:yolandaoctavi@gmail.com"));
                startActivity(gmail);
            }
        });

        Linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkedin = new Intent();
                linkedin.setAction(Intent.ACTION_VIEW);
                linkedin.addCategory(Intent.CATEGORY_BROWSABLE);
                linkedin.setData(Uri.parse("https://www.linkedin.com/in/yolanda-octaviane-19084a15a/"));
                startActivity(linkedin);
            }
        });

        Maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent map = new Intent();
                map.setAction(Intent.ACTION_VIEW);
                map.addCategory(Intent.CATEGORY_BROWSABLE);
                map.setData(Uri.parse("https://goo.gl/maps/WnmDn77Rfr2NMKDm7"));
                startActivity(map);
            }
        });

        Abouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AboutDialog Aboutdialog = new AboutDialog();
                Aboutdialog.show(getFragmentManager(),"AboutDialog Apps");
            }
        });

        return root;
    }
}