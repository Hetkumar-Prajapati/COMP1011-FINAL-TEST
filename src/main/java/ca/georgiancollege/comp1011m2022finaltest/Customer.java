package ca.georgiancollege.comp1011m2022finaltest;

import com.google.gson.annotations.SerializedName;

public class Customer {
    //private instance members
    @SerializedName("id")
    private String m_id;

    @SerializedName("gender")
    private String m_gender;

    @SerializedName("firstName")
    private String m_firstName;

    @SerializedName("lastName")
    private String m_lastName;

    @SerializedName("streetAddress")
    private String m_streetAddress;

    @SerializedName("city")
    private String m_city;

    @SerializedName("province")
    private String m_province;

    @SerializedName("postalCode")
    private String m_postalCode;

    @SerializedName("emailAddress")
    private String m_emailAddress;

    @SerializedName("ccType")
    private String m_ccType;

    @SerializedName("bloodType")
    private String m_bloodType;

    @SerializedName("phoneNumber")
    private String m_phoneNumber;

    @SerializedName("pounds")
    private String m_pounds;

    @SerializedName("heightInCM")
    private String m_heightInCM;

    @SerializedName("purchases")
    private String m_purchases;

    //getters and setters (Mutators and Accessors)

    public String getPurchases() {
        return m_purchases;
    }

    public void setPurchases(String m_purchases) {
        this.m_purchases = m_purchases;
    }

    public String getId() {
        return m_id;
    }

    public void setId(String id) {
        this.m_id = id;
    }

    public String getGender() {
        return m_gender;
    }

    public void setGender(String gender) {
        this.m_gender = gender;
    }

    public String getFirstName() {
        return m_firstName;
    }

    public void setFirstName(String firstName) {
        this.m_firstName = firstName;
    }

    public String getLastName() {
        return m_lastName;
    }

    public void setLastName(String lastName) {
        this.m_lastName = lastName;
    }

    public String getStreetAddress() {
        return m_streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.m_streetAddress = streetAddress;
    }

    public String getCity() {
        return m_city;
    }

    public void setCity(String city) {
        this.m_city = city;
    }

    public String getProvince() {
        return m_province;
    }

    public void setProvince(String province) {
        this.m_province = province;
    }

    public String getPostalCode() {
        return m_postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.m_postalCode = postalCode;
    }

    public String getEmailAddress() {
        return m_emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.m_emailAddress = emailAddress;
    }

    public String getCcType() {
        return m_ccType;
    }

    public void setCcType(String ccType) {
        this.m_ccType = ccType;
    }

    public String getBloodType() {
        return m_bloodType;
    }

    public void setBloodType(String bloodType) {
        this.m_bloodType = bloodType;
    }

    public String getPhoneNumber() {
        return m_phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.m_phoneNumber = phoneNumber;
    }

    public String getPounds() {
        return m_pounds;
    }

    public void setPounds(String pounds) {
        this.m_pounds = pounds;
    }

    public String getHeightInCM() {
        return m_heightInCM;
    }

    public void setHeightInCM(String heightInCM) {
        this.m_heightInCM = heightInCM;
    }

    // Constuctors
    public Customer()
    {
        this.m_id = "";
        this.m_gender = "";
        this.m_firstName = "";
        this.m_lastName = "";
        this.m_streetAddress = "";
        this.m_city = "";
        this.m_province = "";
        this.m_postalCode = "";
        this.m_emailAddress = "";
        this.m_ccType = "";
        this.m_bloodType = "";
        this.m_phoneNumber = "";
        this.m_pounds = "";
        this.m_heightInCM = "";
        this.m_purchases = "";

    }
    public Customer(String id, String gender, String firstName, String lastName, String streetAddress, String city, String province, String postalCode, String emailAddress, String ccType, String bloodType, String phoneNumber, String pounds, String heightInCM , String purchases) {
        this.m_id = id;
        this.m_gender = gender;
        this.m_firstName = firstName;
        this.m_lastName = lastName;
        this.m_streetAddress = streetAddress;
        this.m_city = city;
        this.m_province = province;
        this.m_postalCode = postalCode;
        this.m_emailAddress = emailAddress;
        this.m_ccType = ccType;
        this.m_bloodType = bloodType;
        this.m_phoneNumber = phoneNumber;
        this.m_pounds = pounds;
        this.m_heightInCM = heightInCM;
        this.m_purchases = purchases;

    }

    //Overridden Methods

     @Override
    public String toString() {

        /*
        return String.format("id: %s%n gender: %s%n firstName: %s%n lastName: %s%n streetAddress: %s%n city: %s%n province: %s%n postalCode: %s%n emailAddress: %s%n ccType: %s%n bloodType: %s%n phoneNumber: %s%n pounds: %s%n heightInCM: %s%n purchases: %s%n ",
                getId(), getGender(), getFirstName(), getLastName(), getStreetAddress(), getCity(), getProvince(),
                getPostalCode(), getEmailAddress(), getCcType(), getBloodType(), getPhoneNumber(), getPounds(), getHeightInCM(), getPurchases() );

         */


        return String.format("id: %s, firstName: %s , lastName: %s",
               getId(),  getFirstName(), getLastName());
    }
}
