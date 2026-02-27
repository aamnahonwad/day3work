class Student {

    private String name;
    private int marks;

    // Getter
    public int getMarks() {
        return marks;
    }

    // Setter
    public void setDetails(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 75)
            return "A";
        else if (marks >= 50)
            return "B";
        else
            return "C";
    }

    public static void main(String[] args) {

        GraduateStudent g = new GraduateStudent();
        g.setDetails("Aamna", 70);

        System.out.println("Final Grade: " + g.calculateGrade());
    }
}

class GraduateStudent extends Student {

    @Override
    public String calculateGrade() {

        int bonusMarks = getMarks() + 5;  // extra bonus

        if (bonusMarks >= 75)
            return "A";
        else if (bonusMarks >= 50)
            return "B";
        else
            return "C";
    }
}