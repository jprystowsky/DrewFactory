package io.mapping.examples.DrewFactory;

public class DrewFactory extends ParticularDeveloperFactory<Drew> {
	@Override
	public Developer getDeveloper() {
		return new Drew();
	}
}
