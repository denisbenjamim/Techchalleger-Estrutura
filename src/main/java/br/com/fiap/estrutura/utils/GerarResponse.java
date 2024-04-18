package br.com.fiap.estrutura.utils;

import br.com.fiap.estrutura.exception.BusinessException;

@FunctionalInterface
public interface GerarResponse<T> {

	T get() throws BusinessException;
}
