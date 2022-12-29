package chapter_10;

public class ContactInfo
{
    private String name;
    private String businessPhone, homePhone, cellPhone;
    private String email;
    private String address;

    public ContactInfo() { }

    public ContactInfo(String aString)
    {
        String[] info = aString.split(",");

        String name = info[0].split(":")[1].trim();
        this.name = ((name.equals("not assigned")) ? null : name);

        String businessPhone = info[1].split(":")[1].trim();
        this.businessPhone = ((businessPhone.equals("not assigned")) ? null : businessPhone);

        String homePhone = info[2].split(":")[1].trim();
        this.homePhone = ((homePhone.equals("not assigned")) ? null : homePhone);

        String cellPhone = info[3].split(":")[1].trim();
        this.cellPhone = ((cellPhone.equals("not assigned")) ? null : cellPhone);

        String email = info[4].split(":")[1].trim();
        this.email = ((email.equals("not assigned")) ? null : email);

        String address = info[5].split(":")[1];
        address = address.replace("}", "").trim();
        this.address = ((address.equals("not assigned")) ? null : address);
    }

    public String toString()
    {
        return "Contact {name : " + ((name == null) ? "not assigned" : name)
                + ", business phone : " + ((businessPhone == null) ? "not assigned" : businessPhone)
                + ", home phone : " + ((homePhone == null) ? "not assigned" : homePhone)
                + ", cell phone : " + ((cellPhone == null) ? "not assigned" : cellPhone)
                + ", email : " + ((email == null) ? "not assigned" : email)
                + ", address : " + ((address == null) ? "not assigned" : address) + "}";
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setBusinessPhone(String businessPhone)
    {
        this.businessPhone = businessPhone;
    }

    public void setHomePhone(String homePhone)
    {
        this.homePhone = homePhone;
    }

    public void setCellPhone(String cellPhone)
    {
        this.cellPhone = cellPhone;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
