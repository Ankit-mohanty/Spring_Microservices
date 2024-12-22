package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;


@Getter
@Setter
@ToString
@MappedSuperclass
// A mapped superclass is a Java class that acts as a base class for entities, but does not have its own table in the database.
public class BaseEntity {

	@Column(updatable = false)
	private LocalDateTime createdAt;
	@Column(updatable = false)
	private String createBy;
	@Column(insertable = false)
	private LocalDateTime updatedAt;
	@Column(insertable = false)
	private String updatedBy;
}
