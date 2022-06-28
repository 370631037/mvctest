package yhp.service.impl;

import yhp.bean.Student;
import yhp.dao.StudentDao;
import yhp.dao.impl.StudentDaoImpl;
import yhp.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = new StudentDaoImpl();

    @Override
    public List<Student> getall() {
        return studentDao.getall();
    }
}
