#Training: Fragments + MVC

Este proyecto consiste de un `Activity` que posee un formulario de información básica
de una persona. Al actualizar el campo "Nombre", el título de la pantalla se actualiza con un saludo.

El proyecto no está bien estructurado: toda la responsabilidad está en `MainActivity`. Mejoremos la
estructura del mismo:

- Dejemos la responsabilidad del formulario en un `PersonFragment`. Este `Fragment`
utiliza un layout llamado `fragment_person.xml`
- Dentro de `PersonFragment`, guardar la información de cada campo en un DTO llamado
`Person`.
- Para hacer el formulario mas inteligente, asigna en los `EditText` los valores
correspondientes al DTO (ej: `first_name` tendría el valor de `person.getFirstName())`. Guíate por la
 asignación del texto de `firstNameEditText` en el `MainActivity` al comienzo del ejercicio.
- Al modificar el texto de cualquiera de los campos, actualizar el valor correspondiente del DTO.
Revisa la implementación del `TextWatcher` en el `MainActivity` al comienzo del ejercicio.
- Queremos que el título se siga actualizando al modificar el nombre. Sin embargo, como un
`Activity` tiene la responsabilidad de actualizar el contenido del título, implementa la
comunicación entre nuestro `PersonFragment` y nuestro `MainActivity` para modificar el título
cuando corresponda.
- Prueba rotar el dispositivo/emulador. ¡Perdimos la información del formulario! Para no volver a
molestar a nuestro cliente, asegurémonos que no perdamos la info al rotar la pantalla. No te olvides
de mantener el título del formulario!

##Extra
- Estamos permitiendo que un teléfono tenga letras y que una dirección de email no esté en el formato
correcto. Configura cada `EditText` para que el teclado limite el input al tipo de dato solicitado.
- Estaría bueno validar que la información es correcta. Agrega un botón que valide todos los campos.
Las condiciones de validación quedan a tu criterio, pero como mínimo los campos no deben estar vacíos.
- Al presionar el botón de validación, [muestra un mensaje de error](http://developer.android.com/reference/android/widget/TextView.html#setError%28java.lang.CharSequence%29)
para cada campo, así el usuario sabe cuál campo corregir
- Si la validación está bien, muestra un [Toast](http://developer.android.com/guide/topics/ui/notifiers/toasts.html)
con el mensaje de éxito que quieras.
