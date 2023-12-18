package org.example.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "person", schema = "lab8")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PersonEntity {
    private String id;
    private String surname;
    private String forename;
    private String patronymic;
    private String dob;
    private byte sex;
    private String passportSeries;
    private String passportNumber;
    private String city;
    private String address;
    private String phoneHome;
    private String phoneMobile;
    private String citizenship;
    private byte dutyBound;

    public PersonEntity() {
    }

    public PersonEntity(String id, String surname, String forename, String patronymic, String dob, byte sex, String passportSeries, String passportNumber, String city, String address, String phoneHome, String phoneMobile, String citizenship, byte dutyBound) {
        this.id = id;
        this.surname = surname;
        this.forename = forename;
        this.patronymic = patronymic;
        this.dob = dob;
        this.sex = sex;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.city = city;
        this.address = address;
        this.phoneHome = phoneHome;
        this.phoneMobile = phoneMobile;
        this.citizenship = citizenship;
        this.dutyBound = dutyBound;
    }

    @Id
    @Column(name = "id", nullable = false, length = 45)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "surname", nullable = false, length = 45)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "forename", nullable = false, length = 45)
    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    @Basic
    @Column(name = "patronymic", nullable = false, length = 45)
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Basic
    @Column(name = "DOB", nullable = false)
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Basic
    @Column(name = "sex", nullable = false)
    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "passport_series", nullable = false, length = 45)
    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    @Basic
    @Column(name = "passport_number", nullable = false, length = 45)
    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Basic
    @Column(name = "city", nullable = false, length = 45)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 45)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "phone_home", length = 45)
    public String getPhoneHome() {
        return phoneHome;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }

    @Basic
    @Column(name = "phone_mobile", length = 45)
    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    @Basic
    @Column(name = "citizenship", nullable = false, length = 45)
    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    @Basic
    @Column(name = "duty_bound", nullable = false)
    public byte getDutyBound() {
        return dutyBound;
    }

    public void setDutyBound(byte dutyBound) {
        this.dutyBound = dutyBound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonEntity that = (PersonEntity) o;

        if (sex != that.sex) return false;
        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(surname, that.surname)) return false;
        if (!Objects.equals(forename, that.forename)) return false;
        if (!Objects.equals(patronymic, that.patronymic)) return false;
        if (!Objects.equals(dob, that.dob)) return false;
        if (!Objects.equals(passportSeries, that.passportSeries))
            return false;
        if (!Objects.equals(passportNumber, that.passportNumber))
            return false;
        if (!Objects.equals(city, that.city)) return false;
        if (!Objects.equals(address, that.address)) return false;
        if (!Objects.equals(citizenship, that.citizenship)) return false;
        return dutyBound == that.dutyBound;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (forename != null ? forename.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (int) sex;
        result = 31 * result + (passportSeries != null ? passportSeries.hashCode() : 0);
        result = 31 * result + (passportNumber != null ? passportNumber.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (citizenship != null ? citizenship.hashCode() : 0);
        result = 31 * result + (int) dutyBound;
        return result;
    }
}
