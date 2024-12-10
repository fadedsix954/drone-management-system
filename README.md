Controle de Manutenção de Drones
O que é esse programa?
É um sistema pra gerenciar drones e manter tudo em dia. Com ele, dá pra:

Cadastrar drones: Registre os dados básicos dos drones.
Agendar manutenções: Planeje revisões e garanta que tudo esteja funcionando.
Ver o histórico de revisões: Veja tudo o que já foi feito em cada drone.
Ah, e tudo isso acontece em tempo real! Ou seja, o cliente e o servidor se comunicam via RabbitMQ/Kafka, garantindo que tudo seja atualizado na hora.

Como rodar o projeto?
Aqui vai um passo a passo bem direto pra você, professor, rodar o sistema:

1. Pré-requisitos
Java JDK 17 ou superior instalado.
PostgreSQL rodando e configurado.
RabbitMQ ou Kafka funcionando (use RabbitMQ pra simplificar, tá tudo configurado no projeto pra ele).
Maven configurado no seu computador.

3. Configurar o banco de dados
Abra o PostgreSQL e crie um banco chamado controle_drones.
Vá no arquivo application.properties dentro de src/main/resources e edite as linhas:
properties
spring.datasource.url=jdbc:postgresql://localhost:5432/controle_drones
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
As tabelas vão ser criadas automaticamente na primeira vez que rodar o projeto.

5. Subir o RabbitMQ
Inicie o serviço do RabbitMQ (instale se não tiver).
Não precisa configurar nada extra, o projeto já usa os padrões:
Usuário: guest
Senha: guest

6. Rodar o backend
Abra um terminal na pasta do projeto.
Rode o comando:
mvn spring-boot:run
O backend vai iniciar e estará disponível em http://localhost:8080.

7. Testar o sistema
Use uma ferramenta como o Postman ou o cliente JavaFX que foi preparado (se quiser rodar ele):

Cadastrar um drone: Faça uma requisição POST para http://localhost:8080/drones.
Agendar uma manutenção: Use POST em http://localhost:8080/manutencoes.
Consultar histórico: Use GET em http://localhost:8080/manutencoes.
Como o professor pode testar?
Rode o backend com o comando mvn spring-boot:run.
Use um cliente como Postman ou o JavaFX pra acessar as funcionalidades.
Teste o CRUD: cadastrar drones, agendar manutenções e consultar histórico.
Verifique que as atualizações são refletidas no banco em tempo real.
