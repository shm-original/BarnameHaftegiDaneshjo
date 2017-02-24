package com.codeplustube.www.barnamehaftegidaneshjo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import database.Lesson;
import database.LessonDao;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lesson lesson = new Lesson();
        lesson.setName("mabani");
        lesson.setDescription("ddf");


        AppController.getLessonDao().queryBuilder().where(LessonDao.Properties.Name.eq("معماری")).list();

        AppController.getLessonDao().insert(lesson);

        AppController.getLessonDao().update(lesson);

        AppController.getLessonDao().delete(lesson);
    }
}
