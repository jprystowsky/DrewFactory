package io.mapping.examples.DrewFactory;

public abstract class ParticularDeveloperFactory<T extends Developer> {
	public abstract Developer getDeveloper();
}
