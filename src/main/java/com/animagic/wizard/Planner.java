package com.animagic.wizard;

import java.util.ArrayList;

public class Planner {
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String emailAddress;
    private String telephoneNumber;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String postCode;
    private ArrayList<Client> clients;

    public Planner(String firstName,
                   String lastName,
                   String jobTitle,
                   String emailAddress,
                   String telephoneNumber,
                   String addressLine1,
                   String addressLine2,
                   String addressLine3,
                   String postCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.emailAddress = emailAddress;
        this.telephoneNumber = telephoneNumber;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.postCode = postCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void addClient(Client client) {
        client.setPlanner(this);
        this.clients.add(client);
    }

    public void removeClient(Client client) {
        this.clients.remove(client);
        client.setPlanner(null);
    }

    public boolean hasClient(Client client) {
        return this.clients.contains(client);
    }
}
