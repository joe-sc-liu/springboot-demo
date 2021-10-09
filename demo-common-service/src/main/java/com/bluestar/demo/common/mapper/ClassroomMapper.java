package com.bluestar.demo.common.mapper;

import java.util.List;

import com.bluestar.demo.common.model.Classroom;

/**
 * @author Joe Liu
 * @date 2021年10月9日
 */
public interface ClassroomMapper {
    
    Integer insert(Classroom class_room);

//  Integer update(Classroom user);

//  Integer delete(Classroom user);

    Classroom getById(Integer id);

    List<Classroom> getBypage();

}
