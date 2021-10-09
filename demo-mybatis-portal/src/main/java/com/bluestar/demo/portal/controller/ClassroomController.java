package com.bluestar.demo.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluestar.demo.common.model.Classroom;
import com.bluestar.demo.common.service.IClassroomService;

/**
 * @author Joe Liu
 * @date 2021年10月9日
 */
@RestController
@RequestMapping("/classroom")
public class ClassroomController {
    
    @Autowired
    private IClassroomService classroomService;
    
    @PostMapping(path="/create", produces = "application/json;charset=utf-8")
    public Boolean create(@RequestBody Classroom class_room) 
    {
        Boolean sBoolean = classroomService.createClassroom(class_room);
        
        return sBoolean;
    }
    
    
    
    
    
    
    

}
