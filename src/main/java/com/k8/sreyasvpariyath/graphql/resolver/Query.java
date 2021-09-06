package com.k8.sreyasvpariyath.graphql.resolver;

import static com.k8.sreyasvpariyath.constants.Constants.VERSION;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {

	public String info() {
		return VERSION;
	}

}
