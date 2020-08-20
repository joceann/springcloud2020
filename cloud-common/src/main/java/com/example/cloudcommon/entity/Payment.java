package com.example.cloudcommon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by JOCEAN on 2020/8/19.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	private Long id;
	private String serial;
}
