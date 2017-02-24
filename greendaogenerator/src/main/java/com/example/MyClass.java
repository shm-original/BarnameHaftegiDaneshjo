package com.example;

import org.greenrobot.greendao.generator.DaoGenerator;
import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Schema;

public class MyClass {
    public static void main(String[] args)  throws Exception {

        //place where db folder will be created inside the project folder
        Schema schema = new Schema(1,"database");

        //Entity i.e. Class to be stored in the database // ie table LOG
        Entity Lesson= schema.addEntity("Lesson");

        Lesson.addIdProperty().autoincrement(); //It is the primary key for uniquely identifying a row

        Lesson.addIntProperty("unitCount");  //Not null is SQL constrain
        
        Lesson.addStringProperty("name");

        Lesson.addStringProperty("lessonEducatorName");

        Lesson.addStringProperty("lessonEducatorPic");

        Lesson.addLongProperty("endOfTermDate");

        Lesson.addLongProperty("midTermDate");

        Lesson.addIntProperty("midTermGrade");

        Lesson.addIntProperty("endOfTermGrade");

        Lesson.addStringProperty("description");


        Entity classTable = schema.addEntity("ClassTable");

        classTable.addIntProperty("lessonId");

        classTable.addLongProperty("startTime");

        classTable.addLongProperty("endTime");

        classTable.addIntProperty("classNumber");

        classTable.addBooleanProperty("evenWeek");

        classTable.addBooleanProperty("oddWeek");

        classTable.addIntProperty("weekDay");

        classTable.addIntProperty("absenceCount");

        classTable.addIntProperty("maxAbsenceCount");

        classTable.addStringProperty("buildingName");


        Entity alarmTable = schema.addEntity("Alarm");

        alarmTable.addLongProperty("date");

        alarmTable.addStringProperty("description");

        alarmTable.addLongProperty("lessonId");

        alarmTable.addStringProperty("alarmType");

        alarmTable.addBooleanProperty("isRepeating");


        // حضور و غیاب
        Entity rollCall = schema.addEntity("RollCall");

        rollCall.addLongProperty("date");

        rollCall.addIntProperty("weekNumber");

        rollCall.addLongProperty("classId");

        rollCall.addLongProperty("lessonId");

        rollCall.addBooleanProperty("wasPresent");


        //  ./app/src/main/java/   ----   com/codekrypt/greendao/db is the full path
        new DaoGenerator().generateAll(schema, "./app/src/main/java");

    }

}
