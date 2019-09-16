package com.example.chancharwei.android_bus.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chancharwei.android_bus.R;

public class HomeFragment extends Fragment {
    private static final String TAG = HomeFragment.class.getSimpleName()+"[ByronLog]";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG,"onCreateView");
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }
}
