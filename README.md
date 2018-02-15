# jwt-exemplo

Projeto Spring Boot piloto com autenticação jwt.

### Detalhes
client_id:jwtclientid
client_secret:XY7kmzoNzl100

usuário:
  username=admin.admin; senha=jwtpass (ADMIN)
  
  username=john.doe; senha=jwtpass (STANDARD_USER)

# Executar com curl
```sh
  $ curl jwtclientid:XY7kmzoNzl100@localhost:8080/oauth/token -d grant_type=password -d username=john.doe -d password=jwtpass
```

# Requisição post

Criptografar client_id:client_server com base64:

jwtclientid:XY7kmzoNzl100 = and0Y2xpZW50aWQ6WFk3a216b056bDEwMA==
  
### Header:
```sh
Content-Type : application/x-www-form-urlencoded
Accept : application/json
Authorization : Basic and0Y2xpZW50aWQ6WFk3a216b056bDEwMA==
```
### Body:
```sh
grant_type : password
username : john.doe
password : jwtpass
```

# Referência
[Secure a Spring Boot REST API With JSON Web Token + Reference to Angular Integration](https://medium.com/@nydiarra/secure-a-spring-boot-rest-api-with-json-web-token-reference-to-angular-integration-e57a25806c50)
