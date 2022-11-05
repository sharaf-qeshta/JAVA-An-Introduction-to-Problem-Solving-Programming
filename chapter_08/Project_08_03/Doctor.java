package chapter_08;

public class Doctor extends Person
{
    private double officeVisitFee;

    public Doctor(double officeVisitFee)
    {
        this.officeVisitFee = officeVisitFee;
    }

    public Doctor(String name, double officeVisitFee)
    {
        super(name);
        this.officeVisitFee = officeVisitFee;
    }


    public double getOfficeVisitFee()
    {
        return officeVisitFee;
    }

    public void setOfficeVisitFee(double officeVisitFee)
    {
        this.officeVisitFee = officeVisitFee;
    }

    public boolean equals(Doctor doctor)
    {
        return doctor.getName().equals(getName())
                && doctor.getOfficeVisitFee() == getOfficeVisitFee();
    }
}
