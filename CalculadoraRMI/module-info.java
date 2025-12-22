/**
 * 
 */
/**
 * 
 */
module Clase6JavaDAD1 {	//Su función es definir la configuración, dependencias y permisos de visibilidad de tu proyecto bajo el sistema de módulos de Java.
	
	requires java.rmi; //Declara una dependencia explícita. Permite que tu código pueda usar las clases del paquete "java.rmi".
	
	exports calculadora.servidor to java.rmi; 	//Realiza una exportación cualificada.
												//(exports calculadora.servidor)Hace visible el contenido de tu paquete "calculadora.servidor".
												//(to java.rmi)Restringe esa visibilidad exclusivamente al módulo del sistema "java.rmi".
	
}