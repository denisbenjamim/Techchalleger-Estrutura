package br.com.fiap.estrutura.swagger.annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import br.com.fiap.estrutura.swagger.annotations.responses.ApiResponseBadRequestJson;
import br.com.fiap.estrutura.swagger.annotations.responses.ApiResponseNotFoundJson;
import br.com.fiap.estrutura.swagger.annotations.responses.ApiResponseOkJson;

@Retention(RUNTIME)
@Target({ METHOD })
@ApiResponseOkJson
@ApiResponseNotFoundJson
@ApiResponseBadRequestJson
public @interface ApiResponseSwaggerOk {}
