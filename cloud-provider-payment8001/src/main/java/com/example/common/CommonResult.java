package com.example.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by JOCEAN on 2020/8/19.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

	private Integer code;

	private String message;

	private T data;

	public CommonResult(Integer code, String message) {
		this(code, message, null);
	}
}
