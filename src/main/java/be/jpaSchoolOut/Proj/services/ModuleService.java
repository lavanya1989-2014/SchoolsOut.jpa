package be.jpaSchoolOut.Proj.services;

import be.jpaSchoolOut.Proj.data.ModuleRepository;
import be.jpaSchoolOut.Proj.model.Module;

import java.util.List;

public class ModuleService {

    ModuleRepository moduleRepository = new ModuleRepository();
    Module module = new Module();

    public void createModule(Module module)
    {
        moduleRepository.createModule(module);
    }

    public void updateModule(Module module)
    {
        moduleRepository.updateModule(module);
    }

    /*public Module getModulebyId(long id)
    {
        return moduleRepository.getModulebyId(id);
    }*/

    public void delModule(long id)
    {
        moduleRepository.delModule(id);
    }

    /*public List<Module> getAllModules()
    {
        return moduleRepository.getAllModules();
    }*/

}
