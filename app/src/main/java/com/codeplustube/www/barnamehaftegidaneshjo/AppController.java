package com.codeplustube.www.barnamehaftegidaneshjo; /**
 * Created by Hossein on 7/13/2016.
 */

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import database.DaoMaster;
import database.DaoSession;
import database.LessonDao;

public class AppController extends Application{

    private static AppController mInstance;
    static LessonDao lessonDao;




    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this,"daneshjoYar.db",null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        DaoSession daoSession = daoMaster.newSession();

        lessonDao = daoSession.getLessonDao();
    }

    public static LessonDao getLessonDao() {
        return lessonDao;
    }

    public static Context getAppContext() {
        return getInstance().getApplicationContext();
    }


    public static synchronized AppController getInstance() {
        return mInstance;
    }


}
