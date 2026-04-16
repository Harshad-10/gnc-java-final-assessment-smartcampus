class student {
    int studentId;
    String name;
    String email;

    Student(int studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return studentId + " - " + name + " (" + email + ")";
    }

    
}
