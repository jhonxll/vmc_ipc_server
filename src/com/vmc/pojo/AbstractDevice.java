package com.vmc.pojo;

/**
 * AbstractDevice entity provides the base persistence definition of the Device
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDevice implements java.io.Serializable {

	// Fields

	private Integer id;
	private String mac;
	private Integer belong;
	private String peerId;
	private Boolean isOnline;

	// Constructors

	/** default constructor */
	public AbstractDevice() {
	}

	/** minimal constructor */
	public AbstractDevice(String mac, Integer belong, Boolean isOnline) {
		this.mac = mac;
		this.belong = belong;
		this.isOnline = isOnline;
	}

	/** full constructor */
	public AbstractDevice(String mac, Integer belong, String peerId,
			Boolean isOnline) {
		this.mac = mac;
		this.belong = belong;
		this.peerId = peerId;
		this.isOnline = isOnline;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public Integer getBelong() {
		return this.belong;
	}

	public void setBelong(Integer belong) {
		this.belong = belong;
	}

	public String getPeerId() {
		return this.peerId;
	}

	public void setPeerId(String peerId) {
		this.peerId = peerId;
	}

	public Boolean getIsOnline() {
		return this.isOnline;
	}

	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
	}

}