package com.sigma.sudokuworld.persistence;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import com.sigma.sudokuworld.persistence.db.AppDatabase;
import com.sigma.sudokuworld.persistence.db.daos.GameDao;
import com.sigma.sudokuworld.persistence.db.entities.Game;

import android.support.annotation.NonNull;

import java.util.List;

public class GameRepository {
    private GameDao mGameDao;

    public GameRepository(@NonNull Application application) {
        mGameDao = AppDatabase.Companion.getInstance(application).getGameDao();
    }

    public long newGame(Game game) {

        //Auto value save id
        game.setSaveID(0);

        return mGameDao.insert(game);
    }

    public void saveGame(Game game) {
        mGameDao.update(game);
    }

    public Game getGameSaveByID(long saveID) {
        return mGameDao.getGameSaveByID(saveID);
    }

    public LiveData<List<Game>> getAllGames() {
        return mGameDao.getAll();
    }

    public void deleteGame(Game game) {
        mGameDao.delete(game);
    }
}
