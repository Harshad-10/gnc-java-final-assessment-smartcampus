import java.util.*;

class EnrollmentSystem {
    HashMap<Integer, Student> students = new HashMap<>();
    HashMap<Integer, Course> courses = new HashMap<>();
    HashMap<Integer, ArrayList<Course>> enrollments = new HashMap<>();

    
    void addStudent(Student s) {
        students.put(s.studentId, s);
    }

    
    void addCourse(Course c) {
        courses.put(c.courseId, c);
    }

    
    void enrollStudent(int studentId, int courseId) throws InvalidEnrollmentException {
        if (!students.containsKey(studentId)) {
            throw new InvalidEnrollmentException("Student not found!");
        }
        if (!courses.containsKey(courseId)) {
            throw new InvalidEnrollmentException("Course not found!");
        }
        enrollments.putIfAbsent(studentId, new ArrayList<>());
        enrollments.get(studentId).add(courses.get(courseId));
    }

    
    void viewStudents() {
        for (Student s : students.values()) {
            System.out.println(s);
        }
    }

    
    void viewEnrollments() {
        for (int studentId : enrollments.keySet()) {
            System.out.println(students.get(studentId) + " enrolled in:");
            for (Course c : enrollments.get(studentId)) {
                System.out.println("   " + c);
            }
        }
    }
}
