package br.com.fiap.estrutura.swagger.annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import br.com.fiap.estrutura.swagger.annotations.responses.ApiResponseBadRequestJson;
import br.com.fiap.estrutura.swagger.annotations.responses.ApiResponseNoContentJson;
import br.com.fiap.estrutura.swagger.annotations.responses.ApiResponseNotFoundJson;

@Retention(RUNTIME)
@Target({ METHOD })
@ApiResponseNoContentJson
@ApiResponseNotFoundJson
@ApiResponseBadRequestJson
public @interface ApiResponseSwaggerNoContent {}
