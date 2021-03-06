package database;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "CLASS_TABLE".
 */
@Entity
public class ClassTable {
    private Integer lessonId;
    private Long startTime;
    private Long endTime;
    private Integer classNumber;
    private Boolean evenWeek;
    private Boolean oddWeek;
    private Integer weekDay;
    private Integer absenceCount;
    private Integer maxAbsenceCount;
    private String buildingName;

    @Generated(hash = 1840985244)
    public ClassTable() {
    }

    @Generated(hash = 283281427)
    public ClassTable(Integer lessonId, Long startTime, Long endTime, Integer classNumber, Boolean evenWeek, Boolean oddWeek, Integer weekDay, Integer absenceCount, Integer maxAbsenceCount, String buildingName) {
        this.lessonId = lessonId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.classNumber = classNumber;
        this.evenWeek = evenWeek;
        this.oddWeek = oddWeek;
        this.weekDay = weekDay;
        this.absenceCount = absenceCount;
        this.maxAbsenceCount = maxAbsenceCount;
        this.buildingName = buildingName;
    }

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Integer getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

    public Boolean getEvenWeek() {
        return evenWeek;
    }

    public void setEvenWeek(Boolean evenWeek) {
        this.evenWeek = evenWeek;
    }

    public Boolean getOddWeek() {
        return oddWeek;
    }

    public void setOddWeek(Boolean oddWeek) {
        this.oddWeek = oddWeek;
    }

    public Integer getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(Integer weekDay) {
        this.weekDay = weekDay;
    }

    public Integer getAbsenceCount() {
        return absenceCount;
    }

    public void setAbsenceCount(Integer absenceCount) {
        this.absenceCount = absenceCount;
    }

    public Integer getMaxAbsenceCount() {
        return maxAbsenceCount;
    }

    public void setMaxAbsenceCount(Integer maxAbsenceCount) {
        this.maxAbsenceCount = maxAbsenceCount;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

}
