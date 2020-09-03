package be.jpaSchoolOut.Proj.services;

import be.jpaSchoolOut.Proj.data.ModuleRepository;
import be.jpaSchoolOut.Proj.model.Module;

import java.util.List;

public class ModuleService {

    ModuleRepository moduleRepository = new ModuleRepository();
    Module module = new Module();

    public void createModule(java.lang.Module module)
    {
        moduleRepository.createModule(module);
    }

    public void updateModule(java.lang.Module module)
    {
        moduleRepository.updateModule(module);
    }

    public java.lang.Module getModulebyId(long id)
    {
        return  moduleRepository.getModulebyId(id);
    }

    public void delModule(long id)
    {
        moduleRepository.delModule(id);
    }

    public List<java.lang.Module> getAllModules()
    {
        return moduleRepository.getAllModules();
    }

}
