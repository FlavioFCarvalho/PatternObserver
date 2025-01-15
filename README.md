O Observer Pattern (Padrão de Observador) define uma dependência um-para-muitos entre objetos, onde quando um objeto (sujeito) muda de estado, todos os seus dependentes (observadores) são notificados automaticamente. É amplamente usado em sistemas de eventos.

# Contexto: Sistema de Notificação de Estoque
Imagine um sistema de monitoramento de estoque em um e-commerce. Quando o estoque de um produto atinge um limite crítico, o sistema deve:

Enviar um email para o gerente.
Registrar a baixa no log.
Exibir um alerta no painel de controle.

# Explicação
Observer (Observador): Interface que define o método update(String message) para receber notificações.
- StockSubject (Sujeito):
Possui uma lista de observadores.
Notifica os observadores quando o estoque atinge um limite crítico.
- EmailObserver, LogObserver, DashboardObserver:
Observadores que implementam a interface Observer e executam ações específicas ao receber uma atualização.
- Main:
Cria o StockSubject e adiciona observadores.
Reduz o estoque e dispara notificações quando a quantidade chega ao limite.
