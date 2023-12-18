package org.example.xmlmarshalling;

import org.example.entities.PersonEntity;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.sql.Date;

@XmlType(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class PersonXML {
    private String id;
    private String surname;
    private String forename;
    private String patronymic;
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
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

    private QueryType qtype;

    public PersonXML() {
    }

    public PersonXML(PersonEntity origin) {
        this.id = origin.getId();
        this.surname = origin.getSurname();
        this.forename = origin.getForename();
        this.patronymic = origin.getPatronymic();
        this.dob = origin.getDob();
        this.sex = origin.getSex();
        this.passportSeries = origin.getPassportSeries();
        this.passportNumber = origin.getPassportNumber();
        this.city = origin.getCity();
        this.address = origin.getAddress();
        this.phoneHome = origin.getPhoneHome();
        this.phoneMobile = origin.getPhoneMobile();
        this.citizenship = origin.getCitizenship();
        this.dutyBound = origin.getDutyBound();
        this.qtype = null;
    }

    public PersonEntity getEntity() {
        PersonEntity emp = new PersonEntity();
        emp.setId(id);
        emp.setSurname(surname);
        emp.setForename(forename);
        emp.setPatronymic(patronymic);
        emp.setDob(dob);
        emp.setSex(sex);
        emp.setPassportSeries(passportSeries);
        emp.setPassportNumber(passportNumber);
        emp.setCity(city);
        emp.setAddress(address);
        emp.setPhoneHome(phoneHome);
        emp.setPhoneMobile(phoneMobile);
        emp.setCitizenship(citizenship);
        emp.setDutyBound(dutyBound);
        return emp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneHome() {
        return phoneHome;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }

    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public byte getDutyBound() {
        return dutyBound;
    }

    public void setDutyBound(byte dutyBound) {
        this.dutyBound = dutyBound;
    }

    public QueryType getQtype() {
        return qtype;
    }

    public void setQtype(QueryType qtype) {
        this.qtype = qtype;
    }

    @Override
    public String toString() {
        return "PersonXML{" +
                "id='" + id + '\'' +
                ", surname='" + surname + '\'' +
                ", forename='" + forename + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dob='" + dob + '\'' +
                ", sex=" + sex +
                ", passportSeries='" + passportSeries + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", phoneHome='" + phoneHome + '\'' +
                ", phoneMobile='" + phoneMobile + '\'' +
                ", citizenship='" + citizenship + '\'' +
                ", dutyBound=" + dutyBound +
                ", qtype=" + qtype +
                '}';
    }
}