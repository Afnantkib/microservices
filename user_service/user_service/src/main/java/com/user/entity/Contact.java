package com.user.entity;

public class Contact {
    private Long cID;
    private String cEmail;
    private String contactName;
    private Long userId;

    public Contact(Long cID, String cEmail, String contactName, Long userId) {
        this.cID = cID;
        this.cEmail = cEmail;
        this.contactName = contactName;
        this.userId = userId;
    }

    public Contact() {
    }

    public Long getcID() {
        return cID;
    }

    public void setcID(Long cID) {
        this.cID = cID;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
