package be.jpaSchoolOut.Proj.services;

import be.jpaSchoolOut.Proj.data.CouseRepository;
import be.jpaSchoolOut.Proj.model.Couse;

import java.util.List;

public class CouseService {

    CouseRepository couseRepository = new CouseRepository();
    Couse couse = new Couse();

    public void createCouse(Couse couse)
    {
        couseRepository.createCouse(couse);
    }

    public void updateCouse(Couse couse)
    {
        couseRepository.updateCouse(couse);
    }

    public Couse getCousebyId(long id)
    {
       return couseRepository.getCousebyId(id);
    }

    public void delCouse(long id)
    {
        couseRepository.delCouse(id);
    }

    public List<Couse> getAllCouses()
    {
        return couseRepository.getAllCouses();
    }


}
