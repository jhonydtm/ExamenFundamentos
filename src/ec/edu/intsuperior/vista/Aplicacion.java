/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author jhony
 */
public class Aplicacion {
    public static void main(String[] args) {
        iniciosecion();
    }
    public static void adivinaelnumero() {
        Scanner scanner = new Scanner(System.in);
    int numeroAleatorio;
    int intento;
    int contador = 10;
    // Obtención de número aleatorio
    numeroAleatorio = (int) (Math.random()*100+1);
    System.out.println("Intenta adivinar un número aleatorio entre el 1 y 100. "
        + "Tienes 10 intentos.");
    System.out.println(numeroAleatorio);
    // Realización del ciclo do-while
    do {
      System.out.println("Número contador: " + contador);
      System.out.print("Introduce el número que creas posible: ");
      intento = scanner.nextInt();
      if (intento > numeroAleatorio) {
        System.out.println("El número que buscas es menor, te quedan "
            + (contador-1) + " intentos: ");
      } else if (intento < numeroAleatorio){
        System.out.println("El número que buscas es mayor, te quedan "
            + (contador-1) + " intentos: ");
      } else {
        System.out.print("¡CORRECTO! "+ numeroAleatorio + " era el número que estabas "
            + "buscando, has necesitado " + (10 - (contador-1)) +" intentos.");
      }
      contador--;
    } while (intento != numeroAleatorio && contador > 0);
    if (contador == 0) {
      System.out.println("Has perdido. El numero aleatorio era " + numeroAleatorio);
    }
  }
    public static void potencias() {
        Scanner scanner = new Scanner(System.in);
    double base;
    int exponente;
    double resultado;
    // Inicio del programa, explicación al usuario
    System.out.println("El programa solicitará un número real como base y el exponente "
        + "(entero positivo) para calcular una potencia.");
    // Pedimos datos al usuario
    System.out.print("Introduce la base de la potencia: ");
    base = scanner.nextDouble();
    do {
      System.out.print("Introduce el exponente (entero positivo) de la potencia: ");
      exponente = scanner.nextInt();
      if (exponente <= 0) {
        System.out.println("Error, el exponente debe ser un entero positivo.");
      }
    } while (exponente <= 0);
    resultado = base;
    // Realizamos bucle para repetir la multiplicación de la base consigo misma hasta obtener el resultado de la potencia.
    for (int i=1; i<exponente;i++){
      resultado = (resultado*base);
    }
    // Mostramos el resultado
    System.out.println("El resultado de la potencia es " + resultado);
  }
    public static void areacuadrado() {
         Scanner entrada= new Scanner(System.in);
        double lado ;
        double area;
        double per;
        System.out.println("Escribe cuanto mide un lado de el cuadrado");
        lado= entrada.nextDouble();
        area=lado*lado;
        per= (lado+lado+lado+lado);
        System.out.println("El area del cuadrado es: "+area);
        System.out.println("El area del cuadrado es: "+per);
    }
    public static void calculodecuotas() {
          Scanner scanner = new Scanner(System.in);
    double cuota;
    int mensualidades;
    double totalPagado = 0;
// Inicio del programa, explicación al usuario
    System.out.println("El programa calcula la cuota correspondiente al pago mensual y el total a pagar al final de la financiación  por la compra de un producto.");
// Pedimos datos al usuario
    System.out.print("Introduce la primera cuota a pagar: ");
    cuota = scanner.nextDouble();
    System.out.print("Introduce el número de meses de financiación: ");
    mensualidades = scanner.nextInt();
    
    for (int i=1; i <= mensualidades; i++){
      System.out.println("Cuota "+ i +": "+ cuota);
      totalPagado = totalPagado + cuota;
      cuota = cuota*2;
    } 
// Mostramos el resultado
    System.out.println("Total pagado por el producto: " + (int)totalPagado);
  }
    public static void intervalos() {
      Scanner scanner = new Scanner(System.in);
    int inferior;
    int superior;
    int numero;
    int suma = 0;
    int contador = 0;
    boolean esLimite = false;
    // Inicio del programa, explicación al usuario
    System.out.println("El programa solicitará un límite inferior y superior de intervalo.");
    System.out.println("Después pedirá la introducción de números a analizar, para finalizar "
        + "de introducir números, pulsa 0");
    System.out.println("Mostrará la siguiente información: ");
    System.out.println("Suma de los números que están dentro del intervalo");
    System.out.println("Cuantos números están fuera del intervalo");
    System.out.println("Si se ha introducido alguno de los números que marcan los límites "
        + "de los intervalos");
    // Pedimos límites al usuario
    do {
      System.out.print("Introduce el límite inferior: ");
      inferior = scanner.nextInt();
      System.out.print("Introduce el límite superior: ");
      superior = scanner.nextInt();
      if (inferior > superior) {
        System.out.println("Error, el límite inferior debe ser que el superior. "
            + "Revisa los valores introducidos.");
      }
    } while (inferior > superior);
    
    // Pedimos al usuario insertar números
    do {
      System.out.println("Introduce un número: ");
      numero = scanner.nextInt();
      
      if (numero != 0) {
        if (numero > inferior && numero < superior) {
          suma += numero;
        } else if (numero <= inferior || numero >= superior) {
          contador++;
        }
        if (numero == inferior || numero == superior) {
          esLimite = true;
        }
      } 
    } while (numero != 0);
    
    // Al introducir 0, mostramos resultados
    System.out.println("El valor de la suma de los números introducidos en el rango " + inferior +"-" +superior +" es de " +suma);
    System.out.println("Se han introducido un total de " + contador + " números fuera del intervalo " + inferior+"-"+superior);
    if (esLimite){
      System.out.println("Alguno de los valores introducidos ha coincidido con alguno de los límites del intervalo");
    } else {
      System.out.println("No se ha introducido ningún valor igual a los límites del intervalo");
    }
  }
    public static void sonvocalesono(){ 
       Scanner scanner = new Scanner(System.in);
    String cadena;
    int longitud;
    char caracter;
    boolean vocal = true;
// Solicitud de datos al usuario
    System.out.println("El programa analizará si los carácteres son vocales o no.");
    System.out.print("Introduce los carácteres a analizar, en caso de querer terminar "
        + "el programa, introduce un espacio: ");
    cadena = scanner.nextLine();
    while (!cadena.equals(" ")){
      longitud = cadena.length();
      for (int i=0;(i < longitud);i++){
        caracter = cadena.toUpperCase().charAt(i);
        if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
          vocal = true;
        } else {
          vocal =false;
          cadena = " ";
          break;
        }
      }
      if (vocal){
        System.out.println("Los carácteres son VOCALES.");
       } else {
         System.out.println("Los carácteres NO SON VOCALES");
       }
      System.out.print("Introduce nuevos carácteres a analizar, en caso de querer terminar "
          + "el programa, introduce un espacio: ");
      cadena = scanner.nextLine(); 
     }
    System.out.println("FIN DEL PROGRAMA");
  }
    public static void meses() {
      Scanner sc = new Scanner(System.in);         
      int mes;         
      System.out.print("Introduzca número de mes: ");         
      mes =  sc.nextInt();        
      if(mes < 1 || mes > 12) //se comprueba que el valor del mes es correcto  
          System.out.println("Mes incorrecto");         
      else{  //si el mes es correcto           
          switch(mes){  //se muestra el nombre mediante una instrucción switch                
              case 1: System.out.print("Enero");                        
              break;                 
              case 2: System.out.print("Febrero");                         
              break;                 
              case 3: System.out.print("Marzo");                         
              break;                 
              case 4: System.out.print("Abril");                         
              break;                 
              case 5: System.out.print("Mayo");                         
              break;                 
              case 6: System.out.print("Junio");                         
              break;                 
              case 7: System.out.print("Julio");                         
              break;                
              case 8: System.out.print("Agosto");                         
              break;                 
              case 9: System.out.print("Septiembre");                         
              break;                 
              case 10: System.out.print("Octubre");                         
              break;                 
              case 11: System.out.print("Noviembre");                         
              break;                 
              case 12: System.out.print("Diciembre");                         
              break;  }             
// mostrar si es un mes de 30, 31 0 28 días             
          if(mes == 4 || mes == 6 || mes == 9 || mes == 11)                       
              System.out.println(" es un mes de 30 días"); 
          else if(mes == 2)                      
              System.out.println(" es un mes de 28 días");                    
          else                       
              System.out.println(" es un mes de 31 días");        
      }     
  }
    public static void hora () {
     int H,M,S;
     Scanner sc = new Scanner(System.in); 
     System.out.print("Introduzca hora: ");
      H =  sc.nextInt();
      System.out.print("Introduzca minutos: ");
      M =  sc.nextInt();
      System.out.print("Introduzca segundos: "); 
      S =  sc.nextInt();
      if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60) 
          System.out.println("Hora correcta");
      else
          System.out.println("Hora incorrecta");   
 }
    public static void division() {
      Scanner sc = new Scanner(System.in);         
double dividendo, divisor;         
System.out.print("Introduzca el dividendo: ");         
dividendo = sc.nextDouble();         
 System.out.print("Introduzca el divisor: ");         
divisor = sc.nextDouble();         
 if(divisor==0)            
System.out.println("No se puede dividir por cero");             
else{             
System.out.println(dividendo + " / " + divisor + " = " + dividendo/divisor); 
System.out.printf("%.2f / %.2f = %.2f %n" , dividendo, divisor , dividendo/divisor);         
}
  }
    public static void numerodelasuerte() {
     Scanner sc = new Scanner(System.in);         
int dia, mes, año, suerte, suma, cifra1, cifra2, cifra3, cifra4;         
System.out.println("Introduzca fecha de nacimiento");         
System.out.print("día: ");         
dia = sc.nextInt();
System.out.print("mes: ");         
mes = sc.nextInt();         
System.out.print("año: ");         
año = sc.nextInt();         
suma = dia + mes + año;         
cifra1 = suma/1000;      //obtiene la primera cifra         
cifra2 = suma/100%10;  //obtiene la segunda cifra         
cifra3 = suma/10%10;   //obtiene la tercera cifra         
cifra4 = suma%10;        //obtiene la última cifra         
suerte = cifra1 + cifra2 + cifra3 + cifra4;         
System.out.println("Su número de la suerte es: " + suerte);     
}
    public static void longitudtriangulo() {
      Scanner sc = new Scanner(System.in);         
double a,b,c,p;         
System.out.print("Introduzca longitud del primer lado del triángulo: ");         
a = sc.nextDouble();         
System.out.print("Introduzca longitud del segundo lado del triángulo: ");         
b = sc.nextDouble();         
System.out.print("Introduzca longitud del tercer lado del triángulo: ");         
c = sc.nextDouble();         
p = (a+b+c)/2;     
System.out.println("Area -> " +  Math.sqrt(p*(p-a)*(p-b)*(p-c)));     
}
    public static void velocidad() {
      Scanner sc = new Scanner(System.in);         
double velocidad;         
System.out.println("Introduzca velocidad en Km/h: ");        
 velocidad = sc.nextDouble();      
 System.out.println(velocidad + " Km/h -> " + velocidad*1000/3600 + " m/s");
 }
    public static void gradoscentigrados() {
      Scanner sc = new Scanner(System.in);       
double gradosC, gradosF;      
 System.out.println("Introduce grados Centígrados:");       
gradosC = sc.nextDouble();      
 gradosF = 32 + (9 * gradosC / 5);       
System.out.println(gradosC +" ºC = " + gradosF + " ºF"); 
  }
    public static void diagramadeflujo() {
     Scanner teclado = new Scanner(System.in);
String tema = "tema";
System.out.println("¿ Sabes del tema ? di si o no ");
tema = teclado.nextLine();
tema = tema.toLowerCase();// esto es para si no lo escribe en minuscula que lo recoja igualmente
if (tema.equals("si")) {// esto es verdadero que ha introducido un si
System.out.println("Estas informado puedes hablar.");// se imprime
} else if (tema.equals("no")) {// si verdadero es no
do {// todo esto es para que mientras no estes informado te lo este imprimiendo
System.out.println(" No sabes mejor te informas");// entrará por aqui
System.out.println("¿ Ya estas informado ? Si o No ");
tema = teclado.nextLine();
tema = tema.toLowerCase();
} while (tema.equals("no"));
System.out.println("Estas informado puedes hablar.");// cuando despues del no pongas un si te escriba este
}
}
    public static void notas() {
   int nota=0;
Scanner scanner = new Scanner(System.in);
System.out.println("Introduce la nota: ");
nota = scanner.nextInt();	
switch (nota) {
case 5:
System.out.println("Suficiente");
break; // break evita que se ejecuten los siguientes casos
case 6:
System.out.println("Bien");
break;
case 7:
System.out.println("Notable bajo");
break;
case 8:
System.out.println("Notable alto");
break;
case 9:
System.out.println("Sobresaliente");
break;
case 10:
System.out.println("Matricula de honor");
break;
default:
if(nota<5) System.out.println("Suspenso");
else System.out.println("Notaza");		
}
 }
    public static void Matricula() {
     String nombre,facultad;
        double importe=0,mensualidad=0,igv=0,mfinal=0,matricula=0;
        Scanner entrada=new Scanner(System.in);

        System.out.print("Ingrese nombre de postulante: ");
        nombre=entrada.next();
        System.out.print("Ingrese Facultad: ");
        facultad=entrada.next();

        switch(facultad){
            case "sistemas":
            case "SISTEMAS":
                  matricula = 350;
                  mensualidad= 650;
                  break;
            case "derecho":
                  matricula=300;
                  mensualidad=550;
                  break;
            case "Ing.Sistemas":
                  matricula=300;
                  mensualidad=500;
                  break;
            case "Medicina":
                  matricula=310;
                  mensualidad=460;
                  break;
            case "contabilidad":
                  matricula=280;
                  mensualidad=490;
                  break;
            case "administracion":
                  matricula=360;
                  mensualidad=520;
                  break;
            default:
                  System.out.println("La Facultad ingresado no es correcto");
                  System.exit(0);
        }
             igv= 0.18 * (matricula + mensualidad);
             mfinal= matricula + mensualidad + igv;

             System.out.println("La matricula es: " + matricula);
             System.out.println("La mensualidad es: " + mensualidad);
             System.out.println("El IGV es: " + igv);
             System.out.println("El Monto Final es: " + mfinal);
    }
    public static void cajerosutomatico() {
     final int saldo_inicial=1000;
        int opcion;
        double ingreso,saldoActual,retiro;
        Scanner entrada=new Scanner(System.in);

        System.out.println("1. Ingresar dinero a la cuenta");
        System.out.println("2. Retirar dinero de la cuenta.");
        System.out.println("3. Salir"); 
        
        System.out.print("Ingresar un numero:");
        opcion=entrada.nextInt();

        switch(opcion){
            case 1 :
                System.out.println("Digite la cantidad que desea ingresar en cuenta: ");
                ingreso=entrada.nextDouble();
                saldoActual=saldo_inicial+ingreso;
                System.out.println("El saldo Actual es: " + saldoActual);
                break;
            case 2 :
                System.out.print("Digite la cantidad que desea retirar: ");
                retiro=entrada.nextDouble();
                if(retiro<=saldo_inicial){
                saldoActual=saldo_inicial-retiro;
                System.out.println("Dinero en cuenta: "+saldoActual);
                }
                else{
                System.out.println("No cuenta con el saldo suficiente");
                }
                break;
            case 3:
                break;
          }    
      }
    public static void TiendaMorales() {
       String dia;
   double monto_compra,descuento, total1, total2;
   Scanner entrada= new Scanner (System.in);

    System.out.print("Ingrese el monto de compra: ");
    monto_compra=entrada.nextInt();
    System.out.print("Ingrese el dia de semana: ");
    dia=entrada.next();
    
    descuento= 0.15*monto_compra;
    total1 = monto_compra - descuento;
    total2=monto_compra;

    if(dia.equals("martes")||dia.equals("jueves")){
        System.out.println("El Descuento es: "+ descuento);
        System.out.println("El total es: " + total1);
    }
    else{
        System.out.println("El total es: " + total2);
    }
   } 
    public static void descuentofarmacias() {
     double valor, descuento, recargo,total;
    String tipo_pago;
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Ingrese el valor de la compra: ");
    valor = entrada.nextDouble();
    System.out.print("Ingrese tipo de pago: ");
    tipo_pago=entrada.next();
    descuento=0.05*valor;
    recargo=0.03*valor;
    
    if(tipo_pago.equalsIgnoreCase("contado")){
        System.out.println("El descuento es: " + descuento);
        total= valor - descuento;
        System.out.println("El total es: " + total);
    }
    else{
        System.out.println("El recargo es: " + recargo);
        total=valor + recargo;
        System.out.println("El total es: " + total);
    }
   } 
    public static void iniciosecion() {
      String nombre,clave;
   Scanner entrada = new Scanner(System.in);

    System.out.print("Ingrese Nombre de usuario: ");
    nombre = entrada.nextLine();
    System.out.print("Ingrese Clave de usuario: ");
    clave = entrada.nextLine();

        if(nombre.equals("Jhony") && clave.equals("1728202670")){
        System.out.println("Bienvenido al Sistema");
        }
        else{
        System.out.println("Nombre de Usuario o contraseña Incorrecto");
        }
      } 
    
}
