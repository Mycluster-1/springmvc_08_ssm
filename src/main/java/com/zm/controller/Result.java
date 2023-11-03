package com.zm.controller;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class Result {
    private Integer code;
    private Object data;
    private String msg;
}
