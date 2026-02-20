1.	¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?
R/un repositorio de git es un proyecto con memoria, historial y beneficios o pderes de control de versiones mientras un proyecto normal es solo una carpetade archivos.
2. ¿Cuáles son las tres áreas principales de Git (working directory, staging area/index y
repository) y qué papel cumple cada una?
R/ en wl working directory es como una sala de estar, todos se están moviendo despeinados y acomodándose, aquí es donde se hacen los cambios a los archivos.
Staging área es donde se selecciona solo los cambios que se quiere realizar usando git add.
Y el repository es donde los cambios se guardan en el historial del proyecto usando el git commit.
3. ¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag).
R/ blob-Contenido de archivo
Tree-estructura de carpetas y nombres
Commit- instantánea con autor y mensaje
Tag – una etiqueta con nombre para un commit.
4. ¿Cómo se crea un commit y qué información almacena un objeto commit?
R/ un commit se crea en dos pasos:
-preparar(git add) donde se seleccionan los archivos que se quieran incluir y esto mueve los archivos del working directory al Staging Area.
-Confirmar(git commit): aquí es donde se crea digamos así “la foto” oficial.
Un commites como un recibo detallado de una transacción ya que internamente git guarda un archivo de texto con los sgtes datos clave:
-identificador (Hash SHA-1): Un código único qe identifica ese commit si algo cambia el código cambia.
-referencia al tree: un puntero al objeto tree que representa la estructura de carpetas y archivos en ese preciso momento
-Autor y Commiter: Quien escribió el código y quien realizo el commit  junto con sus correos.
Timestamp: la fecha y hora exacta de la creación.
Mensaje de log: La descripción que escribiste para explicar el “porque” del cambio.

5. ¿Cuál es la diferencia entre git pull y git fetch?
•	Git fech descarga los cambios del servidor pero no toca tu código. 
•	Git pull descarga los cambios y los mezcla inmediatamente con los archivos.

7. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?
•	La rama es un nombre que apunta el ultimo commit de una línea de trabajo
•	El head es el puntero que indica en que rama se esta trabajando actualmente
•	El avance es cuando se hace un nuevo commit, la rama en la que esta se mueve automáticamente hacia adelnate para apuntar al nuevo commit.
9. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?
1. ¿Cómo se realiza?
Primero te ubicas en la rama que quieres que reciba los cambios (ej. main) y luego traes la otra :
•	git checkout main
•	git merge feature
2. ¿Qué conflictos pueden surgir?
Un conflicto ocurre cuando Git no sabe qué decisión tomar. Esto pasa principalmente cuando
Dos personas editaron la misma línea del mismo archivo con cosas distintas.
Alguien borró un archivo que otra persona estaba editando.


3. ¿Cómo se resuelven?
Cuando hay un conflicto, Git detiene el merge y marca los archivos afectados. Para arreglarlo.
Abrir el archivo: Verás marcas extrañas como estas:
Plaintext
<<<<<<< HEAD
Tu código actual (en main)
=======
El código que intentas traer (de feature)
>>>>>>> feature
Elegir: Borras las marcas (<<<<, ====, >>>>) y dejas el código final que desees (puedes dejar uno, el otro, o una mezcla de ambos).
Finalizar: Guardas el archivo y ejecutas:
git add <archivo> (para marcarlo como resuelto).
git commit (para cerrar la fusión).
>>>>>>>
8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?
Cuando se utiliza el git add, no se esta guardando una versión final sino que se esta marcando que archivos o que líneas especificas de código quiero que entren en el próximo commit. Si se intenta hacer el git commit sin haber realizado el git add antes, no se guardara nada, los cambios seguirán ahí, y si se crea un archivo nuevo git ni siquiera lo rastreara hasta que se agregue por primera vez.

9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?
El archivo .gitignore es un archivo de texto simple que le indica a Git qué archivos o carpetas debe ignorar por completo. Su función principal es evitar que archivos temporales, configuraciones personales o datos sensibles (como contraseñas) terminen en tu historial de versiones. Es como ponerle una "capa de invisibilidad" a ciertas partes de tu proyecto para que Git no te pregunte constantemente si quieres agregarlas.
Este archivo influye directamente en el flujo de trabajo porque altera el comportamiento del comando git add. Cuando un archivo coincide con una regla escrita en el .gitignore, Git lo trata como si no existiera para el sistema de seguimiento. 

10. ¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit?
La diferencia principal es si quieres corregir el pasado o seguir avanzando en la línea de tiempo de tu proyecto. Cuando haces un nuevo commit, estás añadiendo un eslabón más a la cadena, creando un bloque de historia independiente con su propio mensaje y su propia fecha. Es el flujo natural cuando terminas una tarea y empiezas la siguiente, dejando rastro de cada paso que diste.
En cambio, el comando git commit --amend sirve para "editar" el último commit que hiciste. En lugar de crear un nuevo eslabón, Git toma los cambios que tengas en el área de staging y los combina con el commit anterior, reemplazándolo por uno nuevo que contiene todo junto. Es la herramienta perfecta para cuando te das cuenta de que olvidaste añadir un archivo, cometiste una falta de ortografía en el mensaje o dejaste un error pequeño que no merece tener su propio espacio en el historial.

11. ¿Cómo se utiliza git stash y en qué escenarios es útil?
El comando git stash es como un estante temporal o un cajón donde puedes guardar rápidamente tus cambios actuales sin tener que hacer un commit. Su función principal es limpiar tu directorio de trabajo para que quede exactamente igual al último commit, pero sin perder el progreso que llevas. Cuando "stashed" algo, Git toma todos tus archivos modificados y los guarda en una pila interna, permitiéndote recuperarlos más tarde.

Es extremadamente útil en escenarios de interrupción. Imagina que estás a mitad de una nueva funcionalidad compleja, tienes código a medio escribir que aún no funciona y, de repente, surge un error crítico en producción que debes arreglar de inmediato. No puedes cambiar de rama porque tienes cambios sin guardar que causarían conflictos, y no quieres hacer un commit de "código roto" solo para limpiar la mesa. Aquí es donde usas git stash: guardas tu desorden, limpias la rama, arreglas el error en otra parte y, cuando terminas, regresas y recuperas tus cambios para seguir donde te quedaste.

12. ¿Qué mecanismos ofrece Git para deshacer cambios (por ejemplo, git reset, git revert, git checkout)?
Si subes una contraseña por error, el comando indicado es git reset --hard para borrar ese commit de tu historial local inmediatamente. Sin embargo, como el archivo ya estuvo en el sistema, lo más seguro es cambiar la contraseña (rotar credenciales), ya que Git guarda rastros incluso si borras el commit.
Para limpiar el historial de forma definitiva en el servidor, tendrías que usar herramientas más avanzadas como BFG Repo-Cleaner o git filter-repo. Estos comandos escanean todo el pasado de tu proyecto y eliminan cualquier rastro del archivo sensible en todas las ramas y commits anteriores.
Si el error solo está en tu computadora y no has subido nada a GitHub, con un git reset hacia el commit anterior es suficiente. Esto hará que el commit "maldito" desaparezca y puedas volver a trabajar como si nunca hubiera pasado, asegurándote de añadir el archivo con la contraseña al .gitignore antes de seguir.

13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?
Configurar un remoto es simplemente ponerle un apodo a una dirección de internet. El nombre origin es el que Git usa por defecto para tu propia copia en la nube (como tu cuenta de GitHub). Sirve para que no tengas que escribir la URL completa cada vez que quieras subir o bajar cambios.
Cuando haces un fork, básicamente clonas el proyecto de otra persona a tu cuenta. En este caso, se suele añadir un segundo remoto llamado upstream. Este apunta al autor original del código, permitiéndote recibir sus actualizaciones mientras tú trabajas en tu propia versión.
Para gestionar esto, usas git remote add upstream seguido del enlace del autor. Así, tu proyecto queda conectado a dos fuentes: la tuya para guardar tus avances y la original para no quedarte atrás con las novedades que ellos saquen.
Para mantener todo al día, primero descargas lo nuevo con git fetch upstream y luego lo unes a tu código con un merge. Es la forma estándar de colaborar en proyectos abiertos sin desordenar el trabajo de los demás.

14. ¿Cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git
diff, git show)?
Para ver qué ha pasado en tu proyecto, el comando principal es git log. Al ejecutarlo, verás una lista de todos los commits realizados, con su autor, la fecha y el mensaje descriptivo. Si la lista es muy larga y quieres algo más visual, puedes usar git log --oneline, que resume cada commit en una sola línea.
Si necesitas ver exactamente qué cambió en el código entre dos momentos, utilizas git diff. Este comando te muestra las líneas que se añadieron (en verde) y las que se borraron (en rojo). Es muy útil para revisar tus cambios antes de enviarlos al staging o para comparar dos ramas distintas.
Por último, si te interesa un commit específico, usa git show seguido del ID del commit. A diferencia del log general, este comando se enfoca en uno solo y te muestra tanto la información del autor como el contenido exacto de los archivos que se modificaron en esa entrega.




