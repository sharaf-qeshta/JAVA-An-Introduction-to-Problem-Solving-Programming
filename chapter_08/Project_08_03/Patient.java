package chapter_08;

public class Patient extends Person
{
    private String ID;

    public Patient(String name, String ID)
    {
        super(name);
        this.ID = ID;
    }

    public String getID()
    {
        return ID;
    }

    public void setID(String ID)
    {
        this.ID = ID;
    }

    public boolean equals(Patient patient)
    {
        return patient.getID().equals(ID)
                && patient.getName().equals(name);
    }
}
