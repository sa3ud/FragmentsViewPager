package com.s3bqour.fragmentviewpagerapplication;



import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.s3bqour.fragmentviewpagerapplication.fragments.DashBoardFragment;
import com.s3bqour.fragmentviewpagerapplication.fragments.HomeFragment;
import com.s3bqour.fragmentviewpagerapplication.fragments.MyAccountFragment;
import com.s3bqour.fragmentviewpagerapplication.fragments.ServiceFragment;
import com.s3bqour.fragmentviewpagerapplication.fragments.WalletFragment;

public class FragmentsViewPagerAdapter extends FragmentPagerAdapter {

    public FragmentsViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch(position){

            case 0:
                return new DashBoardFragment();

            case 1:
                return new ServiceFragment();

            case 2:
                return new WalletFragment();

                case 3:
                return new MyAccountFragment();



        }

        return new DashBoardFragment();
    }

    @Override
    public int getCount() {
        return 5;
    }
}
