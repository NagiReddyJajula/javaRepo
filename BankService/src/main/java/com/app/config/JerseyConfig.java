package com.app.config;

import org.glassfish.jersey.server.ResourceConfig;

import com.app.Testing;

//@Component
public class JerseyConfig extends ResourceConfig{
	
	public JerseyConfig() {
		register(Testing.class);
	}

}
