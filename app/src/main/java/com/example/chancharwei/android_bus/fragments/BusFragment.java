package com.example.chancharwei.android_bus.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chancharwei.android_bus.R;

public class BusFragment extends Fragment {
    private static final String TAG = BusFragment.class.getSimpleName()+"[ByronLog]";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG,"onCreateView");
        View root = inflater.inflate(R.layout.fragment_bus, container, false);
        return root;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}
