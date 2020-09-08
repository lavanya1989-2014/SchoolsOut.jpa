package be.jpaSchoolOut.Proj.services;

import be.jpaSchoolOut.Proj.data.ExamRepository;
import be.jpaSchoolOut.Proj.model.Exam;

import java.util.List;

public class ExamService {

    ExamRepository examRepository = new ExamRepository();
    Exam exam = new Exam();

    public void createExam(Exam exam)
    {

        examRepository.createExam(exam);
    }

    public void updateExam(Exam exam)
    {
        examRepository.updateExam(exam);
    }

    /*public Exam getExambyId(long id)
    {
        return examRepository.getExambyId(id);
    }*/

    public void delExam(long id)
    {
        examRepository.delExam(id);
    }

    /*public List<Exam> getAllExams()
    {
        return examRepository.getAllExams();
    }*/

  /* public void outputExam(long id) {
        examRepository.getSubExams(id).forEach(exam1 -> System.out.println());
    }*/
}
