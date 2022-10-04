package student;

import enums.StudyProfile;
import org.apache.commons.codec.digest.UnixCrypt;

import static enums.StudyProfile.PROGRAMMER;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Иванов Иван Иванович");
        student.setUniversityId("1");
        student.setCurrentCourseNumber(4);
        student.setAvgExamScore(4.6f);

        Univercity univercity = new Univercity();
        univercity.setId("1");
        univercity.setFullName("Тульский государственный университет");
        univercity.setShortName("ТулГУ");
        univercity.setYearOfFoundation(1930);
        univercity.setMainProfile(StudyProfile.PROGRAMMER);

        System.out.println(student);
        System.out.println(univercity);
    }
}
