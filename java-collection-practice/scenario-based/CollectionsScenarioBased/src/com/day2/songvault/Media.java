package com.day2.songvault;

public class Media<T> {

	private T mediaType;

	public Media(T mediaType) {
		this.mediaType = mediaType;
	}

	public T getMediaType() {
		return mediaType;
	}
}