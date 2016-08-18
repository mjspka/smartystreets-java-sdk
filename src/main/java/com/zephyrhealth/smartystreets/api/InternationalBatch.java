/**
 *
 */
package com.zephyrhealth.smartystreets.api;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;

import com.smartystreets.api.exceptions.BatchFullException;
import com.zephyrhealth.smartystreets.InternationalLookup;

/**
 * @author pmalla
 *
 */
public class InternationalBatch {
	public static final int MAX_BATCH_SIZE = 100;
	private Map<String, InternationalLookup> namedLookups;
	private Vector<InternationalLookup> allLookups;
	private boolean standardizeOnly, includeInvalid;

	public InternationalBatch() {
        this.standardizeOnly = false;
        this.includeInvalid = false;
        this.namedLookups = new LinkedHashMap<>();
        this.allLookups = new Vector<>();
    }

	public void add(InternationalLookup newAddress) throws BatchFullException {
		if (this.allLookups.size() >= MAX_BATCH_SIZE)
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

	// region [ Iterator ]

	public int size() {
		return this.allLookups.size();
	}

	public Iterator<InternationalLookup> iterator() {
		return this.allLookups.iterator();
	}

	// endregion

	// region [ Getters ]

	public boolean getStandardizeOnly() {
		return this.standardizeOnly;
	}

	public boolean getIncludeInvalid() {
		return this.includeInvalid;
	}

	public Map<String, InternationalLookup> getNamedLookups() {
		return this.namedLookups;
	}

	public InternationalLookup get(String inputId) {
		return this.namedLookups.get(inputId);
	}

	public InternationalLookup get(int inputIndex) {
		return this.allLookups.get(inputIndex);
	}

	public Vector<InternationalLookup> getAllLookups() {
		return this.allLookups;
	}

	// endregion

	// region [ Setters ]

	public void setStandardizeOnly(boolean newValue) {
		this.standardizeOnly = newValue;
	}

	public void setIncludeInvalid(boolean newValue) {
		this.includeInvalid = newValue;
	}

	// endregion
}
