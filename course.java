class Course {
    int courseId;
    String courseName;
    double fee;

    Course(int courseId, String courseName, double fee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return courseId + " - " + courseName + " (Fee: " + fee + ")";
    }
}
