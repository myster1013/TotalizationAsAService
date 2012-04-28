package com.ynujc.totalization.jdo;

import java.io.Serializable;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@SuppressWarnings("serial")
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Score implements Serializable {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long scoreId;
	
	@Persistent
	private Hangchang hangchang;
	
	@Persistent
	private Jansi jansi;
	
	@Persistent
	private Integer score;

	public Long getScoreId() {
		return scoreId;
	}

	public void setScoreId(Long scoreId) {
		this.scoreId = scoreId;
	}

	public Hangchang getHangchang() {
		return hangchang;
	}

	public void setHangchang(Hangchang hangchang) {
		this.hangchang = hangchang;
	}

	public Jansi getJansi() {
		return jansi;
	}

	public void setJansi(Jansi jansi) {
		this.jansi = jansi;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	
	
}
