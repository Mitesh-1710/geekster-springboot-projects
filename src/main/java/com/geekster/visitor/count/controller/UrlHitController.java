package com.geekster.visitor.count.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.visitor.count.constants.ApiPath;
import com.geekster.visitor.count.model.Visitor;
import com.geekster.visitor.count.response.GetHitCountResponse;
import com.geekster.visitor.count.service.UrlHitService;

@RestController
@RequestMapping(ApiPath.BASE_URL)
public class UrlHitController {

	@Autowired
	private UrlHitService urlHitService;

	@GetMapping(ApiPath.GET_VISITOR_COUNT_API)
	public GetHitCountResponse getHitCount() {
		return new GetHitCountResponse(urlHitService.getHitCount());
	}

	@GetMapping(ApiPath.GET_HIT_COUNT_BY_USERNAME_API)
	public Visitor getHitCountByUsername(@PathVariable String username) {
		return urlHitService.getHitCountByUsername(username);
	}
}
