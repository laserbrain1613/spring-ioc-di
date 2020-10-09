package se.lexicon.data_access;

import org.springframework.stereotype.Component;
import se.lexicon.models.Student;
import se.lexicon.sequencer.StudentIdSequencer;

import java.util.ArrayList;
import java.util.List;

@Component("studentDao")
public class StudentDaoListImpl implements StudentDao {

    private List<Student> students = new ArrayList<>();

    @Override
    public Student save(Student student) {
        student.setId(StudentIdSequencer.nextStudentId());
        students.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void delete(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                break;
            }
        }
    }
}