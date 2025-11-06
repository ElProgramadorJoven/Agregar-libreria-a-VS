## Getting Started

W# 🧩 Agregar librería `.jar` en Visual Studio Code (Ejemplo con MySQL)

Este proyecto muestra **cómo agregar una librería `.jar`** en **Visual Studio Code** paso a paso.  
Como ejemplo práctico, se utiliza la librería **MySQL Connector** para realizar una **conexión entre Java y una base de datos MySQL**.

---

## 🎯 Objetivo

Aprender a:
- Configurar un proyecto Java en Visual Studio Code.  
- Agregar librerías externas (`.jar`).  
- Conectarse a una base de datos MySQL usando JDBC.  
- Subir el proyecto a un repositorio en GitHub.  

---

## ⚙️ Requisitos previos

Antes de comenzar, asegúrate de tener instalado:

- **Java JDK 17** o superior  
- **Visual Studio Code**  
- Extensión **Extension Pack for Java** en VS Code  
  - **XAMPP**  
- Librería: https://dev.mysql.com/downloads/connector/j/

---

## 📦 Cómo agregar una librería `.jar` en Visual Studio Code

1. Crea tu proyecto Java en VS Code.  
2. Descarga el archivo `mysql-connector-java-x.x.x.jar` desde el sitio oficial de MySQL.  
3. Crea una carpeta llamada `lib` dentro del proyecto.  
4. Copia el archivo `.jar` dentro de esa carpeta.  
5. En VS Code, haz clic derecho sobre la carpeta `lib` → **"Add to Referenced Libraries"**.  
6. Verifica que el import funcione correctamente en tu código.

---

