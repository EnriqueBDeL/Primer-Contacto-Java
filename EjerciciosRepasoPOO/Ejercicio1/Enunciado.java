
/**

Ejercicio 1.1 (Modelado Avanzado de Entidades): 

Modele una clase
CuentaBancaria para un sistema de gestión bancaria. La clase debe encapsular el
estado de una cuenta y garantizar su integridad a través de su comportamiento,
aplicando las siguientes reglas de negocio:


○ Estado de Instancia (Atributos):

	■ numeroCuenta: Un identificador único de tipo String (ej: "CTA-0001").
	Este número debe ser generado automáticamente durante la creación
	del objeto y no debe poder ser modificado posteriormente.
	■ titular: String para el nombre del titular.
	■ saldo: double que representa el balance actual. Su acceso debe estar
	controlado estrictamente por los métodos de la clase.


○ Estado de Clase (Atributo Estático):

	■ Implemente un contador estático (private static int) que lleve la
	secuencia para la generación de los números de cuenta, asegurando
	que cada nueva instancia reciba un identificador único.



○ Comportamiento (Métodos):

	■ depositar(double monto): Incrementa el saldo. Debe incluir una
	validación para asegurar que el monto a depositar sea siempre un valor
	positivo.
	■ retirar(double monto): Decrementa el saldo. Debe validar que el monto
	sea positivo y que existan fondos suficientes para la operación. El
	método debe devolver un valor booleano: true si el retiro fue exitoso y
	false en caso contrario.
	■ getSaldo(): Devuelve el saldo actual.
	■ getNumeroCuenta() y getTitular(): Devuelven los datos
	correspondientes.

*/