package com.activity.data;

import java.util.TreeSet;

import com.activity.ActivityOtherInfoBase;

public class SecondCutOffData extends ActivityOtherInfoBase {
	private float cutOff=1;
	private TreeSet<Integer> lines=new TreeSet<>();
	private TreeSet<Integer> groups=new TreeSet<>();
	public float getCutOff() {
		return cutOff;
	}

	public void setCutOff(float cutOff) {
		this.cutOff = cutOff;
	}

	public TreeSet<Integer> getLines() {
		return lines;
	}

	public void setLines(TreeSet<Integer> lines) {
		this.lines = lines;
	}

	public TreeSet<Integer> getGroups() {
		return groups;
	}

	public void setGroups(TreeSet<Integer> groups) {
		this.groups = groups;
	}
}
