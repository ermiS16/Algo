package de.hska.iwi.ads.generics;

public class Cardbox<T> extends Box<T>{

	public Cardbox(int volume, T content) {
		super(volume, content);
	}

	@Override
	public int compareTo(Box<T> obj) {
		int ret = 0;
		if(obj.volume < this.volume) {
			ret = 1;
		}
		if(obj.volume > this.volume) {
			ret = -1;
		}
		if(obj.volume == this.volume) {
			ret = 0;
		}
		return ret;
	}

}
