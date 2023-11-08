package com.bcv.cusg.entities;

import java.io.Serializable;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
// @NoArgsConstructor
// @AllArgsConstructor
public class Base implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// @Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	// private Long id;

}
