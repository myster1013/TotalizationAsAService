package com.ynujc.totalization.jdo;

import java.io.Serializable;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@SuppressWarnings("serial")
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Jansi implements Serializable {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key jansiId;

	@Persistent
	private String jansiFirstNameKana;

	@Persistent
	private String jansiFamilyNameKana;
	
	@Persistent
	private String jansiNickName;

	@Persistent
	private Integer year;
	
	@Persistent
	private String comment;

	public Jansi(Key jansiId){
		this.jansiId = jansiId;
	}

	public void setJansiId(Key jansiId) {
		this.jansiId = jansiId;
	}

	public Key getJansiId() {
		return jansiId;
	}

	public void setJansiFirstNameKana(String jansiFirstNameKana) {
		this.jansiFirstNameKana = jansiFirstNameKana;
	}

	public String getJansiFirstNameKana() {
		return jansiFirstNameKana;
	}

	public void setJansiFamilyNameKana(String jansiFamilyNameKana) {
		this.jansiFamilyNameKana = jansiFamilyNameKana;
	}

	public String getJansiFamilyNameKana() {
		return jansiFamilyNameKana;
	}
	
	public String getJansiNickName() {
		return jansiNickName;
	}

	public void setJansiNickName(String jansiNickName) {
		this.jansiNickName = jansiNickName;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
