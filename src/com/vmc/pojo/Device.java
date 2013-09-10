package com.vmc.pojo;

/**
 * Device entity. @author MyEclipse Persistence Tools
 */
public class Device extends AbstractDevice implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Device() {
	}

	/** minimal constructor */
	public Device(String mac, Integer belong, Boolean isOnline) {
		super(mac, belong, isOnline);
	}

	/** full constructor */
	public Device(String mac, Integer belong, String peerId, Boolean isOnline) {
		super(mac, belong, peerId, isOnline);
	}

}
