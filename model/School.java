package model;
package model;

import java.util.ArrayList;

public class School {
    private String schoolName;
    private boolean isResearchCenter;
    private int yearOfEstablishment;
    private String majors;
    private String notableAlumni;

public School(String school, boolean researchcenter, int yearOfEstablish, String majors, String notableAlumni){
    this.schoolName = schoolName;
    this.isResearchCenter = isResearchCenter;
    this.yearOfEstablishment = yearOfEstablishment;
    this.majors = majors;
    this.notableAlumni = notableAlumni;}

    public String getName() { return schoolName; }
    public void setName(String name) { this.schoolName = name; }

    public boolean isResearchCenter() { return isResearchCenter; }
    public void setResearchCenter(boolean isResearchCenter) { this.isResearchCenter = isResearchCenter; }

    public int getYearOfEstablishment() { return yearOfEstablishment; }
    public void setYearOfEstablishment(int yearOfEstablishment) { this.yearOfEstablishment = yearOfEstablishment; }

    public String getMajors() { return majors; }
    public void setMajors(String majors) { this.majors = majors; }

    public String getNotableAlumni() { return notableAlumni; }
    public void setNotableAlumni(String notableAlumni) { this.notableAlumni = notableAlumni; }

    @Override
    public String toString() {
        return "School{" +
                "name='" + schoolName + '\'' +
                ", isResearchCenter=" + isResearchCenter +
                ", yearOfEstablishment=" + yearOfEstablishment +
                ", majors='" + majors + '\'' +
                ", notableAlumni='" + notableAlumni + '\'' +
                '}';
    }}


