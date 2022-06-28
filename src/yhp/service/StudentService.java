package yhp.service;

import yhp.bean.Student;

import java.util.List;

//bean类名+service= 当前类名
//service 主要定义业务逻辑层，现阶段主要实现调取dao层
public interface StudentService {

    //查询全部
    public List<Student> getall();
}
