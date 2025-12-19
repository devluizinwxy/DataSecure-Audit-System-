O DataSecure Audit System é um programa em Java desenvolvido para a empresa DataSecure Tech. O sistema processa arquivos de log volumosos para extrair informações críticas, filtrando eventos de interesse através de expressões regulares (Regex) e gerando relatórios especializados para as equipes de Finanças e Segurança.

🚀 Funcionalidades
O sistema realiza a leitura de um arquivo de log central (sistema.log) e divide a análise em duas frentes:

Auditoria Financeira: Identifica todas as movimentações que envolvem valores monetários (R$, USD ou $).

Auditoria de Segurança: Filtra eventos críticos como logins, tentativas de acesso, falhas de autenticação, erros e alertas de sistema.

🛠️ Tecnologias e Conceitos Utilizados
Este projeto foi construído utilizando recursos modernos do Java:

Java 17+: Uso de Sealed Interfaces para controle de hierarquia de classes.

Java NIO (Path/Files): Leitura e escrita de arquivos de forma eficiente.

Regex (Pattern/Matcher): Filtragem precisa de padrões de texto.

Programação Orientada a Objetos: Estrutura modular e escalável.

📋 Estrutura do Projeto
O core do sistema baseia-se na seguinte estrutura:

Auditoria (Sealed Interface): Define o contrato gerarRelatorio(String caminhoLog).

AuditoriaFinanceira: Implementação voltada para extração de dados financeiros.

AuditoriaDeSeguranca: Implementação voltada para monitoramento de segurança.

⚙️ Como Executar
Certifique-se de ter o JDK 17 ou superior instalado.

Clone o repositório:

Bash

git clone https://github.com/seu-usuario/datasecure-audit-system.git
Crie um arquivo chamado sistema.log na raiz do projeto e cole os dados de log fornecidos no desafio.

Compile e execute a classe principal:

Bash

javac Main.java
java Main
📊 Exemplo de Saída
Ao rodar o sistema, você verá no console um resumo da operação:

Relatório Financeiro Gerado Linhas encontradas: 7 Caminho: /Users/usuario/projeto/auditoria_financeira.txt

Relatório de Segurança Gerado Linhas encontradas: 12 Caminho: /Users/usuario/projeto/auditoria_seguranca.txt

Desenvolvido como parte de um desafio técnico de Java.
