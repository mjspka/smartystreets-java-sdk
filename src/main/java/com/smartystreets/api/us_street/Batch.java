package com.smartystreets.api.us_street;

import com.smartystreets.api.exceptions.BatchFullException;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;

public class Batch {
    public static final int MAX_BATCH_SIZE = 100;
    private Map<String, Lookup> namedLookups;
    private Vector<Lookup> allLookups;
    private boolean standardizeOnly, includeInvalid;

    public Batch() {
        this.standardizeOnly = false;
        this.includeInvalid = false;
        this.namedLookups = new LinkedHashMap<>();
        this.allLookups = new Vector<>();
    }

    public void add(Lookup newAddress) throws BatchFullException {
        if (this.isFull())
            throw new BatchFullException("Batch size cannot exceed " + MAX_BATCH_SIZE);

        this.allLookups.add(newAddress);

        String key = newAddress.getInputId();
        if (key == null)
            return;

        this.namedLookups.put(key, newAddress);

    }

    public void reset() {
        this.clear();
        this.standardizeOnly = false;
        this.includeInvalid = false;
    }

    public void clear() {
        this.namedLookups.clear();
        this.allLookups.clear();
    }

    //region [ Helpers ]

    public int size() {
        return this.allLookups.size();
    }

    public boolean isFull() {
        return (this.size() >= MAX_BATCH_SIZE);
    }

    public Iterator<Lookup> iterator() {
        return this.allLookups.iterator();
    }

    //endregion

    //region [ Getters ]

    public boolean getStandardizeOnly() {
        return this.standardizeOnly;
    }

    public boolean getIncludeInvalid() {
        return this.includeInvalid;
    }

    public Map<String, Lookup> getNamedLookups() {
        return this.namedLookups;
    }

    public Lookup get(String inputId) {
        return this.namedLookups.get(inputId);
    }

    public Lookup get(int inputIndex) {
        return this.allLookups.get(inputIndex);
    }

    public Vector<Lookup> getAllLookups() {
        return this.allLookups;
    }

    //endregion

    //region [ Setters ]

    public void setStandardizeOnly(boolean newValue) {
        this.standardizeOnly = newValue;
    }

    public void setIncludeInvalid(boolean newValue) {
        this.includeInvalid = newValue;
    }

    //endregion
}
