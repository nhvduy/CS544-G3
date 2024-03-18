package edu.miu.cs.cs544.service.contract;

import lombok.Data;

import java.io.Serializable;

@Data
public class MemberPayload implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer memberId;

	private String name;

}
