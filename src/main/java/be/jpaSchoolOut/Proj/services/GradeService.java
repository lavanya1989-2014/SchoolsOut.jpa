package be.jpaSchoolOut.Proj.services;

import be.jpaSchoolOut.Proj.data.GradeRepository;
import be.jpaSchoolOut.Proj.data.ModuleRepository;
import be.jpaSchoolOut.Proj.model.Grade;
import be.jpaSchoolOut.Proj.model.Module;

import java.util.List;

public class GradeService {
    GradeRepository gradeRepository = new GradeRepository();
    Grade grade = new Grade();

    public void createGrade(Grade grade)
    {
        gradeRepository.createGrade(grade);
    }

        public void updateGrade(Grade grade)
    {
       gradeRepository.updateGrade(grade);
    }

   /* public Grade getGradebyId(long id)
    {
        return gradeRepository.getGradebyId(id);
    }*/

    public void delGrade(long id)
    {
       gradeRepository.delGrade(id);
    }

    /*public List<Grade> getAllGrades()
    {
        return gradeRepository.getAllGrades();
    }*/


}
