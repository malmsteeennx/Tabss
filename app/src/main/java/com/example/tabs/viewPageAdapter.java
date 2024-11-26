package com.example.tabs;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class viewPageAdapter extends FragmentStateAdapter {
    public viewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new TCUFragment();
        } else if (position == 1) {
            return new CICTFragment();
        } else if (position == 2) {
            return new MyProfileFragment();
        }
        return new TCUFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
