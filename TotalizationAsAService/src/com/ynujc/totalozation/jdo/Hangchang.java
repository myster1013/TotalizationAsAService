package com.ynujc.totalozation.jdo;

import java.io.Serializable;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.Element;

@SuppressWarnings("serial")
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Hangchang implements Serializable{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long hangchangId;
	
	@Persistent(mappedBy="hangchang")
	@Element(dependent="true")
	private List<Score> scores;

	public Long getHangchangId() {
		return hangchangId;
	}

	public void setHangchangId(Long hangchangId) {
		this.hangchangId = hangchangId;
	}

	public List<Score> getScores() {
		return scores;
	}

	public void setScores(List<Score> scores) {
		this.scores = scores;
	}
}
