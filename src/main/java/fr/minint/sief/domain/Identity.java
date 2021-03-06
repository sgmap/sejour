package fr.minint.sief.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import fr.minint.sief.domain.enumeration.SexType;
import fr.minint.sief.domain.util.CustomDateTimeDeserializer;
import fr.minint.sief.domain.util.CustomDateTimeSerializer;

/**
 * A Identity.
 */
@Document(collection = "IDENTITY")
public class Identity implements Serializable {

    @NotNull        
    @Field("last_name")
    private String lastName;
    
    @Field("used_last_name")
    private String usedLastName;
    
    @Field("first_name")
    private String firstName;

    @NotNull        
    @Field("sex")
    private SexType sex;

    @NotNull        
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    @Field("birth_date")
    private DateTime birthDate;

    @NotNull        
    @Field("birth_city")
    private String birthCity;

    @NotNull        
    @Field("birth_country")
    private String birthCountry;

    @NotNull        
    @Field("nationality")
    private String nationality;

    @NotNull        
    @Field("passport_number")
    private String passportNumber;
    
    @Field("passport")
    private String passport;
    
    @Field("birth_act")
    private String birthAct;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsedLastName() {
        return usedLastName;
    }

    public void setUsedLastName(String usedLastName) {
        this.usedLastName = usedLastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public SexType getSex() {
        return sex;
    }

    public void setSex(SexType sex) {
        this.sex = sex;
    }

    public DateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(DateTime birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getBirthAct() {
        return birthAct;
    }

    public void setBirthAct(String birthAct) {
        this.birthAct = birthAct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Identity identity = (Identity) o;

        if ( ! Objects.equals(passportNumber, identity.passportNumber)) return false;

        return true;
    }

    @Override
    public int hashCode() {
    	return Objects.hashCode(passportNumber);
    }

    @Override
    public String toString() {
        return "Identity{" +
                "lastName='" + lastName + "'" +
                ", usedLastName='" + usedLastName + "'" +
                ", firstName='" + firstName + "'" +
                ", sex='" + sex + "'" +
                ", birthDate='" + birthDate + "'" +
                ", birthCity='" + birthCity + "'" +
                ", birthCountry='" + birthCountry + "'" +
                ", nationality='" + nationality + "'" +
                ", passportNumber='" + passportNumber + "'" +
                ", passport='" + passport + "'" +
                ", birthAct='" + birthAct + "'" +
                '}';
    }
}
