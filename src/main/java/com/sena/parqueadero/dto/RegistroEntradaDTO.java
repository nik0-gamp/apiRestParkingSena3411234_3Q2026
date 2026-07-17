package com.sena.parqueadero.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegistroEntradaDTO {
	
	@NotBlank(message = "La placa es obligataria")
	private String placa;
}
