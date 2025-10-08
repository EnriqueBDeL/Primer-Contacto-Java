/**

El propósito de estos ejercicios es asegurar la correcta inicialización de los objetos,
aplicando sobrecarga y encadenamiento de constructores para producir código limpio y
reutilizable.


● Ejercicio 2.1 (Sobrecarga de Constructores): Amplíe la clase CuentaBancaria para
ofrecer múltiples formas de inicialización. Implemente dos constructores:
	1. Un constructor que acepte únicamente el titular de la cuenta. Este constructor
	debe asignar un saldo inicial por defecto de 0.0.
	2. Un constructor principal que acepte tanto el titular como un saldoInicial. Este
	constructor debe contener la lógica para validar que el saldo inicial no sea
	negativo.
	Ambos constructores deben asegurarse de que se genere y asigne el
	numeroCuenta único utilizando el mecanismo estático definido previamente.
	
	
● Ejercicio 2.2 (Encadenamiento de Constructores): Refactorice los constructores
del ejercicio anterior para aplicar el principio DRY (Don't Repeat Yourself). El
constructor que solo recibe el titular debe invocar, mediante this(), al constructor
principal (que recibe titular y saldo), pasándole el saldo por defecto de 0.0. De esta
forma, la lógica de validación del saldo y la asignación de todos los atributos se
centraliza en un único lugar.


*/