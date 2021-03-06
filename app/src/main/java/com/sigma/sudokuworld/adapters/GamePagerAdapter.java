package com.sigma.sudokuworld.adapters;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import com.sigma.sudokuworld.GamePageFragment;
import com.sigma.sudokuworld.persistence.db.entities.Game;
import com.sigma.sudokuworld.persistence.sharedpreferences.KeyConstants;

import java.util.LinkedList;
import java.util.List;

public class GamePagerAdapter extends FragmentStatePagerAdapter {   //TODO turn into a view pager
    private List<Game> mGames;

    public GamePagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        mGames = new LinkedList<>();
    }

    @Override
    public Fragment getItem(int position) {
        GamePageFragment fragment = new GamePageFragment();

        Bundle args = new Bundle();
        args.putBooleanArray(KeyConstants.LOCKED_CELLS_KEY, mGames.get(position).getLockedCells());
        args.putString(KeyConstants.DIFFICULTY_KEY, mGames.get(position).getDifficulty().toString());
        args.putString(KeyConstants.MODE_KEY, mGames.get(position).getGameMode().toString());
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public int getCount() {
        return mGames.size();
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return PagerAdapter.POSITION_NONE;
    }

    public void setItems(List<Game> games) {
        mGames = games;
        notifyDataSetChanged();
    }
}
