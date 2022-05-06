package com.yolandaoctl.a10119171uts.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.yolandaoctl.a10119171uts.R;


import java.util.ArrayList;

//Yolanda Octaviane 10119171 IF5 Kamis 5 Mei 2022
public class GalleryFragment extends Fragment {


    RecyclerView recyclerViewGallery;
    ArrayList<GalleryModel> galleryModel;
    private StaggeredGridLayoutManager manager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root =inflater.inflate(R.layout.fragment_gallery, container, false);

        recyclerViewGallery = root.findViewById(R.id.view_gallery);
        manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerViewGallery.setLayoutManager(manager);

        galleryModel = new ArrayList<>();

        GalleryModel gallery1 = new GalleryModel(R.drawable.logo1);
        galleryModel.add(gallery1);
        GalleryModel gallery2 = new GalleryModel(R.drawable.logo2);
        galleryModel.add(gallery2);
        GalleryModel gallery3 = new GalleryModel(R.drawable.logo3);
        galleryModel.add(gallery3);
        GalleryModel gallery4 = new GalleryModel(R.drawable.logo1);
        galleryModel.add(gallery4);
        GalleryModel gallery5 = new GalleryModel(R.drawable.logo2);
        galleryModel.add(gallery5);
        GalleryModel gallery6 = new GalleryModel(R.drawable.logo3);
        galleryModel.add(gallery6);

        recyclerViewGallery.setAdapter(new GalleryAdapter(galleryModel));

        return root;
    }
}