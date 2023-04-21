package com.geekster.visitor.count.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.visitor.count.model.Visitor;
import com.geekster.visitor.count.repository.UrlHitRepository;
import com.geekster.visitor.count.service.UrlHitService;

@Service
public class UrlHitServiceImpl implements UrlHitService {

	@Autowired
	private UrlHitRepository urlHitRepository;

	@Override
	public Integer getHitCount() {
		return urlHitRepository.getCount();
	}

	@Override
	public Visitor getHitCountByUsername(String username) {
		return urlHitRepository.getCountByUsernmae(username);
	}

}
