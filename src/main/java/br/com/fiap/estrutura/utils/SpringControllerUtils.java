package br.com.fiap.estrutura.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.fiap.estrutura.exception.BusinessException;
import br.com.fiap.estrutura.exception.EntidadeNaoEncontrada;


public class SpringControllerUtils {
	/**
	 * Gerar ReponseEntity para Controllers, ja possui tratamento padrão de erros
	 * @param httpStatus enviado quando operação acontecer como esperado
	 * @param acao que deve ser executada
	 * @return ReponseEntity de acordo com o processamento gerado
	 */
	public static ResponseEntity<?> response(HttpStatus httpStatus, GerarResponse<?> acao){
    	try {
    		if(httpStatus == HttpStatus.NO_CONTENT) {
    			acao.get();
    			return ResponseEntity.noContent().build();
    		}
    		
            return ResponseEntity.status(httpStatus).body(acao.get());
        } catch (EntidadeNaoEncontrada e){
			return ResponseEntity
					.status(HttpStatus.NOT_FOUND)
					.body(MessageErrorHandler.create(e.getMessage()));
		}catch(BusinessException ex) {
        	return ResponseEntity
    			.status(HttpStatus.BAD_REQUEST)
				.body(MessageErrorHandler.create(ex.getMessage()));
	    } catch (Exception ex) {
	        return ResponseEntity
        		.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(MessageErrorHandler.create(ex.getMessage()));
	    }
    }
}
