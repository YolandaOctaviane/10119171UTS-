package com.yolandaoctl.a10119171uts.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.yolandaoctl.a10119171uts.R;
import com.yolandaoctl.a10119171uts.databinding.FragmentGalleryBinding;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    // views gallery
    RecyclerView recyclerViewGallery;
    ArrayList<GalleryModel> galleryModel;
    private StaggeredGridLayoutManager manager; // image staggred

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =inflater.inflate(R.layout.fragment_gallery, container, false);

        // gallery
        recyclerViewGallery = root.findViewById(R.id.recview_gallery);
        manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL); // image staggred set vertical
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