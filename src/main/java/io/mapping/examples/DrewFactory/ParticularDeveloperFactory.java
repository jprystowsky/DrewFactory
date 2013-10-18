package io.mapping.examples.DrewFactory;

public abstract class ParticularDeveloperFactory<T extends Developer> {
	public abstract <T extends Developer> T getDeveloper();
}
