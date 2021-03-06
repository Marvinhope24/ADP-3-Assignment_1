/* TeacherFactory.java
Factory package for TeacherFactory
Author: Jayden Johnson (219086796)
Date: 31 March 2022
*/

package za.ac.cput.Factory;

import za.ac.cput.Domain.Entity.Teacher;
import za.ac.cput.util.Helper;

public class TeacherFactory {
    public static Teacher createTeacher(String adminID,
                                        String subDeptID,
                                        String teachName,
                                        String teachSurname,
                                        String cellNum,
                                        String qualification,
                                        String importantInfo,
                                        String post){

        String teacherID = Helper.generateID();
        Teacher teacher = new Teacher.Builder().setTeacherID(teacherID)
                .setAdminID(adminID)
                .setSubDeptID(subDeptID)
                .setTeachName(teachName)
                .setTeachSurname(teachSurname)
                .setCellNum(cellNum)
                .setQualification(qualification)
                .setImportantInfo(importantInfo)
                .setPost(post)
                .build();
        return teacher;
    }
}
