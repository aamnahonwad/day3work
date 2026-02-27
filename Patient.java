public abstract class Patient {

    int patientId;
    String name;

    Patient(int id, String name) {
        this.patientId = id;
        this.name = name;
    }

    abstract void treatmentCost();

    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Aamna");
        Patient p2 = new OutPatient(102, "Sara");

        p1.treatmentCost();
        p2.treatmentCost();
    }
}

class InPatient extends Patient {

    InPatient(int id, String name) {
        super(id, name);
    }

    void treatmentCost() {
        System.out.println("InPatient cost: 10000");
    }
}

class OutPatient extends Patient {

    OutPatient(int id, String name) {
        super(id, name);
    }

    void treatmentCost() {
        System.out.println("OutPatient cost: 2000");
    }
}