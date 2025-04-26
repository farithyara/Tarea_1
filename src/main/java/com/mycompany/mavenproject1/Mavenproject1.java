package com.mycompany.mavenproject1;
import java.util.Scanner;//Se importa la libreria scanner para el ingreso de los datos por consola
public class Mavenproject1 {
    public static void main(String[] args) {
      /*1)Escribir un programa en Java que imprima por pantalla la frase “Hola, ya se
          imprimir frases”.*/
        System.out.println("Hello World!");//Se utilza la impresión basica en consola para esto
      /*2.Escribir un programa en Java que imprima por pantalla un número entero, por
        ejemplo el 273, o el 597.*/  
        int x1 = 273;//Declaramos las variables en valores enteros
        int x2 = 579;
        System.out.println(x1+" o "+x2);//Se imprimen en pantalla
      /*3.Escribir un programa en Java que imprima por pantalla un número decimal, por
        ejemplo el 5’3, ó el 7’5.*/  
        float x3 = 5.3F;//Declaramos las variables como valor flotante
        float x4 = 7.5F;//Notese la colocación de F al lado del numero para el formato de la misma
        System.out.println(x3+" o "+x4 );//Se imprimen de igual manera por consola 
      /*4.Escribir un programa en Java que imprima por pantalla la suma de 1234 y 532.*/ 
        int suma = 1234+532;//Defini al momento de inicializar la variable para reducir el proceso al ser numeros enteros basicos se opto por un int y la suma se define de manera basica entre dos variables numericas con el simbolo "+"
        System.out.println("El Resultado de la suma es: "+suma);
      /*5.Escribir un programa en Java que imprima por pantalla la resta de 1234 y 532.*/  
        int resta = 1234-532;//Se definio la resta con `-` teniendo en cuenta lo mismo ya mencionado
        System.out.println("El Resultado de la resta es: "+resta);
      /*6.Escribir un programa en Java que imprima por pantalla la multiplicación de 1234 y 532.*/  
        int multiplicacion = 1234*532;//Se definio la multiplicación con `*` teniendo en cuenta lo mismo ya mencionado
        System.out.println("El Resultado de la multiplicaciòn es: "+multiplicacion);
      /*7.Escribir un programa en Java que imprima por pantalla la división de 1234 entre 532.*/  
        float division = 1234.0F/532;//Con la división toca te3ner un cuidado especial y es al menows una de las dos variables tiene que ser de un valor decimal para obtener una división completa si no tomara unicamente su valore completo yt para sacar el modulo se harà por aparte
        System.out.println("El Resultado de la divisiòn es: "+division);
      /*8.Escribir un programa en Java que imprima por pantalla los números del 1 al 3.*/  
        for(int i=1;i<=3;i++){//Si bien se podia escrbir de manera textual con 3 valores de baja longitud no decimal o en un arreglo basico
            System.out.print(i+" ");}//Se opto por usar un ciclo dada la facilidad que esste permite inicialido en uno con aumento 1 a 1 y que termina al ser menor o igual a 3
      /*9.Escribir un programa en Java que imprima por pantalla los números del 1 al 9.*/  
        for(int i=1;i<=9;i++){//Se define el arreglo  inicializado en 1 hasta 9 en cada iteración se suma 1
            System.out.print(i+" ");}
      /*10.Escribir un programa en Java que imprima por pantalla los números del 1 al 10.000.Conveniente usar bucles.*/
        for(int i=1;i<=10000;i++){//Se define el arreglo  inicializado en 1 hasta 10000 en cada iteración se suma 1 y se imprime la variable auxiliar del ciclo
            System.out.println(i);}
      /*11.Escribir un programa en Java que imprima por pantalla los números del 5 al 10.*/  
       for(int i=5;i<=10;i++){//Se define el arreglo  inicializado en 5 hasta 10 en cada iteración se suma 1 y se imprime la variable auxiliar del ciclo
            System.out.print(i);}
       /*12.Escribir un programa en Java que imprima por pantalla los números del 5 al 15.*/
       for(int i=5;i<=15;i++){//Se define el arreglo  inicializado en 5 hasta 15 en cada iteración se suma 1 y se imprime la variable auxiliar del ciclo
            System.out.print(i);}
       /*13.Escribir un programa en Java que imprima por pantalla los números del 5 al 15.000.Conveniente usar bucles.*/
       for(int i=5;i<=15000;i++){//Se define el arreglo  inicializado en 5 hasta 15000 en cada iteración se suma 1 y se imprime la variable auxiliar del ciclo
            System.out.println(i);}
       /*14.Escribir un programa en Java que imprima 200 veces la palabra “hola”. Nota: en el
        código fuente que usted escriba debe figurar solamente una vez la palabra “hola”.*/       
       for(int i=1;i<=200;i++){//Se define el arreglo  inicializado en 1 hasta 200 en cada iteración se suma 1 y se imprime un hola en cada iteración hasta la terminación del ciclo
            System.out.println("hola");}
        /*15.Escribir un programa en Java que imprima por pantalla los cuadrados de los 30
        primeros números naturales.*/
        for(int i=1;i<=30;i++){//Se define un ciclo de 1 hasta 30
            Double cuadrado = Math.pow(i,2);//Se utliza la función Math.pow para realizar este proceso se tiene que definir la varible como un Double y el primer valor que toma es la  base y el segundo a cual exponente se realiza su potencia
            System.out.println(cuadrado);}//Imprime el resultado de cada iteración
        /*16.Escribir un programa en Java que multiplique los 20 primeros número naturales
        (1*2*3*4*5...).*/
        float counter = 1;//En este caso se utlizará una variable auxiliar dado que excede eel maximo valor de un int se opto por un float aunq ue tambien se pudo usar un long
        for(int i=1;i<=20;i++){//Se define el ciclo sobre los numeros mencionados de 1 a 20
            counter = counter*i;//Con la variable auxiliar se define de tal manera que sobre cada iteración ira multiplicando por el valor anterior al iniciar en 1 el primer valor serà 1*1 luego tomarà 1*2 y asi sucesivamente seguira el corrimiento hasta terminar el ciclo
            }
        System.out.println(counter);//Por ultimo imprime el valor resultante de la operación no se tomaron todos los valores 1 a 1 si asi se hubiera querido la impresión por consola se deberia haber llevado internamente en el ciclo
        /*17.Escribir un programa en Java que sume los cuadrados de los cien primeros números
        naturales, mostrando el resultado en pantalla.*/
        Double counter1;//Se inicializa una variable auxiliar si bien se intento con otro tipo de variables primitivas numericas solo permitio su correcto funcionamiento con el Double
        counter1 = 0D;
        for(int i=1;i<=100;i++){//Se coloca el rango que se usara en el ciclo siendo este de 1 a 100 por condiciones del problema
            Double cuadrado = Math.pow(i,2);//Ya se explico funcionamiento del Math pow anteriormente pero de manera basica se define la variable y en los argumentos de la funciòn el primero es la base y el segundo su potencia
            counter1 = counter1 + cuadrado;//Con la variable auziliar sobre cada iteración vamos redefiniendo su resultado siendo que se suma tanto el valor actual de la variable del ciclo elevado al cuadrado como los anteriores que sse halla acumulado
        }
        System.out.println(counter1);//Se imprime el resultado
        /*18.Escribir un programa en Java que lea un número entero desde teclado y realiza la
        suma de los 100 número siguientes, mostrando el resultado en pantalla.*/
        Scanner scanner = new Scanner(System.in);//Se define una variable para obtener los valores de entrada por consola
        int numero = scanner.nextInt();//Se utiliza el scanner para la captura de los datos digitados por el usuario
        int  counter2 = 0;//Variable auxiliar
        for(int i=0;i<=100;i++){//Define rango del ciclo
            int num3 = numero + i;//Se iniciliza una variable sobre cada ciclo de tal manera que sobre cada iteración se vaya tomando un nuevo valor dado que se necesitan los 100 numeros siguientes al numero digitados por el usuario
            counter2 = counter2 + num3; //Acumulativo sobre la variable auxiliar
        }
        System.out.println(counter);//Impresión del resultado
        /*19.Escribir un programa en Java que convierta de euros a dólares. Recibirá un número
        decimal correspondiente a la cantidad en euros y contestará con la cantidad
        correspondiente en dolares.*/
        System.out.println("Cuanto es el valor del Dolar al dia de hoy");
        float dolar = scanner.nextFloat();//Ingreso del valor del dolar
        System.out.println("Cuanto es el valor del Euro al dia de hoy");
        float Euro = scanner.nextFloat();//Ingreso del valor del Euro
        System.out.println("Cuantos dolares trajo");
        float CanDol = scanner.nextFloat();//Inbgreso de cantidad de dolares
        float division1 = dolar/Euro;//Se determina la equivalencia de cada dolar por 1 euro
        float solucion = CanDol * division1;//Se multiplica la cantidad de dolares por el equivalente entre un dolar y euro
        System.out.println("Su valor en Euros de la cantidad de dolares que trajo es: "+solucion);//Se imprime resultado
        /*A tener en cuenta dos cosas:
        1)La primera es que no se vuelve a definir el scanner por que ya se definio en ejemplos anteriores
        2)Se utilizo el colocar los valores en pesos del dolar y euro dado que estos son valores que varian en el mercado diariamente*/
        /*20.Escribir un programa en Java que calcule el área de un rectángulo del cual se le
        proporcionará por el teclado su altura y anchura (números decimales).*/
        System.out.println("Cual es la altura del rectangulo en metros");
        float altura = scanner.nextFloat();//Se ingresa valor altura
        System.out.println("Cual es el ancho del rectnagulo en metros");
        float ancho = scanner.nextFloat();//Ingreso valor ancho
        float area = altura * ancho;//El area de un rectangulo es igual a B*h
        System.out.println("El area del rectangulo es: "+area+" metros cuadrados");//Imprime resultado
        /*21.Escribir un programa en Java que lea dos números del teclado y diga cual es el
        mayor y cual el menor.*/
        System.out.println("Escriba el primer numero");
        int num1 = scanner.nextInt();//Ingresan numeros
        System.out.println("Escriba el segundo numero");
        int num2 = scanner.nextInt();//Ingreso numeros
        //Definidos los dos numeros simplemente procedemos a ejecutar casos que se pueden dar en el mismo siendo 3 los mostrados acontinuación:
        if(num1>num2){//Si el numero 1 es mayor al 2 entonces:
            System.out.println("El numero "+num1+" es mayor que "+num2);
        }else if(num2>num1){//Si no,si en numero 2 es mayor al 1 entonces: 
            System.out.println("El numero "+num2+" es mayor que "+num1);
        }else{//Si ninguno de los condicionales previos se cumple entonces:
            System.out.println("Los numeros "+num1+" y "+num2+" son el mismo numero");
        }
        /*22.Escribir un programa en Java que lea un número entero por el teclado e imprima
        todos los número impares menores que él.*/
        System.out.println("Escriba un numero");
        int num12 = scanner.nextInt();//Se toma el numero a evaluar
        int counter3;//Variable auxiliar
        for(int i=1;i<num12;i++){//Se toma como longitud de 1 hasta el numero digitado
            counter3 = i%2;//En este caso la variable axuliar se utilzara de tal manera que determine el modulo de cada valro dividido en 2 
            if (counter3!=0){//Esto para que se evalue en cada caso si es impar dado que si es distinto de 0 serà un numero impar
                System.out.println(i);}//Se imprimen los valores que cumplan la condición si no,no imprime nada
        }
        /*23.Implemente el algoritmo de Euclides para encontrar el gcd de dos número leídos
        desde teclado.*/
        System.out.println("Digite el pruimer numero");
        int num13 = scanner.nextInt();//Se obtiene el primer valor
        System.out.println("Digite el segundo numero");
        int num23 = scanner.nextInt();//Se obtiene el segundo valor
        //Se inicializan variables que más adelante se usaran
        int resto;
        int nummay;
        int nummen;
        int division2;
        if(num13>num23){//Se parte del hecho que son numeros distitos por lo cual se designa atraves de un if cual es el menor y mayor
                nummay = num13;
                nummen = num23;}
            else{
                nummay = num23;
                nummen = num13;
            }
        resto = nummay%nummen;division2 = nummay/nummen;//Esto se realiza para conocer los valores iniciales del algoritmo de euclides
        System.out.println(nummay+"/"+nummen+" es "+division2+" y su resto es "+resto);
        while(resto!=0){//Mientras no se cumpla la condición donde el modulo sea igual a 0 ejecutar lo siguiente
            nummay = nummen;//Se empiezan a reasignar los valores teniendo en cuienta que ya se llevo un poreso previo y deigual manera sobre cada vuelta del ciclo repetira los mismo pasos
            nummen = resto;
            resto = nummay%nummen;
            division2 = nummay/nummen;
            System.out.println(nummay+"/"+nummen+" es "+division2+" y su resto es "+resto);//Se va imprimiendo los valores de la divisiòn y modulo hasta llegar al modulo 0 qque sera cuando obtengamos nuestro gcd
        }
        System.out.println("El minimo comun multiplo entonces es: "+nummen);//Se toma el valor de nummen por como hicimos el algoritmo ya que si tomamos el utmimo valor del modulo serà y si tomamos la divisiòn sera la división de los dos ultimos numeros que no serà el valor correspondiente al gcd
        /*24.Escriba un programa que lea los coeficientes a, b y c de una ecuación de segundo, y
        estudie si tiene o no solución. En caso positivo, las soluciones se calcularán e
        imprimirán en pantalla.*/
        double num14 = scanner.nextDouble();//Se obtienen  los valores a b y c de la ecuaciòn cuadratica
        double num24 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double x12;
        double x22; 
        double praiz = Math.pow(num24,2)-(4*num14*num3);//Se secciona la parte que va dentro de la raiz en una ecuación cuadratica
        if(praiz>0){//Si es mayor a 0 entonces esta dentro de los numeros reales y por lo mismo se puede continuar con la operación
            x12 = ((-1*num24)+ Math.sqrt(praiz))/(2*num14);//Se obtienen los resultados de la operación tanto negativo como positivo
            x22 = ((-1*num24)- Math.sqrt(praiz))/(2*num14);
            System.out.println("Los resultados al evaluar la ecuación caudratica son: "+x12+" y "+x22);//Se imprimen los resultados
        }else{//Si no es mayor a 0 la respuesta no esta dada en los numeros reales por lo tanto:
            System.out.println("No se puede realizar la operación dado que el resultado no da para los numeros reales");}
        //25.1 Funcion Factorial
        System.out.println("Digite el numero al cual quiere conocer su factorial");
        int num15  = scanner.nextInt();//Se ingresa el numero
        int counter4=1;//Variable auxiliar inicializada en 1
        for(int i=1;i<=num1;i++){//longitud dada por el valor que se quiere utilizar
        counter4 = i * counter4 ;//El factorial es igual a 1*2...*n por lo mismo con una variable acumulativa empezamos a acumular el resultado previo y mulplicarlo por el nuevo en cada iteración
        }
        System.out.println("El factorial de  el numero "+num15+" es "+counter4);//Se imprime el resultado
        //26 capturar 3 numeros enteros pòsitivos y determninar cual es mayor y cual menor
        int nmen=0;//inicializamos dos variables auxiliares
        int nmay=0;
        for(int i=0;i<3;i++){//Ciclo corto donde se puede evaluar los numeros pedidos
        System.out.println("Digite el numero "+(i+1));
        int count = scanner.nextInt();//Se capturan lso numeros con una variable auxiliar
        if(i==0){//si i==0 eso quiere decir que es cuando no esta definido nigun numero por lo mismo el primer valor serà tanto el mayor como el menor
            nmen = count;
            nmay = count;}else if(count<nmen){//ahora si el nuevo numero inscrito es menor al guardado de manera previa en la variable de numero menor tomara este nuevo valor
                nmen=count;
            }
        if(count>nmay){//Lo mismo ocurre con el numero mayor
        nmay = count; }
        }
        System.out.println("El numero mayor es: "+nmay+"  y el numero menor es: "+nmen);//Se imprjme el resultado
        //27 Conversor de farenheit a celsius
        System.out.println("Digite la temperatura");//Se pide la temperatura en grados farenheit
        float tf = scanner.nextFloat();
        float tc = (5*(tf-32))/9;//conversor de grados farenheit a celcius
        if(tf>999 || tc>999){//tiene que cumplir con la condición mencionada donde no puede sobrepasar 999 grados ni farenheit ni celsius
            System.out.println("Es mayor a la temperatura permitida");//Si la temperatura es mayor a 999 entonces
                    }else{
            System.out.println("La temperatura medida en grados celcius es de: "+tc);}//Si no se da la respuesta a la conversión
        
        /*28Implemente una sentencia switch que escriba un mensaje en cada caso. Inclúyala en
        bucle de prueba for. Utilice también un break tras cada caso y pruébelo. Elimine el
        break y vea qué ocurre.*/
        for(int i=0;i<=3;i++){//Se colocaron las instrucciones del ciclo for
        switch(i){//Coloque como condicional el i dado que se podria hacer el recorrido sin intervensión y al igual ser podria observar aquello que se quiere evaluar
        case(1):
            System.out.println("El numero es: "+i);
            break;
        case(2):
            System.out.println("El numero es: "+i);
            break;
        case(3):
            System.out.println("El numero es: "+i);
            break;
        default:
            System.out.println("No lo conte");
            break;
                }//Con los break incluidos sale la respuesta esperada del ciclo
        }//Al no colocar los break daba la salida de cada caso pero con la respuesta del numero ubicado en i
    }
}
