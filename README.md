# Java: Entendiendo la Orientacion a Objetos

#### La necesidad de abstraer el codigo repetitivo.

- La primera, si nosotros necesitamos optimizar ese método digamos, cambiar la lógica o algo, afectamos solamente nuestro método es válido y dejamos en funcionamiento formularios normal, igual que siempre y viceversa,
- La segunda razón es eso. Si necesitamos cambiar el comportamiento de nuestros formularios, no tenemos necesidad de intervenir en la validación del número del documento.

#### Algo que NO sea un signo de la programación procedural

Múltiples equipos trabajando en un solo proyecto.

- Para que varios equipos puedan trabajar en el mismo proyecto, es necesario que las responsabilidades de cada código estén bien definidas y claras, evitando conflictos al hacer cambios y evoluciones. El código con responsabilidades cohesivas es un signo del paradigma OO.

#### Lo que aprendimos

En esta clase conocimos el paradigma procedural, que se utilizó como práctica de programación antes de la introducción de lenguajes orientados a objetos. La necesidad de validar el numeroIdentidad en un formulario se utilizó como ejemplo para discutir los principales problemas que pueden aparecer en este paradigma.

En particular, a medida que otros formularios y desarrolladores necesitan la misma validación de numeroIdentidad, no fue fácil ver que ya había procedimientos y funciones que hicieron este trabajo, ya que los datos y las funciones no tenían un vínculo tan fuerte. Esto podría dar lugar a otra nueva función o fragmento de código con una responsabilidad similar.

Además, conocemos la idea central del paradigma orientado a objetos, que es crear unidades de código que combinen los datos asociados con cierta información con las funcionalidades aplicadas a esos datos (por ejemplo, numeroIdentidad + validación). Son los atributos y métodos.

### ¿Que es un objeto?

No es nada mas que la representacion de un conjunto de atributos que defiene alguna entidad de algun tipo.

Cuenta

- campo
  - saldo
  - agencia
  - numero
  - titular
- valor

### Instacias

Son ya las representaciones propiamente dichas de ese objeto que va a ser la cuenta, pero ya representando en sí un objeto en particular.

### Valores por defecto

Cuando un clase es instanciada con New Setea los valores de los artibutos a el valor default sea, null, 0, "".

### Referencias

Le asignamos valor a una variable
`variable = valor`

La variable es la referencia a el valor
Cuenta primeraCuenta = new Cuenta(); → Es la refencia al espacio en la memoria de new Cuenta();

En Java la variable es la referencia al valor

```java
public class TestReferencia {
public static void main(String[] args) {
Cuenta primeraCuenta = new Cuenta();
primeraCuenta.saldo = 200;

        Cuenta segundaCuenta = primeraCuenta; // → Como se hace por referencia al realizar un cambio de cualquiera de ellas va a afectar a la otra.

        segundaCuenta.saldo = 100;


        System.out.println(primeraCuenta.saldo);

    }

}

```

Java evalua la referencia de los objetos no el valor

## Metodos

En la programación orientada a objetos, definimos como método toda secuencia de pasos para realizar alguna cosa o alguna acción.

**Para retornar sin valor**

- public void nombreDelMetodo (atributos con declaracion int, double ...){}

**Para retornar algo**

- public nombreDelMetodo (atributos con declaracion int, double ...){}

## This

Es el contexto en el cual se esta haciendo la referencia

## Referencia a objetos

```java

 Cliente diego = new Cliente();
        diego.nombre = "Diego";
        diego.documento = "1231321";
        diego.telefono = "1232131231";

        Cuenta cuentaDeDiego = new Cuenta();

        cuentaDeDiego.agencia = 1;
        cuentaDeDiego.numero = 1;
        cuentaDeDiego.titular = diego;

/* Estos 2 son hacen referencia a el mismo objeto */
        System.out.println(cuentaDeDiego.titular);
        System.out.println(diego);

```

```java
public class Cuenta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;
}
```

_(si nos fijamos al instaciar cuentaDeDiego.titular le pasamos un referencia de 'diego' la cueal es una referencia de cliente,por lo tanto diego == a cuentaDeDiego.titular.)_

ie.

```java
  cuentaDeDiego.titular  = diego;
```

<br/>

Si yo imprimiera solamente el titular, yo estaría accediendo al objeto titular. Y si ustedes recuerdan, dado que titular referencia a un nuevo objeto cliente que está aquí, ya sabemos que todo nuevo objeto crea una ruta en la memoria de Java.

Entonces él me va a dar aquella referencia extraña, esa es la dirección de memoria en la cual está este titular Y Si yo imprimo directamente, directamente al objeto Diego es el mismo objeto al cual Java está haciendo referencia.

