package com.bluestar.demo.common.service;

import java.util.List;

import com.bluestar.demo.common.model.Classroom;

/**
 * @author Joe Liu
 * @date 2021年10月9日
 */
public interface IClassroomService {
    
    /**
     * 新增一筆 教室資料
     * @param class_room
     * @return
     * @author Joe Liu
     * @date 2021年10月9日
     */
    Boolean createClassroom(Classroom class_room);

    /**
     * 依id取得該筆教室資訊
     * @param id
     * @return
     * @author Joe Liu
     * @date 2021年10月9日
     */
    Classroom getById(Integer id);

    /**
     * 依分頁取得教室資訊
     * @param page
     * @param rows
     * @return
     * @author Joe Liu
     * @date 2021年10月9日
     */
    List<Classroom> getByPage(int page, int rows);

}
