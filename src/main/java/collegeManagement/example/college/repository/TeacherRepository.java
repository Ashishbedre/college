package collegeManagement.example.college.repository;

import collegeManagement.example.college.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
