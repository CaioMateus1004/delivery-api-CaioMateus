<h1 align="center">delivery-api-Caio Mateus</h1>

Projeto completo - Delivery Tech.

## 🚀 Tecnologias
- Java 21
- Spring Boot 3.5.5
- H2 Database
- Maven
- Git/Github
- Docker

## 📋 Funcionalidades
- Clientes
- Restaurantes
- Produtos
- Pedidos
- Entregas

## 📋 Endpoints
1. **Para usuários/clientes**
- GET    /api/clientes
- POST   /api/clientes
- GET    /api/clientes/{id}
- PUT    /api/clientes/{id}
- PATCH /api/clientes/{id}/status

2. **Para restaurantes**
- GET    /api/restaurantes
- POST   /api/restaurantes
- GET    /api/restaurantes/{id}
- PUT    /api/restaurantes/{id}
- GET    /api/restaurantes/categoria/{categoria}

3. **Para produtos**
- POST    /api/produtos
- PUT   /api/produtos/{id}
- PATCH    /api/produtos/{id}/disponibilidade
- GET /api/produtos/restaurante/{restauranteId}

4. **Para pedidos**
- POST   /api/pedidos


## 🔧 Configuração
- Porta: 8080
- Banco: H2 em memória
- Profile: development

## 🏃‍♂️ Instruções de execução
1. Ter instalado na máquina: Java 21, Maven, e o Docker
2. Abrir um terminal (cmd ou powershell), localizar o diretório da api: "/delivery", e executar o comando "mvn clean install"
3. Realizar os testes com o comando "mvn test"
4. Para acessar o relatório do Jacoco, usar o comando "mvn jacoco:report"
5. Para subir o monitoramento via docker, deve-se usar o comando "docker-compose -f monitoring" ou "docker-compose.yml up -d". Ou coso queira usar o Maven, o comando é "mvn spring-boot:run"
6. Abrir o navegador e na URL digitar "http://localhost:8080/"
7. Para acessar o swagger usar a URL "http://localhost:8080/swagger-ui/index.html"
8. Para encerrar a operação: No terminal, para o spring-boot, apertar Ctrl+C e confirmar o encerramento com um "S". Para o docker, no terminal, apertar Ctrl+C e envair o seguinte código "docker compose down"


## 👨‍💻 Desenvolvedor
Caio Mateus Paiva Gouveia - Arquitetura de Sistemas  
Desenvolvido com Java 21 e Spring Boot 3.5.5