import com.sample.dao.StudentDao;
import com.sample.domain.Student;
import org.junit.Test;

public class TestDao {
    @Test
    public void testStudentDao(){
        Student student = new Student();
        student.setAge(Integer.parseInt("20"));
        student.setName("lisi");
        student.setEmail("23123@12312.com");

        StudentDao studentDao = new StudentDao();
        studentDao.addInfo(student);
    }
}
