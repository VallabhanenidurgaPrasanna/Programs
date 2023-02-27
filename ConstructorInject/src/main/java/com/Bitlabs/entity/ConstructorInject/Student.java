package com.Bitlabs.entity.ConstructorInject;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
private int id;
private String name;
private List<String> list;
private Set<String> set;
private Map<String,String> map;
public Student(int id, String name, List<String> list, Set<String> set, Map<String, String> map) {
	super();
	this.id = id;
	this.name = name;
	this.list = list;
	this.set = set;
	this.map = map;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", list=" + list + ", set=" + set + ", map=" + map + "]";
}

}
