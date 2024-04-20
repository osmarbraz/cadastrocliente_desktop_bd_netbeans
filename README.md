# Sistema de Cadastro de Clientes para Desktop em Banco de Dados MySQL utilizando o padrão Factory Method para a IDE NetBeans.

## Contextualização

 - Está é uma versão do sistema para a IDE NetBeans.<br> 
 - O projeto no NetBeans deve ser chamado cadastrocliente_desktop_bd_netbeans.<br>
 - Este programa possui diversas classes organizada nos pacotes visão, modelo e dao.<br>
 - Utiliza o padrão factory method para facilitar o acesso aos dados do MySQL.
 - Toda iteração com banco de dados é tratada diretamente pelo DAO(Data Access Object).<br>
 - Os dados de configuração(Servidor, Database, Usuario, Senha) da integração do java com o banco de dados estão no arquivo src/DadosBanco.java.<br>
 - Crie o banco de dados antes de executar o projeto, as especificações das tabelas estão no arquivo banco_mysql.sql.<br>
 - A pasta src contêm os fontes do projeto e na pasta  lib o driver jdbc para MySQL.<br>

## Arquivos

- *.sql - Script do banco de daddos.
- pom.xml - Arquivo de configurção da ferramenta de automação Maven.