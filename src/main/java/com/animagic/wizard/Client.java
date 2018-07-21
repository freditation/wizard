package com.animagic.wizard;

import java.util.ArrayList;
import java.util.Calendar;

public class Client {
    private String name;
    private boolean hasPartner;
    private Calendar clientDateOfBirth;
    private Calendar partnerDateOfBirth;
    private Planner planner;
    private ArrayList<Asset> assets;

    public Client(String name) {
        this.name = name;
        this.hasPartner = false;
        this.clientDateOfBirth = Calendar.getInstance();
        this.partnerDateOfBirth = Calendar.getInstance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasPartner() {
        return hasPartner;
    }

    public void setHasPartner(boolean hasPartner) {
        this.hasPartner = hasPartner;
    }

    public Calendar getClientDateOfBirth() {
        return clientDateOfBirth;
    }

    public void setClientDateOfBirth(Calendar clientDateOfBirth) {
        this.clientDateOfBirth = clientDateOfBirth;
    }

    public Calendar getPartnerDateOfBirth() {
        return partnerDateOfBirth;
    }

    public void setPartnerDateOfBirth(Calendar partnerDateOfBirth) {
        this.partnerDateOfBirth = partnerDateOfBirth;
    }

    public Planner getPlanner() {
        return planner;
    }

    public void setPlanner(Planner planner) {
        this.planner = planner;
        this.planner.addClient(this);
    }

    public int getClientAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - this.clientDateOfBirth.get(Calendar.YEAR);
    }

    public int getClientAge(Calendar onDate) {
        return onDate.get(Calendar.YEAR) - this.clientDateOfBirth.get(Calendar.YEAR);
    }

    public int getPartnerAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - this.clientDateOfBirth.get(Calendar.YEAR);
    }

    public int getPartnerAge(Calendar onDate) {
        return onDate.get(Calendar.YEAR) - this.partnerDateOfBirth.get(Calendar.YEAR);
    }

    public boolean equals(Client client) {
        return this.name.equals(client.getName());
    }

    public ArrayList<Asset> getAssets() {
        return assets;
    }

    public void setAssets(ArrayList<Asset> assets) {
        this.assets = assets;
    }

    public void addAsset(Asset asset) {
        this.assets.add(asset);
    }

    public void removeAsset(Asset asset) {
        this.assets.remove(asset);
    }
}
