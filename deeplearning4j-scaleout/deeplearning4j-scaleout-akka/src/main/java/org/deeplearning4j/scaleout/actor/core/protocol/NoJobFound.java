package org.deeplearning4j.scaleout.actor.core.protocol;

import java.io.Serializable;

public class NoJobFound implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -255981063702179949L;
	private static NoJobFound INSTANCE = new NoJobFound();
	
	
	private NoJobFound()	{}
	
	public static NoJobFound getInstance() {
		return INSTANCE;
	}

}