Por lo tanto, repasando los conceptos que ya aprendimos anteriormente, como es una referencia, cualquier cambio que yo haga aquí, va a reflejarse directamente en ese objeto que está dentro de titular y que a la vez está dentro del objeto cuenta.

## Valores null

null = no hay referencia, no hay valores en la memoria

```java
public class TestReferencia3 {
    public static void main(String[] args) {
        Cuenta cuentaDeDiego = new Cuenta();

        Cliente cliente = new Cliente();
        cuentaDeDiego.titular = cliente;

        System.out.println(cuentaDeDiego.titular.nombre);
    }
}
```

Cuando no se puede ingresar a el valor dentro de un objeto el error es: <br/>
_"(Exception in thread "main" java.lang.NullPointerException)"_

### Referencias de inicializacion

```java
public class Cuenta {
    double saldo;
    int agencia;
    int numero;
    Cliente newCliente();
}
```

↑↑ Lo anterior **NO** se puede realizar ya que siempre que sea llamado creara un nueva referecia a un nuevo objeto cliente siendo que aunque le pasemos un objeto cliente el siempre creara una nuevo.

**EN JAVA TODO ES REFERENCIAS**

el Cliente tendria una referencia a un nuevo cliente.

Como seria la forma correcta de hacerlo para asignar un valor por defecto

```java
public class Cuenta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular = newCliente();
}
```

## Metodos contructores

```java
public class Cuenta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Cuenta(){
        System.out.println("Aqui se crea una nueva cuenta");
/*
  En este metodo siendo un metodo constructor, podemos manipular el objeto desde su nacimiento, desde su concepción.
*/
    }
}
```

#### no sería más fácil usar setters y todo eso? Quizás sí. ¿Pero cuál es la ventaja de constructor?

El constructor te obliga a informar parámetros al momento del nacimiento del objeto. El constructor te fuerza a dar información para que este objeto sea creado, por lo tanto yo aquí puedo asegurarme que ninguna cuenta va a ser creada sin un número de **_agencia_** válido por ejemplo, lo cual es muy importante. Toda cuenta debe pertenecerle a una agencia. En el caso del setter es opcional, y aquí llega otro punto muy importante.

###### ¿Será que entonces seguimos necesitando el setter?

depende mucho del negocio qué métodos debíamos implementar. Pues en este caso tenemos que volver a tener en cuenta eso. Si yo ya le estoy informando la agencia aquí, ¿será que yo necesito aquel método set? ¿Será que yo debería poder cambiar la agencia en cualquier momento?

Por ejemplo, si yo le digo: "Bueno, puedo hacer transferencia de una cuenta entre varias agencias", el método set es totalmente válido. Ahora, si yo le dijera: "No, cada cuenta es creada para una agencia", y si esa cuenta quiere ser de otra agencia, ahí se crea otra cuenta nueva. Ahí ya no aplica este método. ¿Por qué?

Porque por regla del negocio yo no puedo editar la agencia. ¿Entonces qué tengo que hacer? Simplemente borro el setter, vengo aquí y elimino el método set.agencia. De esta forma nuestra información de agencia, nuestro campo agencia ya está totalmente aislado y solo es manipulable al momento de la creación del objeto en sí.

**Este es el poder del constructor. Nos fuerza, nos obliga a dar información para que nuestras reglas del negocio funcionen correctamente.**

## variables estaticas

- private static:
  la palabra reservada es static. Static lo que nos va a decir es que esta variable no va a ser de la instancia. Esta variable va a ser de la clase.

  Cuenta cuenta = new Cuenta(50);  
  clase ↑ --------- instacia↑

Static dice que no va a ser alterada por la instacia sino por la clase

```java
public class PruebaConstructor {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(50);
        Cuenta cuenta2 = new Cuenta(50);
        Cuenta cuenta3 = new Cuenta(50);

    }
}
```

Cuando se crea una variable estatica se dice que todas las intacias van a apuntar unicamente a ese espacio en memorica creado

```java
private static int total = 0;
```

esta variable, el **static**, te dice que en un lugar de la memoria va a ser creada esta variable total y todas las demás instancias que sean creadas a partir de esta clase van a apuntar aquí, solamente a esta variable total, porque es estática.

no puede ser accedida por la instancia sino es accedida a nivel de clase

Puedo llamar usando la clase si fue declarado con Static de no ser asi pertenecera a la instacia y **NO** ser podra llamar

Asi se crearian metodos de la clase y no de la instancia como los normales.

```Java
    private static int total = 0;

    public static int getTotal (){
        return total;
    }

//Desde la instancia ↓

  Cuenta cuenta = new Cuenta(50);
  System.out.println(Cuenta.getTotal());
```
