class EnrollmentProcessor extends Thread {
    private String task;

    EnrollmentProcessor(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println("Processing: " + task);
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed: " + task);
    }
}
