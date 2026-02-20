15. ¿Cuáles son los tipos de datos primitivos en Java?
En Java existen 8 tipos de datos primitivos que almacenan valores simples directamente en memoria. Se dividen en cuatro grupos: los enteros (byte, short, int, long), los decimales (float, double), el tipo carácter (char), que representa un símbolo Unicode, y el tipo booleano (boolean), que solo puede ser true o false. Estos tipos no son objetos y se utilizan para manejar datos básicos de manera eficiente.

16. ¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en Java?
En Java, las estructuras de control deciden qué camino toma el código basándose en condiciones lógicas. Las más comunes son el if y el else, que funcionan como una bifurcación: si la condición entre paréntesis es verdadera, se ejecuta un bloque; de lo contrario, el programa salta al siguiente o ejecuta el bloque alternativo.
Cuando tienes muchas opciones basadas en una sola variable, el switch es más limpio que usar muchos if seguidos. Evalúa el valor de una variable (como un número o un texto) y salta directamente al "caso" que coincida. Es importante usar la palabra break al final de cada caso para que el programa no siga ejecutando los que vienen debajo por error.
Para repetir tareas se usan los bucles. 
El bucle for es ideal cuando sabes exactamente cuántas veces quieres repetir algo, ya que incluye un contador, una condición y un incremento en una sola línea este es el estándar para recorrer listas o realizar operaciones matemáticas repetitivas.
Los bucles while y do-while se usan cuando no sabes cuántas vueltas dará el código, sino que dependes de que algo cambie mientras se ejecuta. 

17. ¿Por qué es importante usar nombres significativos para variables y métodos?
Usar nombres significativos es fundamental porque el código se lee muchas más veces de las que se escribe. Un nombre claro como calcularSalarioNeto() permite entender la lógica al instante, mientras que algo como metodo1() nos obliga a perder tiempo analizando cada línea para adivinar su función.
Esto nos facilita enormemente el mantenimiento y la colaboración. Cuando regreses a tu proyecto en seis meses, o cuando un compañero deba revisarlo, los nombres descriptivos servirán como documentación interna. Esto reduce errores, evita comentarios innecesarios y hace que el flujo de trabajo sea mucho más ágil y profesional.

18. ¿Qué es la Programación Orientada a Objetos (POO)?
La programación orientada a objetos es una paradigma que organiza el código tipo en objetos que representan conceptos del mundo real.En lugar de ver el programa como una lista de pasos se le ve como un conjunto de partes que interactúan entre si.

19. ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos?
•	Abstracción: Consiste en identificar las características esenciales de un objeto y eliminar los detalles innecesarios. 
•	Encapsulamiento: Es el mecanismo que oculta los datos internos de un objeto y solo permite el acceso a través de métodos seguros. 
•	Herencia: Permite que una clase nueva (clase hija) adopte los atributos y métodos de una clase ya existente (clase padre). 
•	Polimorfismo: Es la capacidad de que una misma acción se comporte de manera distinta según el objeto que la realice.

 20. ¿Qué es la herencia en POO y cómo se utiliza en Java?
La herencia permite crear una estructura jerárquica donde una subclase hereda el comportamiento y los datos de una superclase. En Java, esto se logra con la palabra extends, facilitando que el código sea más limpio, organizado y fácil de mantener al evitar la duplicación de funciones comunes.

21. ¿Qué son los modificadores de acceso y cuáles son los más comunes en Java?
Los modificadores de acceso son palabras clave que definen qué partes de tu programa pueden ver o usar una clase, un método o una variable. 
Los cuatro niveles más comunes son:
•	Public: El elemento es accesible desde cualquier otra clase del proyecto. Es el nivel más abierto.
•	Private: El acceso está restringido únicamente a la clase donde fue declarado. Es ideal para proteger datos sensibles como atributos.
•	Protected: Permite el acceso a clases dentro del mismo paquete y a las subclases (herencia), incluso si están en paquetes diferentes.
•	Default (sin palabra clave): Si no escribes nada, el acceso es "de paquete". Solo las clases que están en la misma carpeta pueden verlo.

22. ¿Qué es una variable de entorno y por qué son importantes para Java o la
programación en general?
Una variable de entorno es un valor dinámico que el sistema operativo pone a disposición de todos los programas que se ejecutan en él.
En Java, la variable más importante es JAVA_HOME, esta le dice a la computadora y a las herramientas de desarrollo exactamente en qué carpeta está instalado el JDK. Sin ella, el comando java o javac podrían no funcionar correctamente desde la terminal.
Su importancia en la programación general radica en tres puntos clave:
•	Seguridad: Permiten guardar contraseñas o llaves de bases de datos fuera del código fuente, evitando que terminen por error en un repositorio público como GitHub.
•	Portabilidad: El mismo código puede comportarse distinto en "Desarrollo" que en "Producción" simplemente cambiando el valor de la variable de entorno, sin tocar una sola línea de lógica.
