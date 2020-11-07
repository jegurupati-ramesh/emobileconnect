package com.xyzmobile.emobileconnect.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

@MappedSuperclass
public abstract class AbstractBaseAuditEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5439743075529856067L;

	@Column(name = "created_by")
	private String createdBy;

	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@Column(name = "created_datetime", updatable = false)
	@CreationTimestamp
	private LocalDateTime createdDateTime;

	@Column(name = "updated_by")
	private String updatedBy;

	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@Column(name = "updated_datetime")
	@UpdateTimestamp
	private LocalDateTime updatedDateTime;

}
