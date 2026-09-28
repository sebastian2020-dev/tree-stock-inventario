# 🌳 Tree-Stock — Sistema de Inventario con Árbol Binario

## 🎯 Objetivo
Comprender e implementar el concepto de *árbol binario de búsqueda* aplicado a un sistema de inventario. Gestionar productos mediante inserción recursiva, recorrido ordenado y búsqueda eficiente.

## 🧩 Estructura del Proyecto
| Archivo | Descripción |
|---|---|
| Producto.java | Nodo: almacena ID, nombre y punteros izquierdo/derecho |
| ArbolInventario.java | Lógica: Insertar(), RecorridoInOrden(), Buscar() |
| Main.java | Interfaz: menú con opciones para el usuario |

## ⚙️ Cómo Ejecutar
1. Requiere *JDK* instalado
2. Abrir los 3 archivos en VS Code
3. Ejecutar Main.java
4. Usar el menú:
   - 1 → Registrar producto
   - 2 → Ver inventario ordenado
   - 3 → Buscar por ID
   - 0 → Salir

## 📸 Capturas de Ejecución

### Menú Principal
[Pega aquí tu captura]

### Registro de Productos
[Pega aquí tu captura]

### Inventario Ordenado
[Pega aquí tu captura]

### Búsqueda
[Pega aquí tu captura]

## 🎥 Video de Sustentación
[Pega aquí el enlace de tu video]

## 🧠 Explicación
- *Insertar (recursivo):* Compara el ID. Si es menor → rama izquierda; si mayor → rama derecha. Se repite hasta encontrar espacio vacío.
- *Recorrido InOrden:* Izquierda → Nodo → Derecha. Muestra los productos *ordenados automáticamente* por ID.
- *Buscar:* Sigue la misma lógica de comparación hasta encontrar el ID o llegar a un espacio vacío.
- *Punteros:* izquierdo y derecho conectan los nodos formando la estructura jerárquica del árbol.

---
Herramientas: VS Code + JDK Eclipse Temurin