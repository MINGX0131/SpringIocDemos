package com.ming.ioc.dependencies.dependencyinjection.service;

public class SimpleMovieFinder implements MovieFinder {

    

	@Override
	public String findMovies() {
		return "Finding movies using SimpleMovieFinder...";		
	}
}