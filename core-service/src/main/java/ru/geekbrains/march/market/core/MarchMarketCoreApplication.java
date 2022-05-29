package ru.geekbrains.march.market.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarchMarketCoreApplication {
	// [ СТАРОЕ, НЕ ИСПОЛЬЗОВАТЬ! ]Домашнее задание (9):
	// 1. Разобраться с кодом
	// 2. Добавьте необходимость указания адреса доставки и номера телефона при оформлении заказа
	// 3. Регистрация новых пользователей
	// 4. * Мерж корзин. После того как пользователь залогинился, необходимо на бэке смержить
	// гостевую и корзину пользователя

	// Домашнее задание (10):
	// 1. Разобраться с кодом
	// 2. Замените Page, который сейчас используется на тип PageDto (подумайте что в нем может быть)
	// 3. Исследовательская задача: Безопасность на gateway (либо реализация, либо предложения)
	// Например, пускать в карт-сервис только авторизованных пользователей

	// План действий:
	// 1. Подключение платежной системы / OAuth 2.0
	// 2. Безопасность на gateway
	// 3. Перевести WebClient в асинхронный режим
	// 4. Docker, WireMock, Swagger
	// 5. Поговорить про профили
	// 6. Структура проектов (апи)

	public static void main(String[] args) {
		SpringApplication.run(MarchMarketCoreApplication.class, args);
	}
}
