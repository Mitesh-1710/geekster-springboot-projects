package com.geekster.visitor.count.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.geekster.visitor.count.model.Visitor;

@Repository
public class UrlHitRepository {

	private Map<String, Visitor> visitors = new HashMap<>();
	private Integer count = 0;

	public Integer getCount() {
		count++;
		return count;
	}

	public Visitor getCountByUsernmae(String username) {

		Visitor visitor = visitors.getOrDefault(username, new Visitor(username, 0));
		visitor.setHitcount(visitor.getHitcount() + 1);
		visitors.put(username, visitor);

		return visitor;
	}

}
