-- Insertar Cartas (Baraja Española de 40 cartas)
-- OROS
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (1, 'OROS', 11.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (2, 'OROS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (3, 'OROS', 10.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (4, 'OROS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (5, 'OROS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (6, 'OROS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (7, 'OROS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (8, 'OROS', 2.0); -- Sota
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (9, 'OROS', 3.0); -- Caballo
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (10, 'OROS', 4.0); -- Rey

-- COPAS
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (1, 'COPAS', 11.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (2, 'COPAS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (3, 'COPAS', 10.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (4, 'COPAS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (5, 'COPAS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (6, 'COPAS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (7, 'COPAS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (8, 'COPAS', 2.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (9, 'COPAS', 3.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (10, 'COPAS', 4.0);

-- BASTOS
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (1, 'BASTOS', 11.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (2, 'BASTOS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (3, 'BASTOS', 10.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (4, 'BASTOS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (5, 'BASTOS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (6, 'BASTOS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (7, 'BASTOS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (8, 'BASTOS', 2.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (9, 'BASTOS', 3.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (10, 'BASTOS', 4.0);

-- ESPADAS
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (1, 'ESPADAS', 11.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (2, 'ESPADAS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (3, 'ESPADAS', 10.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (4, 'ESPADAS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (5, 'ESPADAS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (6, 'ESPADAS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (7, 'ESPADAS', 0.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (8, 'ESPADAS', 2.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (9, 'ESPADAS', 3.0);
INSERT INTO cartas (numero_valido, palo, puntos_valor_juego) VALUES (10, 'ESPADAS', 4.0);

-- Insertar Jugadores
INSERT INTO jugadores (alias_jugador, saldo_fichas) VALUES ('Jugador1', 1000.0);
INSERT INTO jugadores (alias_jugador, saldo_fichas) VALUES ('Jugador2', 1500.0);
INSERT INTO jugadores (alias_jugador, saldo_fichas) VALUES ('Jugador3', 800.0);
INSERT INTO jugadores (alias_jugador, saldo_fichas) VALUES ('Jugador4', 2000.0);

-- Insertar Partida Histórico
INSERT INTO partidas_historico (fecha_hora_inicio, tipo_juego, bote_apostado) VALUES ('2023-10-27 15:30:00', 'BRISCA', 500.0);

-- Insertar Manos Jugadas (Ejemplo de una ronda con 4 jugadores)
-- Asumiendo que los IDs generados son 1, 2, 3, 4 para jugadores y 1 para la partida
-- Y usando algunas cartas (por ejemplo, los Ases: IDs 1, 11, 21, 31)
INSERT INTO manosjugadas (orden_turno, mano_ganadora, carta_id, jugador_id, partida_id) VALUES (1, false, 1, 1, 1);
INSERT INTO manosjugadas (orden_turno, mano_ganadora, carta_id, jugador_id, partida_id) VALUES (2, false, 11, 2, 1);
INSERT INTO manosjugadas (orden_turno, mano_ganadora, carta_id, jugador_id, partida_id) VALUES (3, true, 21, 3, 1); -- Supongamos que gana esta mano
INSERT INTO manosjugadas (orden_turno, mano_ganadora, carta_id, jugador_id, partida_id) VALUES (4, false, 31, 4, 1);
