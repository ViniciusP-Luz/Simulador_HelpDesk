# Simulador HelpDesk 💻🎧

Um simulador interativo de HelpDesk focado em gerenciar, triar e solucionar chamados de suporte técnico de forma eficiente. Este projeto foi desenvolvido para demonstrar fluxos reais de atendimento, desde a abertura de um ticket até sua resolução, aplicando sólidas práticas de engenharia de software e regras de negócio de suporte.

## 🎯 O Problema que Resolve
Sistemas de HelpDesk são a espinha dorsal de qualquer operação de TI e suporte. Este simulador foi concebido para lidar com a dinâmica imprevisível do suporte técnico real, permitindo:
- **Ciclo de Vida de Chamados:** Gerenciamento do fluxo de estados (Aberto ➡️ Em Atendimento ➡️ Resolvido).
- **Gestão de Filas:** Estruturação de filas de atendimento para garantir respostas rápidas.
- **Priorização:** Aplicação de regras lógicas de triagem e prioridade baseadas na urgência do problema.

## 🚀 Funcionalidades Principais
- **Abertura de Tickets:** Criação de chamados com título, descrição, categoria e nível de urgência.
- **Distribuição de Atendimentos:** Organização inteligente de chamados aguardando atendimento por técnicos.
- **Painel de Resolução:** Interface/CLI para técnicos assumirem chamados, registrarem interações e finalizarem o atendimento.
- **Trilha de Auditoria (Logs):** Rastreamento de horários e ações tomadas em cada ticket.

## 🛠️ Tecnologias Utilizadas
- **Linguagem Principal:** Java
- **Conceitos Aplicados:** Programação Orientada a Objetos, Estruturas de Dados

## ⚙️ Como Executar o Projeto na sua Máquina

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/ViniciusP-Luz/Simulador_HelpDesk.git
   ```
2. **Navegue até o diretório do projeto:**
   ```bash
   cd Simulador_HelpDesk
   ```
3. **Execute a aplicação:**

   javac -d bin src/**/*.java
   java -cp bin Main
   ```
