package com.animagic.wizard;

public class Asset {
    private Instrument instrument;
    private InstrumentType instrumentType;
    private String name;
    private String value;

    public Asset(Instrument instrument, InstrumentType instrumentType, String name, String value) {
        this.instrument = instrument;
        this.instrumentType = instrumentType;
        this.name = name;
        this.value = value;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean equals(Asset asset) {
        return this.instrument == asset.instrument
                && this.instrumentType == asset.instrumentType
                && this.getName().equals(asset.getName());
    }
}
