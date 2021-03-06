package org.acaro.graphish;

import java.util.HashMap;

import org.acaro.stagedgraphish.PropertyContainer;

public class PropertyContainerImpl implements PropertyContainer {
	private HashMap<String, byte[]> props = new HashMap<String, byte[]>();
	private byte[] id;
	
	public PropertyContainerImpl(byte[] id){
		this.id = id;
	}
	
	public byte[] getId() {
		return id;
	}

	public boolean hasProperty(String key) {
		return props.containsKey(key);
	}

	public void setProperty(String key, byte[] value) {
		props.put(key, value);
	}

	public byte[] getProperty(String key) {
		return props.get(key);
	}

	public byte[] removeProperty(String key) {
		return props.remove(key);
	}

	public Iterable<String> getPropertyKeys() {
		return props.keySet();
	}

	public Iterable<byte[]> getPropertyValues() {
		return props.values();
	}
}