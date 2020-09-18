package com.example;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	private List <String> names = new ArrayList<>();
	public void add(String name) {
		names.add(name);
	}
	public void remove(String name) {
		names.remove(name);
	}
	public int size() {
		return names.size();
	}
	public void removeAll() {
		names.clear();
	}
}
