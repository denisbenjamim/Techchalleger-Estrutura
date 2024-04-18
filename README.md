# Techchallenger Estrutura

## Descrição
Projeto criado para auxiliar nas criações de techchallengers usados na Pós da Fiap de Arquitetura de Software com Java.

## Como Usar
Para adicionar a dependência do projeto `Techchallenger Estrutura` ao seu projeto Maven, adicione o seguinte código ao seu arquivo `pom.xml`:

```xml
<dependency>
    <groupId>br.com.fiap</groupId>
    <artifactId>estrutura</artifactId>
    <version>1.0.0</version>
</dependency>
```
importante salientar que existem duas dependencias que são no escopo provider(Necessário ter no projeto que irá utilizar Techallenger-Estrutura )
```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-web</artifactId>
    <version>6.1.5</version>
    <scope>provided</scope>
</dependency>
		
<dependency>
    <groupId>io.swagger.core.v3</groupId>
    <artifactId>swagger-annotations</artifactId>
    <version>2.2.21</version>
    <scope>provided</scope>
</dependency>
