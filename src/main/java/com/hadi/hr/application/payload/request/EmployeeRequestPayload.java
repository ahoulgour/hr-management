package com.hadi.hr.application.payload.request;

import com.hadi.hr.domain.dto.ReferentialDto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeRequestPayload {

    private String documentId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String birthDate;
    private String nationality;
    private ReferentialDto department;

    public ReferentialDto getDepartment() {
        return department;
    }

    public void setDepartment(ReferentialDto department) {
        this.department = department;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


}
