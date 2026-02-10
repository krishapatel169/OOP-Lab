class University {
    static int totalStudents;
    static String universityName;

    static {
        universityName = "ABC University";
        totalStudents = 0;
        System.out.println("Static block executed");
        System.out.println("University Name initialized: " + universityName);
    }

    
    {
        System.out.println("Instance block executed: Student object is being created");
    }

    University() {
        totalStudents++;
        System.out.println("Constructor executed");
    }

    static int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String[] args) {
        System.out.println("Main method started");

        University s1 = new University();
        University s2 = new University();

        System.out.println("Total Students: " + University.getTotalStudents());
    }
}
