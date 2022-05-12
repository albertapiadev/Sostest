package com.tapia.pruebaspring.services;

import org.springframework.stereotype.Service;

@Service
public class SistemaOperativoServiceMac implements SistemaOperativoService{

	@Override
	public String getNombre() {
		return "MacOS";
	}

	@Override
	public String getExtensionArchivos() {
		return ".app";
	}

	@Override
	public String getLibrerias() {
		return ".elf";
	}

}
