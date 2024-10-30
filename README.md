
# Prueba Programación Andorid - Alberto Valera

**Link al Repositorio:** 

## Uso
1. Ejecuta la aplicación en un dispositivo Android o emulador.
2. Usa el menú principal para navegar entre las funcionalidades de gestión de tareas y lista de compras.

## Clases

### MainActivity
El punto de entrada principal de la aplicación. Proporciona navegación a diferentes actividades, incluyendo las pantallas de lista de tareas, registro de tareas y lista de compras.

### ListaTareasActivity
Gestiona la lista de tareas pendientes y completadas. Permite agregar nuevas tareas, marcarlas como hechas, y eliminarlas. Se comunica con `TareaAdapter` para mostrar las tareas en un `ListView`.

### RegistroTareasActivity
Proporciona un formulario para registrar nuevas tareas con detalles como título, descripción, fecha, prioridad y coste. Almacena los datos ingresados en el repositorio de tareas.

### ListadoTareasActivity
Muestra una lista de todas las tareas. Permite ver los detalles de cada tarea y filtrar las tareas según su estado (pendiente o completada).

### DetallesTareaActivity
Muestra los detalles de una tarea seleccionada, incluyendo título, descripción, fecha, prioridad y coste.

### ListaCompraActivity
Gestiona la lista de compras. Permite agregar productos con cantidad y precio, y muestra el coste total de todos los productos agregados.

### Tarea
Una clase de datos que representa una tarea. Incluye propiedades como título, descripción, fecha, prioridad y coste. También tiene métodos para gestionar el estado de la tarea (pendiente o completada).

### TareaAdapter
Un adaptador personalizado para mostrar tareas en un `ListView`. Maneja la visualización de cada tarea y se actualiza dinámicamente según el estado de cada tarea.

## Layouts

### activity_main.xml
Define el diseño del menú principal con botones para navegar a diferentes actividades, como la lista de tareas y la lista de compras.

### activity_lista_tareas.xml
Define el diseño para mostrar y gestionar la lista de tareas, incluyendo botones para agregar nuevas tareas y cambiar el estado de cada tarea.

### activity_registro_tareas.xml
Define el diseño para el formulario de registro de tareas. Incluye campos para ingresar el título, descripción, fecha, prioridad y coste de una nueva tarea.

### activity_listado_tareas.xml
Define el diseño para mostrar la lista completa de todas las tareas. Permite ver los detalles de las tareas y aplicar filtros.

### activity_detalles_tareas.xml
Define el diseño para mostrar los detalles completos de una tarea específica, incluyendo todas las propiedades ingresadas.

### activity_lista_compra.xml
Define el diseño para gestionar la lista de compras, permitiendo agregar productos con nombre, cantidad y precio, y mostrando el coste total de los productos.

### lista_item_tarea.xml
Define el diseño para los elementos individuales de tareas en la lista, mostrando detalles básicos como el título y el estado (pendiente o completada).

## Recursos

### colors.xml
Define los recursos de color utilizados en la aplicación, asegurando una interfaz visualmente coherente y atractiva.

### strings-español.xml
Define los recursos de cadena en español utilizados en la aplicación para proporcionar una experiencia de usuario en español.

### strings-ingles.xml
Define los recursos de cadena en inglés utilizados en la aplicación para proporcionar una experiencia de usuario en inglés.

### context_menu.xml
Define las opciones del menú contextual para la gestión de tareas, como opciones de edición, eliminación y cambio de estado de una tarea.


## Conclusión
La **Aplicación de Gestión de Tareas** ha sido diseñada y desarrollada para ofrecer una solución completa y fácil de usar para la organización de tareas y listas de compras. Con una interfaz intuitiva y funcional, la aplicación permite a los usuarios gestionar de manera efectiva sus actividades diarias y realizar un seguimiento de sus necesidades. Este proyecto demuestra un enfoque sólido en el uso de patrones de diseño, gestión de interfaz, y buenas prácticas en desarrollo Android, lo que ha permitido crear una aplicación que no solo es funcional, sino también escalable y de fácil mantenimiento.

## Objetivos Futuros
A medida que la aplicación continúa evolucionando, algunos de los objetivos futuros para mejorar y extender su funcionalidad incluyen:

1. **Sincronización en la nube**: Implementar la sincronización de datos con una base de datos en la nube (como Firebase) para que los usuarios puedan acceder a sus tareas desde múltiples dispositivos.
   
2. **Recordatorios y notificaciones**: Añadir notificaciones y recordatorios personalizados para tareas importantes y fechas límite.
   
3. **Soporte multilingüe**: Ampliar la traducción de recursos de la aplicación a otros idiomas para llegar a un público global.
   
4. **Filtrado y búsqueda avanzada**: Incorporar opciones avanzadas de filtrado y búsqueda para facilitar la organización y localización de tareas específicas.
   
5. **Interfaz de usuario mejorada**: Realizar mejoras en la interfaz para incluir temas personalizados y adaptabilidad a modo oscuro.

6. **Análisis de uso y estadísticas**: Agregar funciones de análisis para que los usuarios puedan ver estadísticas de productividad, como el número de tareas completadas semanalmente o el tiempo dedicado a cada actividad.

Estos objetivos contribuirán a crear una aplicación más completa y útil, brindando a los usuarios una experiencia de gestión de tareas personalizada y accesible.
