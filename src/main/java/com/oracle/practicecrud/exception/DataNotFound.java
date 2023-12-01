package com.oracle.practicecrud.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataNotFound extends RuntimeException {

	String message = "data not found";
}
