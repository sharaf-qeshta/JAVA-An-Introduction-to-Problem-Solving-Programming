package chapter_08;

public class Billing
{
    private Patient patient;
    private Doctor doctor;

    public Billing(Patient patient, Doctor doctor)
    {
        this.patient = patient;
        this.doctor = doctor;
    }

    public Patient getPatient()
    {
        return patient;
    }

    public Doctor getDoctor()
    {
        return doctor;
    }

    public boolean equals(Billing billing)
    {
        return billing.getDoctor().equals(doctor)
                && billing.getPatient().equals(patient);
    }
}
