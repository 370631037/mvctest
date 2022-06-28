package yhp.dao.impl;

import yhp.bean.Student;
import yhp.dao.StudentDao;
import yhp.util.DruidUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//接口名+Impl=当前类名
public class StudentDaoImpl extends DruidUtil implements StudentDao {
    @Override
    public List<Student> getall() {

        List list = new ArrayList();

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            connection = getConnection();
            ps = connection.prepareStatement("select * from users");
            resultSet = ps.executeQuery();
            while(resultSet.next()) {
                Student student = new Student();
                student.setStuid(resultSet.getInt("id"));
                student.setStuname(resultSet.getString("name"));
                student.setAge(resultSet.getInt("age"));
                student.setSex(resultSet.getInt("sex"));
                list.add(student);

            }
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }finally {
            close(connection,ps,resultSet);
        }

        return list;

    }
}
