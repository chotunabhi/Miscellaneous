package com.java.serialization;

import java.io.Serializable;
import java.util.Set;

public class InnerSerializableClass implements Serializable {
	Set<Long> set;

	public Set<Long> getSet() {
		return set;
	}

	public void setSet(Set<Long> set) {
		this.set = set;
	}
}
