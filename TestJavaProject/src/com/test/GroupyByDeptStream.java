package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupyByDeptStream {
String name ;
String department;
GroupyByDeptStream(String name,String dept){
	this.name=name;
	this.department=dept;
}
public String getName() {
	return this.name;
}
public String getDepartment() {
	return this.department;
}


	public static void main(String[] args) {
		List<GroupyByDeptStream> employee = Arrays.asList( new GroupyByDeptStream("Alice", "HR"),
			    new GroupyByDeptStream("Bob", "IT"),
			    new GroupyByDeptStream("Charlie", "HR"),
			    new GroupyByDeptStream("David", "Finance"),
			    new GroupyByDeptStream("Eve", "IT")
);
		Map<String, List<GroupyByDeptStream>> groupedByDept = employee.stream()
			    .collect(Collectors.groupingBy(GroupyByDeptStream::getDepartment));
		
		groupedByDept.forEach((dept, emps) -> {
		    System.out.println(dept + ": " +
		        emps.stream().map(GroupyByDeptStream::getName).collect(Collectors.joining(", ")));
		});


		};
		
	

}
