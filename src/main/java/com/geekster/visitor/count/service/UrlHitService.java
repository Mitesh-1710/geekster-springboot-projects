package com.geekster.visitor.count.service;

import org.springframework.stereotype.Service;

import com.geekster.visitor.count.model.Visitor;

@Service
public interface UrlHitService {

	public Integer getHitCount();

	public Visitor getHitCountByUsername(String username);

}
