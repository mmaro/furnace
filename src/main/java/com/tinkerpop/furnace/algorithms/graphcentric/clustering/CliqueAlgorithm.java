package com.tinkerpop.furnace.algorithms.graphcentric.clustering;

import java.util.Set;

import com.tinkerpop.blueprints.Vertex;

public interface CliqueAlgorithm {
	public Set<Set<Vertex>> findAllMaximalCliques();
}