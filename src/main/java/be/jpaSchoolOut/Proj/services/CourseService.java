package be.jpaSchoolOut.Proj.services;

import be.jpaSchoolOut.Proj.data.CourseRepository;
import be.jpaSchoolOut.Proj.model.Course;

import java.util.List;

public class CourseService {

    CourseRepository CourseRepository = new CourseRepository();
    Course couse = new Course();

    public void createCouse(Course couse)
    {
        CourseRepository.createCouse(couse);
    }

    public void updateCouse(Course couse)
    {
        CourseRepository.updateCouse(couse);
    }

    /*public Course getCousebyId(long id)
    {
       return CourseRepository.getCousebyId(id);
    }*/

    public void delCouse(long id)
    {
        CourseRepository.delCouse(id);
    }

    /*public List<Course> getAllCouses()
    {
        return CourseRepository.getAllCouses();
    }*/


}
