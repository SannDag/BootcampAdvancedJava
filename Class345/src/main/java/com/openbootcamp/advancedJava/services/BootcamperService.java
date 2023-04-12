package com.openbootcamp.advancedJava.services;

import com.openbootcamp.advancedJava.model.BootcamperModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BootcamperService {

    private final List<BootcamperModel> bootcampers = new ArrayList();

    public List<BootcamperModel> getAll(){
        return bootcampers;
    }

    public void add(BootcamperModel bootcamperModel){
        bootcampers.add(bootcamperModel);
    }

    public BootcamperModel get(String name){
        for(BootcamperModel bootcamperModel : bootcampers){
            if(bootcamperModel.getName().equalsIgnoreCase(name)){
                return bootcamperModel;
            }
        }
        return null;
    }
}
