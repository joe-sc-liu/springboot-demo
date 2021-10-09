package com.bluestar.demo.common.service.impl;

import com.bluestar.demo.common.service.IClassroomService;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.bluestar.demo.common.mapper.ClassroomMapper;
import com.bluestar.demo.common.model.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Joe Liu
 * @date 2021年10月9日
 */
@Service
public class ClassroomServiceImpl implements IClassroomService {
    
    @Autowired
    private ClassroomMapper classroomMapper;
    
    @Override
    @Transactional
    public Boolean createClassroom(Classroom class_room) {
        Integer roomInt = classroomMapper.insert(class_room);

        if(roomInt > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    @Transactional
    public Classroom getById(Integer id) {
        return classroomMapper.getById(id);
    }

    @Override
    @Transactional
    public List<Classroom> getByPage(int page, int rows) {
        Page<Classroom> class_room_Page = PageHelper.startPage(page, rows, true);
        List<Classroom> class_rooms = classroomMapper.getBypage();
        
        System.out.println("-------------------" + class_room_Page.toString() + "-----------");
        return class_rooms;
    }

}
