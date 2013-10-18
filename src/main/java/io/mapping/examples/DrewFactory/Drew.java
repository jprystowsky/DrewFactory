package io.mapping.examples.DrewFactory;

public class Drew implements Developer {
	private Boolean mHired;

	@Override
	public void setHired(Boolean hired) {
		this.mHired = hired;
	}

	public Boolean getHired() {
		return this.mHired;
	}
}
