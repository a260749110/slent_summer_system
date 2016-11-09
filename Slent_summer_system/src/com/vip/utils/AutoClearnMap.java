package com.vip.utils;

import java.io.Serializable;
import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class AutoClearnMap<K, V> implements Serializable {
	private LinkMap<K, V> linkMap;

	public AutoClearnMap(long maxTime) {
		linkMap = new LinkMap<>(maxTime);

	}

	public void clean() {
		linkMap.clear();
	}

	public V get(K k) {
		Entry<V> e = linkMap.get(k);
		if (e == null) {
			return null;
		}
		long now = System.currentTimeMillis();
		if ((now - e.getLastTime()) > linkMap.getMaxTime()) {
			linkMap.remove(k);
			return null;
		}
		e.refreshLastTime();
		return e.value;
	}

	public void put(K k, V v) {
		if (v == null || k == null)
			return;
		Entry<V> e = new Entry<V>(v);
		e.refreshLastTime();
		linkMap.put(k, e);

	}

	public boolean contains(K k, V v) {
		Entry<V> e = linkMap.get(k);
		if(e.getValue()==v)
		{
			e.refreshLastTime();
			return true;
		}
		return false;
	}

	private static class Entry<V> {
		private V value;
		private long lastTime = 0;

		public Entry(V v) {
			setValue(v);
		}

		public long getLastTime() {
			return lastTime;
		}

		public void refreshLastTime() {
			this.lastTime = System.currentTimeMillis();
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}
	}

	private static class LinkMap<K, V> extends LinkedHashMap<K, Entry<V>> implements Serializable {
		private long maxTime = 30 * 60 * 60l;

		public LinkMap(long maxTime) {
			this.setMaxTime(maxTime);
		}

		@Override
		protected boolean removeEldestEntry(java.util.Map.Entry<K, com.vip.utils.AutoClearnMap.Entry<V>> eldest) {
			// TODO Auto-generated method stub
			long now = System.currentTimeMillis();
			if ((now - eldest.getValue().getLastTime()) > getMaxTime())
				return true;
			
			return super.removeEldestEntry(eldest);
		}

		public long getMaxTime() {
			return maxTime;
		}

		public void setMaxTime(long maxTime) {
			this.maxTime = maxTime;
		}
	}

}
