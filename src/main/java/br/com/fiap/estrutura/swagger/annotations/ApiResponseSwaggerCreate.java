package br.com.fiap.estrutura.swagger.annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import br.com.fiap.estrutura.swagger.annotations.responses.ApiResponseBadRequestJson;
import br.com.fiap.estrutura.swagger.annotations.responses.ApiResponseCreateJson;
import br.com.fiap.estrutura.swagger.annotations.responses.ApiResponseNotFoundJson;

@Retention(RUNTIME)
@Target({ METHOD })
@ApiResponseCreateJson
@ApiResponseNotFoundJson
@ApiResponseBadRequestJson
public @interface ApiResponseSwaggerCreate {}
